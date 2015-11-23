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
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 53, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 36, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 0, SpringLayout.WEST, firstButton);
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
