package dany.fts.render;

import java.awt.Color;

import javax.swing.JFrame;

import dany.fts.Instances;
import dany.fts.Refs;

public class Frame extends JFrame
{
	private static final long serialVersionUID = -8828270686060258254L;
	private final Screen screen = new Screen();

	public Frame()
	{
		setTitle(Refs.NAME);
		setSize(1280, 720);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setBackground(Color.WHITE);
		
		add(screen);
		
		addKeyListener(Instances.keyHandler);
	}
	
	public Screen screen()
	{
		return screen;
	}
}
