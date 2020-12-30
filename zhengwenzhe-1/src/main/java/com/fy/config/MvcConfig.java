package com.fy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fy.interceptor.LoginInterceptor;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		 //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
        registration.addPathPatterns("/**");//所有路径都被拦截
        registration.excludePathPatterns("/backstage/login.html");//排除登陆页面
        registration.excludePathPatterns("/layui/**");
        registration.excludePathPatterns("/css/**");
        registration.excludePathPatterns("/jquery-3.5.1/**");
        registration.excludePathPatterns("/js/**");
        registration.excludePathPatterns("/templates/**");
        registration.excludePathPatterns("/img/**");
        
        //登陆方法
        registration.excludePathPatterns("/user/login");
        registration.excludePathPatterns("/user/exit");
        
        //index.html
        registration.excludePathPatterns("/config/list");
        registration.excludePathPatterns("/config/findByConfigName");
        registration.excludePathPatterns("/blog_tag/findAll");
        registration.excludePathPatterns("/blog/findAllByDate");
        registration.excludePathPatterns("/blog/getBlogCountGroup");
        registration.excludePathPatterns("/blog/list_status");
        registration.excludePathPatterns("/config/findByConfigNames");
        registration.excludePathPatterns("/blog/mhcx");
        registration.excludePathPatterns("/blog/tags");
        registration.excludePathPatterns("/blog/cx_category_name");
        
        //details.html
        registration.excludePathPatterns("/blog_comment/countByBlogId");
        registration.excludePathPatterns("/blog_comment/findByBlogId");
        registration.excludePathPatterns("/blog/findById");
        registration.excludePathPatterns("/blog/comment");
        registration.excludePathPatterns("/blog/list_enable_comment");
        registration.excludePathPatterns("/blog_comment/add");
        
        //blogroll.html
        registration.excludePathPatterns("/link/list");
        
        //about.html
        registration.excludePathPatterns("/link/list");
        
        registration.excludePathPatterns("/error");
	}

}
