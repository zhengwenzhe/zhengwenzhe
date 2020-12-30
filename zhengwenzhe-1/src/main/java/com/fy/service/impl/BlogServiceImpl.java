package com.fy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fy.dao.BlogMapper;
import com.fy.pojo.Blog;
import com.fy.service.BlogService;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogMapper blogMapper;
	
	@Override
	public List<Blog> list(int page, int pageSize, Blog blog) {
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		//排序
		PageHelper.orderBy("blog_id desc");
		return blogMapper.list(blog);
	}
	
	@Override
	public int up(int[] ids) {
		return blogMapper.up(ids);
	}
	
	@Override
	public int count() {
		return blogMapper.count();
	}

	@Override
	public List<Blog> dim_list(Blog blog) {
		PageHelper.orderBy("blog_id desc");
		return blogMapper.dim_list(blog);
	}

	@Override
	public int add(Blog blog) {
		return blogMapper.add(blog);
	}

	@Override
	public List<Blog> findById(Blog blog) {
		return blogMapper.findById(blog);
	}

	@Override
	public int blog_edit(Blog blog) {
		return blogMapper.blog_edit(blog);
	}

	@Override
	public List<Blog> findAllByDate() {
		return blogMapper.findAllByDate();
	}

	@Override
	public List<Blog> mhcx(int page, int pageSize,Blog blog) {
		
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		
		//排序
		PageHelper.orderBy("update_time desc");
		
		return blogMapper.mhcx(blog);
		
	}

	@Override
	public List<Blog> getBlogCountGroup() {
		PageHelper.orderBy("blog_views desc");
		return blogMapper.getBlogCountGroup();
	}

	@Override
	public int edit_blog_views(Blog blog) {
		return blogMapper.edit_blog_views(blog);
	}

	@Override
	public List<Blog> comment(Blog blog) {
		return blogMapper.comment(blog);
	}

	@Override
	public List<Blog> tags(int page, int pageSize,Blog blog) {
		
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		
		//排序
		PageHelper.orderBy("create_time desc");
		
		return blogMapper.tags(blog);
	}

	@Override
	public List<Blog> list_enable_comment(Blog blog) {
		return blogMapper.list_enable_comment(blog);
	}

	@Override
	public List<Blog> list_status(int page, int pageSize) {
		
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		
		//排序
		PageHelper.orderBy("create_time desc");
		
		return blogMapper.list_status();
		
	}

	@Override
	public List<Blog> cx_category_name(int page, int pageSize,Blog blog) {
		
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		
		//排序
		PageHelper.orderBy("create_time desc");
		
		return blogMapper.cx_category_name(blog);
		
	}
	
}
