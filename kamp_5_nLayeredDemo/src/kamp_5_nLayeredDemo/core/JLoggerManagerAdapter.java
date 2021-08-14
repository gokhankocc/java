package kamp_5_nLayeredDemo.core;

import kamp_5_nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		JLoggerManager manger = new JLoggerManager();
		manger.log(message);
		
	}

}
