package com.fy.service;

import java.util.List;

import com.fy.pojo.Admin_User;
import com.fy.pojo.BlogConfig;

public interface Admin_User_Service {

	Admin_User login(Admin_User admin_user);
	
	List<BlogConfig> name_and_img();

	Admin_User findUserById(int admin_user_id);

	int edit(Admin_User admin_user);
	
	List<Admin_User> list_admin_user(Admin_User admin_user);
	
	int edit_admin_user(Admin_User admin_user);
	
}
