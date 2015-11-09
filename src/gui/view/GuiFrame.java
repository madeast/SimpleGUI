package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

public class GuiFrame extends JFrame
{
	private GuiController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new GuiPanel(baseController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); // Must be first line of setupFrame - Installs the panel in the frame.
		this.setSize(400,400); //Find a good size for the app.
		this.setTitle("Simple Gui!!");
		this.setResizable(false); //advisable not required.
		this.setVisible(true); // Must be last line of setupFrame!
	}
	
	public GuiController getBaseController()
	{
		return baseController;
	}

}
