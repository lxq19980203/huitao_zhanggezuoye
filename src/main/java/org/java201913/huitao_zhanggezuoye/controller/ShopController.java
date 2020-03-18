package org.java201913.huitao_zhanggezuoye.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.java201913.huitao_zhanggezuoye.pojo.Brand;
import org.java201913.huitao_zhanggezuoye.pojo.Shop;
import org.java201913.huitao_zhanggezuoye.service.BrandService;
import org.java201913.huitao_zhanggezuoye.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shop")
public class ShopController {

	@Autowired
	private ShopService ss;
	@Autowired
	private BrandService bs; 
	@RequestMapping("showall")
	public String showAll(int page,HttpServletRequest request){
		int pagesize=10;
		List<Shop> list =ss.showAll(page, pagesize);
		long counts=ss.counts();
		request.setAttribute("list", list);
		request.setAttribute("counts", counts);
		request.setAttribute("page", page);
		request.setAttribute("pagesize", pagesize);
		//查询品牌
		List<Brand> blist=bs.show();		
		request.setAttribute("blist", blist);
		return "shop";
	}
}
