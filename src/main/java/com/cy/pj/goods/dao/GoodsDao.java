package com.cy.pj.goods.dao;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.cy.pj.goods.pojo.Goods;

@Mapper
public interface GoodsDao {

	  @Select("select * from tb_goods")
	  List<Goods> findGoods();
      
      @Delete("delete from tb_goods where id=#{id}")
      int deleteById(Long id);
}






