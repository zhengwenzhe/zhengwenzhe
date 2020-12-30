package com.fy.dao;

import java.util.List;

import com.fy.pojo.Link;

public interface LinkMapper {

	List<Link> list(Link link);
	
	int up(int ids[]);
	
	int count();
	
	int insert(Link link);
	
	int update(Link link);
	
	Link findById(int id);
	
}
