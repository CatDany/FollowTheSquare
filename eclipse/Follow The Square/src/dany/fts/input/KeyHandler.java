package dany.fts.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dany.fts.Instances;

public class KeyHandler implements KeyListener
{
	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
			Instances.keyActions.keyEscape();
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyTyped(KeyEvent e) {}
}