package com.wenliuz.component.autowired.dao.impl;

import com.wenliuz.component.autowired.dao.ItemDao;
import com.wenliuz.component.autowired.entity.Item;
import org.springframework.stereotype.Component;



@Component("itemDao")
public class ItemDaoImpl extends BaseDaoImpl<Item>
	implements ItemDao
{
}
