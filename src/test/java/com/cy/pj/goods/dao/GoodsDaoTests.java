package com.cy.pj.goods.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.goods.pojo.Goods;

@SpringBootTest
public class GoodsDaoTests {

	@Autowired
	private GoodsDao goodsDao;
	
	@Test
	public void testFindGoods() {
		List<Goods> goods=goodsDao.findGoods();
		for(Goods g:goods) {
			System.out.println(g);
		}
	}
	
	
}









