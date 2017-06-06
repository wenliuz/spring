package com.wenliuz.component.autowired.dao.impl;

import com.wenliuz.component.autowired.dao.UserDao;
import com.wenliuz.component.autowired.entity.User;
import org.springframework.stereotype.Component;


@Component("userDao")
public class UserDaoImpl extends BaseDaoImpl<User>
	implements UserDao
{
}
