package org.java201913.huitao_zhanggezuoye.service;

import java.util.List;

import org.java201913.huitao_zhanggezuoye.mapper.AdminMapper;
import org.java201913.huitao_zhanggezuoye.pojo.Admin;
import org.java201913.huitao_zhanggezuoye.pojo.AdminExample;
import org.java201913.huitao_zhanggezuoye.pojo.AdminExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
   private AdminMapper am;
   
   public List<Admin>  login(Admin a){
	   AdminExample ae=new AdminExample();
	   Criteria c =ae.createCriteria();
	   c.andAdNameEqualTo(a.getAdName());
	   c.andAdPassEqualTo(a.getAdPass());
	   return am.selectByExample(ae);
   }
}
