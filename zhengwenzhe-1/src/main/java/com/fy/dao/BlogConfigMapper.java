package com.fy.dao;

import java.util.List;

import com.fy.pojo.BlogConfig;

public interface BlogConfigMapper {
	
	List<BlogConfig> list();

	BlogConfig findByConfigName(String config_name);

	int edit(BlogConfig blogconfig);

	List<BlogConfig> findByConfigNames(String[] config_names);

}
