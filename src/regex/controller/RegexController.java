package regex.controller;

import regex.view.RegexView;
import regex.view.RegexFrame;

public class RegexController
{
	private RegexView myDisplay;
	private RegexFrame baseFrame;
	
	
	public RegexController()
	{
		myDisplay = new RegexView();
		baseFrame = new RegexFrame();
		
	}
	
	public void start()
	{
		
	}
	
	public RegexView getRegexView()
	{
		return myDisplay;
	}
	
	public RegexFrame getBaseFrame()
	{
		return baseFrame;
	}
}
