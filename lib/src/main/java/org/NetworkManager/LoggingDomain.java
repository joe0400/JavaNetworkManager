package org.NetworkManager;

import java.util.logging.Level;

public class LoggingDomain{
	public LoggingDomain(Level lvl, String dom){
		level = lvl;
		domain = dom;
	}
	public Level level = Level.INFO;
	public final String domain;
}
