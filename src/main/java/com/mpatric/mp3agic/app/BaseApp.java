package com.mpatric.mp3agic.app;

public class BaseApp {

	protected String formatExceptionMessage(Exception e) {
		String message = "[" + e.getClass().getName();
		if (e.getMessage() != null) message += ": " + e.getMessage();
		message += "]";
		return message;
	}

	protected void printError(String message) {
		System.err.println(message);
	}

	protected void printOut(String message) {
		System.out.println(message);
	}
}
