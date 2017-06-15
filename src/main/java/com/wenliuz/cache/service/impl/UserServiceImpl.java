package com.wenliuz.cache.service.impl;

import com.wenliuz.cache.entity.User;
import com.wenliuz.cache.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service("userService")
@Cacheable(value = "users")
public class UserServiceImpl implements UserService
{
	public User getUsersByNameAndAge(String name, int age)
	{
		System.out.println("--正在执行findUsersByNameAndAge()查询方法--");
		return new User(name, age);
	}
	public User getAnotherUser(String name, int age)
	{
		System.out.println("--正在执行findAnotherUser()查询方法--");
		return new User(name, age);
	}
}