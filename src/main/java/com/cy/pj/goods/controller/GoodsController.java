package com.cy.pj.goods.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;

@Controller
@RequestMapping("/goods/")
public class GoodsController {

	 @Autowired
	 private GoodsService goodsService;
	 
	 @RequestMapping("doGoodsUI")
	 public String doGoodsUI() {
		 return "goods-ajax-jquery";
		 //return "goods-ajax";
	 }
	 //@ResponseBody注解用于告诉服务端spring mvc
	 //将返回的对象转换为json格式字符串
	 @RequestMapping("doFindObjects")
	 @ResponseBody
	 public List<Goods> doFindObjects(Integer page){
		 System.out.println("page="+page);
		 return goodsService.findGoods();
	 }//Spring MVC 默认调用Jackson API将对象转换为JSON串
	 
	 @RequestMapping("doDeleteById")
	 public String doDeleteById(Long id) {
		 goodsService.deleteById(id);
		 return "redirect:doFindGoods";
	 }
	 
	 @RequestMapping("doFindGoods")
	 public String doFindGoods(Model model) {
		 model.addAttribute("list",
				 goodsService.findGoods());
		 return "goods";//templates/pages/goods.html
	 }
}








