package com.wenliuz.base.impl;

import com.wenliuz.base.Axe;
import org.springframework.stereotype.Component;


@Component
public class SteelAxe implements Axe
{
	public String chop()
	{
		return "钢斧砍柴真快";
	}
}