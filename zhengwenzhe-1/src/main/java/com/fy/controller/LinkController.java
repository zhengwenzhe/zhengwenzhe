package com.fy.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fy.pojo.Link;
import com.fy.service.LinkService;
import com.fy.util.Result;
import com.github.pagehelper.PageInfo;

@RequestMapping("/link")
@RestController
public class LinkController {

	@Autowired
	private LinkService linkService;

	@RequestMapping("/list")
	public PageInfo<Link> list(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize, Link link) {
		
		List<Link> list = linkService.list(page,pageSize,link);

		return new PageInfo<>(list);
		
	}
	
	@RequestMapping("/update_dels")
	public Result up(@RequestParam(name = "ids[]") int ids[]) {
		
		int row = linkService.up(ids);

		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/count")
	public Result count() {
		
		int row = linkService.count();
		
		return new Result(Result.SUCCESS_CODE,"",row);
		
	}
	
	@RequestMapping("/insert")
	public int insert(Link link) {
		
		link.setCreate_time(new Date());
		
		return linkService.insert(link);
		
	}
	
	@RequestMapping("/update")
	public int update(Link link){
		
		return linkService.update(link);
		
	}
	
	@RequestMapping("/findById")
	public Link findById(@RequestParam(name="id")Integer id){
		
		return linkService.findById(id);
		
	}
	
}
