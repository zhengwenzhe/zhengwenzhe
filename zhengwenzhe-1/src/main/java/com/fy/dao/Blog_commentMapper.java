package com.fy.dao;

import java.util.List;

import com.fy.pojo.Blog;
import com.fy.pojo.Blog_Comment;

public interface Blog_commentMapper {

	List<Blog_Comment> list(Blog_Comment blog_comment);
	
	int up(int ids[]);
	
	int count();
	
	int audit(int ids[]);
	
	int edit_comment(Blog_Comment blog_comment);
	
	List<Blog_Comment> list_comment(Blog_Comment blog_comment);

	int add(Blog_Comment blog_comment);
	
	int countByBlogId(int blog_id);

	List<Blog> findByBlogId(Integer blog_id);
	
}
