package com.jfshare.productTask.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务
 * @author lilx
 * @createTime 2015年9月27日 下午2:18:37
 * @version 1.0
 * @remark 
 *
 */
public class ProductTaskStart {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/spring/spring-context.xml").start();
    }
}
