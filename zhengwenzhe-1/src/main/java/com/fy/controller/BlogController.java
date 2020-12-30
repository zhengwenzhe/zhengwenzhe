package com.fy.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fy.pojo.Blog;
import com.fy.service.BlogService;
import com.fy.util.Result;
import com.github.pagehelper.PageInfo;

@RequestMapping("/blog")
@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;

	@RequestMapping("/list")
	public PageInfo<Blog> list(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize, Blog blog) {
		
		List<Blog> list = blogService.list(page,pageSize,blog);

		return new PageInfo<>(list);
	}
	
	@RequestMapping("/update_dels")
	public Result up(@RequestParam(name = "ids[]") int ids[]) {
		
		int row = blogService.up(ids);

		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/dim_list")
	public Result dim_list(Blog blog) {
		
		List<Blog> list = blogService.dim_list(blog);
		
		return new Result(Result.SUCCESS_CODE, "", list);
		
	}
	
	@RequestMapping("/add")
	public Result add(Blog blog) {
		
		blog.setCreate_time(new Date());
		
		blog.setUpdate_time(new Date());
		
		blog.setBlog_views(0);
		
		blog.setIs_deleted(0);
		
		int row = blogService.add(blog);
		
		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/findById")
	public Result findById(Blog blog) {
		
		List<Blog> list = blogService.findById(blog);
		
		blog.setBlog_views(list.get(0).getBlog_views()+1);
		
		blogService.edit_blog_views(blog);
		
		List<Blog> list1 = blogService.findById(blog);
		
		return new Result(Result.SUCCESS_CODE, "", list1);
		
	}
	
	@RequestMapping("/blog_edit")
	public Result blog_edit(Blog blog) {
		
		blog.setUpdate_time(new Date());
		
		int row = blogService.blog_edit(blog);
		
		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/findAllByDate")
	public Result findAllByDate() {
		
		List<Blog> list = blogService.findAllByDate();
		
		return new Result(Result.SUCCESS_CODE, "", list);
		
	}
	
	@RequestMapping("/mhcx")
	public PageInfo<Blog> mhcx(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize,Blog blog) {
		
		List<Blog> list = blogService.mhcx(page,pageSize,blog);
		
		return new PageInfo<>(list);
		
	}
	
	@RequestMapping("/getBlogCountGroup")
	public Result getBlogCountGroup() {
		
		List<Blog> list = blogService.getBlogCountGroup();
		
		return new Result(Result.SUCCESS_CODE, "", list);
		
	}
	
	@RequestMapping("/comment")
	public Result comment(Blog blog) {
		
		List<Blog> list = blogService.comment(blog);
		
		return new Result(Result.SUCCESS_CODE,"",list);
		
	}

	@RequestMapping("/tags")
	public PageInfo<Blog> tags(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize,Blog blog) {
		
		List<Blog> list = blogService.tags(page,pageSize,blog);
		
		return new PageInfo<>(list);
		
	}
	
	@RequestMapping("/count")
	public Result count() {
		
		int row = blogService.count();
		
		return new Result(Result.SUCCESS_CODE,"",row);
		
	}
	
	@RequestMapping("/list_enable_comment")
	public Result list_enable_comment(Blog blog) {
		
		List<Blog> list = blogService.list_enable_comment(blog);
		
		return new Result(Result.SUCCESS_CODE,"",list);
		
	}
	
	@RequestMapping("/list_status")
	public PageInfo<Blog> list_status(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize) {
		
		List<Blog> list = blogService.list_status(page,pageSize);

		PageInfo<Blog> info = new PageInfo<>(list);

		return info;
	}
	
	@RequestMapping("/cx_category_name")
	public PageInfo<Blog> cx_category_name(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize,Blog blog) {
		
		List<Blog> list = blogService.cx_category_name(page,pageSize,blog);
		
		PageInfo<Blog> info = new PageInfo<>(list);
		
		return info;
		
	}
	
}
