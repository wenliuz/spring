package com.wenliuz.component.autowired.service.impl;

import com.wenliuz.component.autowired.entity.User;
import com.wenliuz.component.autowired.service.UserService;
import org.springframework.stereotype.Component;


@Component("userService")
public class UserServiceImpl extends BaseServiceImpl<User>
	implements UserService
{
}