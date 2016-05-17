import com.jfshare.finagle.thrift.order.*;
import com.jfshare.finagle.thrift.pay.PayChannel;
import junit.framework.TestCase;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Client extends TestCase{

    private TTransport transport;
    private OrderServ.Client client;

    @Override
    public void setUp() throws Exception {

        transport = new TFramedTransport(new TSocket("localhost", 1986));

        TProtocol protocol = new TBinaryProtocol(transport);
        client = new OrderServ.Client(protocol);
        transport.open();
    }

    @Override
    public void tearDown(){
        transport.close();
    }

    /**
     * @throws Exception
     */

    public void testQueryOrderDetail() throws Exception {
        //商品id
        String orderId = "1571111";
        try {
            ////////////////////////////////////////////////////

            System.err.println(client.queryOrderDetail(1, 81, orderId));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if(transport!=null){
                transport.close();
            }
        }
    }


    public void testOrderProfileQuery() throws Exception {
        //商品id
        String orderId = "1";
        try {
            ////////////////////////////////////////////////////
            OrderQueryConditions conditions = new OrderQueryConditions();
            conditions.setSellerId(2);
            conditions.setOrderState(61);
            conditions.addToOrderIds("18120090");
            System.err.println(client.orderProfileQuery(2, 1, conditions));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if(transport!=null){
                transport.close();
            }
        }
    }


    public void testOrderProfileQueryBuyer() throws Exception {
        //商品id
        String orderId = "1";
        try {
            ////////////////////////////////////////////////////
            OrderQueryConditions conditions = new OrderQueryConditions();
            conditions.setUserId(1111);
            conditions.setCurPage(1);
            conditions.setCount(3);
            conditions.setOrderState(1);
            System.err.println(client.orderProfileQuery(2, 1, conditions));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if(transport!=null){
                transport.close();
            }
        }
    }


    public void testDeliver() throws Exception {
        //商品id
        String orderId = "1";
        try {
            ////////////////////////////////////////////////////
            DeliverInfo deliverInfo = new DeliverInfo();
            deliverInfo.setOrderId("1911111");
            deliverInfo.setUserId(1111);
            System.err.println(client.deliver(1000, deliverInfo));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if(transport!=null){
                transport.close();
            }
        }
    }



    public void testConfirmReceipt() throws Exception {
        //商品id
        String orderId = "3450002";
        try {
            System.err.println(client.confirmReceipt(1, 2, orderId));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(transport!=null){
                transport.close();
            }
        }
    }


    public void testCancelOrder() throws Exception {
        //商品id
        String orderId = "3450002";
        try {
            System.err.println(client.cancelOrder(1, 2, orderId, 9));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(transport!=null){
                transport.close();
            }
        }
    }


    public void testOrderStateQueryBuyer() throws Exception {
        //商品id
        String orderId = "1";
        try {
            ////////////////////////////////////////////////////
            OrderQueryConditions conditions = new OrderQueryConditions();
            conditions.setUserId(2);
//            conditions.setCurPage(1);
//            conditions.setCount(3);
//            conditions.setOrderState(1);
            System.err.println(client.orderStateQuery(2, 2, conditions));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if(transport!=null){
                transport.close();
            }
        }
    }





    public void testPayApply() throws Exception {
        try {
            PayParam payParam = new PayParam();
            List<String> orderIds = new ArrayList<String>();
            orderIds.add("11240067");
            payParam.setUserId(67);
            payParam.setOrderIdList(orderIds);
            PayChannel payChannel = new PayChannel();
            payChannel.setPayChannel(1);
            payParam.setPayChannel(payChannel);
            System.err.println(client.payApply(payParam));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (transport != null) {
                transport.close();
            }
        }
    }

    public void testPayState() throws Exception {
        try {
            PayState payState = new PayState();
            payState.setPayId("xxxxx");
            payState.setRetCode(2);
            payState.setCancelTime(1212121);
            System.err.println(client.payState(payState));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(transport!=null){
                transport.close();
            }
        }
    }
}
