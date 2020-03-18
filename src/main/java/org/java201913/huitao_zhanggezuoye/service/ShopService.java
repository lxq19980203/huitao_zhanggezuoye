package org.java201913.huitao_zhanggezuoye.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.java201913.huitao_zhanggezuoye.mapper.ShopMapper;
import org.java201913.huitao_zhanggezuoye.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {

	@Autowired
	private ShopMapper sm;
	public List<Shop> showAll(int page,int pagesize){
		RowBounds rb=new RowBounds((page-1)*pagesize,pagesize);
		return sm.showAll(rb);
	}
	public long counts(){
		return sm.countByExample(null);
	}
}
