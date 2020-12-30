package com.fy.dao;

import java.util.List;

import com.fy.pojo.Blog;

public interface BlogMapper {

	List<Blog> list(Blog blog);
	
	int up(int ids[]);
	
	int count();
	
	List<Blog> dim_list(Blog blog);
	
	int add(Blog blog);
	
	List<Blog> findById(Blog blog);
	
	int blog_edit(Blog blog);
	
	List<Blog> findAllByDate();
	
	List<Blog> mhcx(Blog blog);
	
	List<Blog> getBlogCountGroup();
	
	int edit_blog_views(Blog blog);
	
	List<Blog> comment(Blog blog);
	
	List<Blog> tags(Blog blog);
	
	List<Blog> list_enable_comment(Blog blog);
	
	List<Blog> list_status();
	
	List<Blog> cx_category_name(Blog blog);

}
