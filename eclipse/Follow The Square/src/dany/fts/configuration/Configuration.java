package dany.fts.configuration;

import java.util.HashMap;

import dany.fts.Instances;

public class Configuration
{
	private final HashMap<String, String> map = new HashMap<String, String>();
	
	public void parseConfiguration(String[] args)
	{
		for (String i : args)
		{
			String[] raw = i.split("=");
			String key = raw[0];
			String value = raw[1];
			map.put(key, value);
			Instances.logger.info("Configuration: '%s' set to '%s'", key, value);
		}
	}
	
	public String getString(String key)
	{
		return map.get(key);
	}
	
	public boolean getBoolean(String key)
	{
		return Boolean.parseBoolean(getString(key));
	}
	
	public int getInteger(String key)
	{
		return Integer.parseInt(getString(key));
	}
	
	public long getLong(String key)
	{
		return Long.parseLong(getString(key));
	}
}
