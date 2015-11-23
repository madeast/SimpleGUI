package gui.view;

import gui.controller.GuiController;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class GuiPanel extends JPanel
{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;

	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		firstButton = new JButton("Don't push me, cause I'm close to the edge!");
		firstTextField = new JTextField("Words should be typed here.");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseReleased(MouseEvent released)
			{
				
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				
			}
			
			public void mouseExited(MouseEvent exited)
			{
				
			}
		});
		
	}
}
