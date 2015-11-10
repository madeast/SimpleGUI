package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout; //For Layout

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
		this.add(firstButton);
		this.add(firstTextField);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{

	}
}
