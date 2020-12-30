package com.fy.dao;

import java.util.List;

import com.fy.pojo.Blog_Category;

public interface Blog_categoryMapper {
	
	List<Blog_Category> list(Blog_Category blog_category);
	
	int up(int ids[]);
	
	int count();
	
	int insert(Blog_Category blog_category);
	
	Blog_Category findById(int id);
	
	int update(Blog_Category blog_category);
	
	List<Blog_Category> findAll();

}
