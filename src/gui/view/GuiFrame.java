package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

public class GuiFrame extends JFrame
{
	private GuiController baseController;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}

}
