package hipster.controller;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

public class HipsterController
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterController()
	{
		
	}

public void start()
{
	String myName = baseFrame.getResponse("What is your name?");
}
}