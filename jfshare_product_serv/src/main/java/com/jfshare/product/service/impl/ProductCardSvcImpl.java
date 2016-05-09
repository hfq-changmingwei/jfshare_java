package com.jfshare.product.service.impl;

import com.jfshare.product.dao.mysql.IProductCardDao;
import com.jfshare.product.model.TbProductCard;
import com.jfshare.product.model.manual.ProductCardStatisticsModel;
import com.jfshare.product.service.IProductCartSvc;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Lenovo on 2016/4/28.
 */
@Service
public class ProductCardSvcImpl implements IProductCartSvc {

    @Resource
    private IProductCardDao productCardDao;

    @Override
    public List<TbProductCard> getProductCard(Map queryMap) {
        int num = Integer.parseInt(queryMap.get("num").toString());
        int lockNum = this.productCardDao.lockProductCard(queryMap);
        if(lockNum == 0) {
            // 没有可用的卡密
            return null;
        }
        // 如果锁定的数量小于获取个数
        if(lockNum < num) {
            // 卡密数量不够，释放锁定的卡密
            this.productCardDao.releaseProductCard(queryMap);
            return null;
        }
        List<TbProductCard> productCardList = this.productCardDao.selectAvailableCard(queryMap);
        return productCardList;
    }

    @Override
    public List<TbProductCard> queryProductCard(Map queryMap) {
        List<TbProductCard> productCardList = this.productCardDao.selectAvailableCard(queryMap);
        return productCardList;
    }

    @Override
    public int statisticsProductCardCount(Map queryMap) {

        return this.productCardDao.statisticsProductCardCount(queryMap);
    }

    @Override
    public List<ProductCardStatisticsModel> statisticsProductCard(Map queryMap) {

        return this.productCardDao.statisticsProductCard(queryMap);

    }

    @Override
    public int queryProductCardViewListCount(Map queryMap) {
        return this.productCardDao.queryProductCardViewListCount(queryMap);
    }

    @Override
    public List<TbProductCard> queryProductCardViewList(Map queryMap) {
        return this.productCardDao.queryProductCardViewList(queryMap);
    }

    @Override
    public int useProductCard(TbProductCard productCard) {
        return this.productCardDao.useProductCard(productCard);
    }
}