package com.fy.service;

import java.util.List;

import com.fy.pojo.Link;

public interface LinkService {

	List<Link> list(int page, int pageSize, Link link);
	
	int up(int ids[]);
	
	int count();

	int insert(Link link);
	
	int update(Link link);
	
	Link findById(Integer id);
	
}
