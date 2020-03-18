package org.java201913.huitao_zhanggezuoye.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.java201913.huitao_zhanggezuoye.pojo.Admin;
import org.java201913.huitao_zhanggezuoye.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminService as;
	
	//ajax验证登录  0否 1是 ——只负责验证，不是正式登录
	@RequestMapping("loginAjax")
	@ResponseBody
	public Integer loginAjax(Admin a){
		System.out.println(a.getAdPass());
	   	List<Admin> list =as.login(a);
		if(list.isEmpty()){
			 return 0;
		}else{
			return 1;
		}
	}
	
	
	//用于跳转的登录方法
	@RequestMapping("login")
	public String login(Admin a,HttpSession session){
	   	List<Admin> list =as.login(a);
	   	//session存储登录信息的
	   	session.setAttribute("admin", list.get(0));
	   	//跳转走
	   	return "redirect:/brand/showall?page=1";
	}
}
