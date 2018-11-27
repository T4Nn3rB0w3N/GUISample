package sample.view;

import sample.controller.GUIController;
import javax.swing.*;
import java.awt.Color;

public class SamplePanel extends JPanel
{
	private GUIController appController;
	private JButton colorButton;
	private JLabel textLabel;
	
	public SamplePanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		colorButton = new JButton("Click to change the color");
		textLabel = new JLabel("This is a color app");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
