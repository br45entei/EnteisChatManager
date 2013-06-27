package com.gmail.br45entei.enteischatmanager;

/**Created and manages chat channels.
 * @author <a href="http://enteisislandsurvival.no-ip.org/about/author.html">Brian_Entei</a>
 * @since 0.1
 */
public class Channels {
	public static String Public = "Public";
	public static String Ch1 = "Channel1";
	public static String Ch2 = "Channel2";
	public static String Administration = "Administration";
	public static String Console = "Console";
	
	/**Chat channels are defined here.
	 * @param str
	 * @return One of five channel strings that the parameter str equals, null otherwise.
	 * @since 4.8
	 */
	public static String Channel(String str) {
		if(str.equals(Public)) {
			return Public;
		} else if(str.equals(Ch1)) {
			return Ch1;
		} else if(str.equals(Ch2)) {
			return Ch2;
		} else if(str.equals("Admin") || str.equals(Administration)) {
			return Administration;
		}  else if(str.equals("!") || str.equals(Console)) {
			return Console;
		} else {
			return null;
		}
	}
}