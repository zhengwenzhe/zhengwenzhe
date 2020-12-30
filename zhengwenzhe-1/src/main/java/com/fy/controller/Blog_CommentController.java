package com.fy.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fy.pojo.Blog;
import com.fy.pojo.Blog_Comment;
import com.fy.service.Blog_CommentService;
import com.fy.util.Result;
import com.github.pagehelper.PageInfo;

@RequestMapping("/blog_comment")
@RestController
public class Blog_CommentController {

	@Autowired
	private Blog_CommentService blog_commentService;

	@RequestMapping("/list")
	public PageInfo<Blog_Comment> list2(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize, Blog_Comment blog_comment) {
		
		List<Blog_Comment> list = blog_commentService.list(page,pageSize,blog_comment);

		return new PageInfo<>(list);
		
	}
	
	@RequestMapping("/update_dels")
	public Result up(@RequestParam(name = "ids[]") int ids[]) {
		
		int row = blog_commentService.up(ids);

		return new Result(Result.SUCCESS_CODE, "", row);
	}
	
	@RequestMapping("/count")
	public Result count() {
		
		int row = blog_commentService.count();
		
		return new Result(Result.SUCCESS_CODE,"",row);
		
	}
	
	@RequestMapping("/edit_comment")
	public Result edit_comment(Blog_Comment blog_comment) {
		
		blog_comment.setReply_create_time(new Date());
		
		int row = blog_commentService.edit_comment(blog_comment);
		
		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/list_comment")
	public Result list_comment(Blog_Comment blog_comment) {
		
		List<Blog_Comment> list = blog_commentService.list_comment(blog_comment);

		return new Result(Result.SUCCESS_CODE, "", list);
		
	}
	
	@RequestMapping("/plsh")
	public Result audit(@RequestParam(name = "ids[]") int ids[]) {
		
		int row = blog_commentService.audit(ids);

		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/add")
	public Result add(Blog_Comment blog_comment) {
		
		blog_comment.setComment_create_time(new Date());
		
		int row = blog_commentService.add(blog_comment);

		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/countByBlogId")
	public Result countByBlogId(int blog_id) {
		
		int count=blog_commentService.countByBlogId(blog_id);
		
		return new Result(Result.SUCCESS_CODE, "", count);
		
	}
	
	@RequestMapping("/findByBlogId")
	public PageInfo<Blog> findByBlogId(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize, Integer blog_id) {

		List<Blog> list = blog_commentService.findByBlogId(page,pageSize,blog_id);

		PageInfo<Blog> info = new PageInfo<>(list);

		return info;
	}
	
}
