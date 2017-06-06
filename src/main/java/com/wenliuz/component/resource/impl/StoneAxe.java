package com.wenliuz.component.resource.impl;

import com.wenliuz.component.resource.Axe;
import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe
{
	public String chop()
	{
		return "石斧砍柴真慢";
	}
}