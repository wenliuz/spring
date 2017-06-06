package com.wenliuz.component.resource.impl;


import com.wenliuz.component.resource.Axe;
import org.springframework.stereotype.Component;

@Component
public class SteelAxe implements Axe
{
	public String chop()
	{
		return "钢斧砍柴真快";
	}
}