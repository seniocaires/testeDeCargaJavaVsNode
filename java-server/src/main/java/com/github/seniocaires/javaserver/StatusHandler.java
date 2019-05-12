package com.github.seniocaires.javaserver;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class StatusHandler implements HttpHandler {

	public void handle(HttpExchange httpExchange) throws IOException {
		String response = "OK";
		httpExchange.sendResponseHeaders(200, response.length());
		OutputStream os = httpExchange.getResponseBody();
		os.write(response.toString().getBytes());
		os.close();
	}
}
