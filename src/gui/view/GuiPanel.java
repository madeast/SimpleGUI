package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;

public class GuiPanel extends JPanel
{
	private GuiController baseController;
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		
	}
}
