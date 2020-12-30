package com.fy.service;

import java.util.List;

import com.fy.pojo.Blog;
import com.fy.pojo.Blog_Comment;

public interface Blog_CommentService {
	
	List<Blog_Comment> list(int page, int pageSize, Blog_Comment blog_comment);
	
	int up(int ids[]);
	
	int count();
	
	int audit(int ids[]);
	
	int edit_comment(Blog_Comment blog_comment);
	
	List<Blog_Comment> list_comment(Blog_Comment blog_comment);

	int add(Blog_Comment blog_comment);
	
	int countByBlogId(int blog_id);

	List<Blog> findByBlogId(int page, int pageSize,Integer blog_id);
	
}
