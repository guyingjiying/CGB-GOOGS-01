package com.cy.pj.goods.service;
import java.util.List;
import com.cy.pj.goods.pojo.Goods;


public interface GoodsService {
	 List<Goods> findGoods();
	 /**
	  * 基于id执行商品记录的删除操作
	  * @param id
	  * @return
	  */
	 int deleteById(Long id);
}
