package com.fy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fy.dao.LinkMapper;
import com.fy.pojo.Link;
import com.fy.service.LinkService;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class LinkServiceImpl implements LinkService{

	@Autowired
	private LinkMapper linkMapper;
	
	@Override
	public List<Link> list(int page, int pageSize, Link link) {
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		//排序
		PageHelper.orderBy("link_rank desc");
		return linkMapper.list(link);
	}
	
	@Override
	public int up(int[] ids) {
		return linkMapper.up(ids);
	}
	
	@Override
	public int count() {
		return linkMapper.count();
	}
	
	@Override
	public int insert(Link link) {
		return linkMapper.insert(link);
	}
	
	@Override
	public int update(Link link) {
		return linkMapper.update(link);
	}
	
	@Override
	public Link findById(Integer id) {
		return linkMapper.findById(id);
	}

}
