package com.wenliuz.base.impl;

import com.wenliuz.base.Axe;
import org.springframework.stereotype.Component;


@Component
public class StoneAxe implements Axe
{
	public String chop()
	{
		return "石斧砍柴真慢";
	}
}