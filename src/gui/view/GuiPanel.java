package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GuiPanel extends JPanel
{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not push me!!");
		firstTextField = new JTextField("Words should be typed here.");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}

