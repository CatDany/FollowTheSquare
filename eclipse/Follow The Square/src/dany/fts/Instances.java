package dany.fts;

import dany.fts.input.KeyActions;
import dany.fts.input.KeyHandler;
import dany.fts.logging.SimpleLogger;

public class Instances
{
	public static final KeyHandler keyHandler = new KeyHandler();
	public static final KeyActions keyActions = new KeyActions();
	public static final SimpleLogger logger = new SimpleLogger(Refs.ID, Refs.LOG_FILE);
}
