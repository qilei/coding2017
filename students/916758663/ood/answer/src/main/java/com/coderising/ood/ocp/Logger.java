package com.coderising.ood.ocp;

public class Logger {

	private LogFormatter logFormatter;
	private LogHandler logHandler;

	public Logger(LogFormatter logFormatter, LogHandler logHandler) {
		this.logFormatter = logFormatter;
		this.logHandler = logHandler;
	}

	public void log(String msg){
		
		String logMsg = logFormatter.format(msg);
		logHandler.handle(logMsg);
	}
}

