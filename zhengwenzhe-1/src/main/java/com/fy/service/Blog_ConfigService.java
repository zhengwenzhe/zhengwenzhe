package com.fy.service;

import java.util.List;

import com.fy.pojo.BlogConfig;


public interface Blog_ConfigService {

	List<BlogConfig> list();

	BlogConfig findByConfigName(String config_name);

	int edit(BlogConfig blogconfig);

	List<BlogConfig> findByConfigNames(String[] config_names);
	
}
