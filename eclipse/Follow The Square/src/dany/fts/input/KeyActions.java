package dany.fts.input;

import dany.fts.Game;

public class KeyActions
{
	public void keyEscape()
	{
		Game.instance().stop();
	}
}