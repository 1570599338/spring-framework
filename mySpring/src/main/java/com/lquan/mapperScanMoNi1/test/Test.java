package com.lquan.mapperScanMoNi1.test;/**
 * Created by 01370602 on 2020/4/26.
 */

import com.lquan.mapperScanMoNi1.config.AppConfig;
import com.lquan.mapperScanMoNi1.dao.CardDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName Test
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CardDao cardDao = (CardDao) annotationConfigApplicationContext.getBean("cardDao");
		cardDao.list("liuquan");

		annotationConfigApplicationContext.close();

	}
}
