package org.java201913.huitao_zhanggezuoye.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.java201913.huitao_zhanggezuoye.pojo.Brand;
import org.java201913.huitao_zhanggezuoye.pojo.Stylechild;
import org.java201913.huitao_zhanggezuoye.service.BrandService;
import org.java201913.huitao_zhanggezuoye.service.StyleChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("stylechild")
public class StyleChildController {

	@Autowired
	private StyleChildService scs;
	@Autowired
	private BrandService bs;
	@RequestMapping("showAll")
	public String showAll(int page,HttpServletRequest request){
		int pagesize=10;
		List<Stylechild> list=scs.showAll(page, pagesize);
		long counts=scs.counts();
		
		//查询品牌
		List<Brand> blist=bs.show();
		
		request.setAttribute("blist", blist);
		request.setAttribute("list", list);
		request.setAttribute("counts", counts);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("page", page);
		return "styleChild";
	}
	@RequestMapping("showByStcnamAndstBidAjax")
	@ResponseBody
	public Integer showByStcnamAndstBidAjax(Stylechild c){
		List<Stylechild> list=scs.showByStcnameAndStBid(c);
		if(list.isEmpty()){
			return 1;
		}
		return 0;
	}
	@RequestMapping("insert")
	public String insert(Stylechild c,int page){
		int i=scs.insert(c);
		return "rediret:/stylechild/showAll?page="+page;
	}
	@RequestMapping("delete")
	public String delete(long page,int id){
		int i=scs.delete(id);
		long counts=scs.counts();
		int pagesize=10;
		long pagecounts =counts%pagesize==0?(counts/pagesize):(counts/pagesize)+1;
		
		if(pagecounts<page){
			page=pagecounts;
		}
		return "redirect:/stylechild/showAll?page="+page;
	}
	
	@RequestMapping("update")
	public String  update(Stylechild c,int page){
		int i=scs.update(c);
		return "redirect:/stylechild/showAll?page="+page;
	}
	@RequestMapping("showBystBid")
	public List<Stylechild> showBystBid(int stBid){
		return scs.showBystBid(stBid);
	}
}
