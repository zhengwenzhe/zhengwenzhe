package com.fy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fy.dao.Blog_commentMapper;
import com.fy.pojo.Blog;
import com.fy.pojo.Blog_Comment;
import com.fy.service.Blog_CommentService;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class Blog_CommentServiceImpl implements Blog_CommentService{

	@Autowired
	private Blog_commentMapper blog_commentMapper;
	
	@Override
	public List<Blog_Comment> list(int page, int pageSize, Blog_Comment blog_comment) {
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		//排序
		PageHelper.orderBy("comment_id desc");
		return blog_commentMapper.list(blog_comment);
	}
	
	@Override
	public int up(int[] ids) {
		return blog_commentMapper.up(ids);
	}
	
	@Override
	public int count() {
		return blog_commentMapper.count();
	}
	
	@Override
	public int audit(int[] ids) {
		return blog_commentMapper.audit(ids);
	}

	@Override
	public int edit_comment(Blog_Comment blog_comment) {
		return blog_commentMapper.edit_comment(blog_comment);
	}

	@Override
	public List<Blog_Comment> list_comment(Blog_Comment blog_comment) {
		return blog_commentMapper.list_comment(blog_comment);
	}

	@Override
	public int add(Blog_Comment blog_comment) {
		return blog_commentMapper.add(blog_comment);
	}

	@Override
	public int countByBlogId(int blog_id) {
		return blog_commentMapper.countByBlogId(blog_id);
	}

	@Override
	public List<Blog> findByBlogId(int page, int pageSize,Integer blog_id) {
		PageHelper.startPage(page, pageSize);
		PageHelper.orderBy("reply_create_time desc");
		return blog_commentMapper.findByBlogId(blog_id);
	}
	
}
