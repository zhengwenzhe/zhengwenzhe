package com.fy.service;

import java.util.List;

import com.fy.pojo.Blog;

public interface BlogService {

	List<Blog> list(int page, int pageSize,Blog blog);
	
	int up(int ids[]);
	
	int count();

	List<Blog> dim_list(Blog blog);
	
	int add(Blog blog);
	
	List<Blog> findById(Blog blog);
	
	int blog_edit(Blog blog);
	
	List<Blog> findAllByDate();
	
	List<Blog> mhcx(int page, int pageSize,Blog blog);
	
	List<Blog> getBlogCountGroup();
	
	int edit_blog_views(Blog blog);
	
	List<Blog> comment(Blog blog);
	
	List<Blog> tags(int page, int pageSize,Blog blog);
	
	List<Blog> list_enable_comment(Blog blog);
	
	List<Blog> list_status(int page, int pageSize);
	
	List<Blog> cx_category_name(int page, int pageSize,Blog blog);
	
}
