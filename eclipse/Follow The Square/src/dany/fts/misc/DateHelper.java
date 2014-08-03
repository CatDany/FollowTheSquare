package dany.fts.misc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper
{
	/**
	 * Formatting example:<br>
	 * yyyy-MM-dd HH:mm:ss<br>
	 * 2014-08-02 20:22:59
	 * @param format
	 * @return
	 */
	public static String getFormatedDate(String format)
	{
		long millis = System.currentTimeMillis();
		return getFormatedDate(format, millis);
	}
	
	/**
	 * Formatting example:<br>
	 * yyyy-MM-dd hh:mm:ss<br>
	 * 2014-08-02 20:22:59
	 * @param format
	 * @param millis
	 * @return
	 */
	public static String getFormatedDate(String format, long millis)
	{
		Date date = new Date(millis);
		DateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}
}
