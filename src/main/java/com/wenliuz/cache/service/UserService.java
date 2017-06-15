package com.wenliuz.cache.service;


import com.wenliuz.cache.entity.User;

public interface UserService
{
	User getUsersByNameAndAge(String name, int age);

	User getAnotherUser(String name, int age);
}
