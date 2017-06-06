package com.wenliuz.component.autowired.service.impl;

import com.wenliuz.component.autowired.entity.Item;
import com.wenliuz.component.autowired.service.ItemService;
import org.springframework.stereotype.Component;


@Component("itemService")
public class ItemServiceImpl extends BaseServiceImpl<Item>
	implements ItemService
{
}