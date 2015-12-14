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
	private JTextArea firstTextArea;

	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		firstButton = new JButton("This button is a conversation starter!");
		firstTextField = new JTextField("Words should be typed here.");
		firstTextArea = new JTextArea(10, 20);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(firstTextArea);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextArea, 104, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -67, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 6, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -125, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -61, SpringLayout.EAST, this);
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}

	private void setupListeners()
	{
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				//changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
				//changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				//changeRandomColor();
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				//changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
				//changeRandomColor();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				if(moved.isAltDown())
				{
					changeRandomColor();
				}
				firstTextField.setText("Mouse X: " + moved.getX() + " Mouse Y: " + moved.getY() );
				if((Math.abs(moved.getX() - firstButton.getX()) < 5 && (Math.abs(moved.getY() - firstButton.getY()) < 5)))
				{
					firstButton.setLocation((int) (Math.random() * 400 ), (int) (Math.random() * 400));
				}
			}
			
			public void  mouseDragged(MouseEvent dragged)
			{
				//changeRandomColor();
			}
		});
		
	}
}
