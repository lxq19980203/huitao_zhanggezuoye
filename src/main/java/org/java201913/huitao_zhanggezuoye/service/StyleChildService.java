package org.java201913.huitao_zhanggezuoye.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.java201913.huitao_zhanggezuoye.mapper.StylechildMapper;

import org.java201913.huitao_zhanggezuoye.pojo.Stylechild;
import org.java201913.huitao_zhanggezuoye.pojo.StylechildExample;
import org.java201913.huitao_zhanggezuoye.pojo.StylechildExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StyleChildService {
	@Autowired
	private StylechildMapper scm;
	
	public List<Stylechild> showAll(int page,int pagesize){
		RowBounds rb =new RowBounds((page-1)*pagesize,pagesize);
		return scm.showAll(rb);
	}
	public long counts(){
	   return scm.countByExample(null);
	}
	public List<Stylechild> showByStcnameAndStBid(Stylechild sc){
		StylechildExample sce =new StylechildExample();
		Criteria c=sce.createCriteria();
		c.andStcnameEqualTo(sc.getStcname());
		c.andStBidEqualTo(sc.getStBid());
		return scm.selectByExample(sce);
	}
	public int insert(Stylechild sc){
		return scm.insertSelective(sc);
	}
	public int delete(int id){
		return scm.deleteByPrimaryKey(id);
	}
	public int update(Stylechild sc){
		return scm.updateByPrimaryKeySelective(sc);
	}
	public List<Stylechild> showBystBid(int stBid){
		StylechildExample sce =new StylechildExample();
		Criteria c =sce.createCriteria();
		c.andStBidEqualTo(stBid);
		return scm.selectByExample(sce);
		
	}
}
