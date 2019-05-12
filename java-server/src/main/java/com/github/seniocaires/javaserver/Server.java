package com.github.seniocaires.javaserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.net.httpserver.HttpServer;

public class Server {

	private static Logger logger = Logger.getLogger(Server.class.getName());
	private static HttpServer server;
	private static final int PORTA = 8080;
	public static void main(String[] args) throws IOException {
		server = HttpServer.create(new InetSocketAddress(PORTA), 0);
		logger.log(Level.INFO, "Servidor iniciado na porta " + PORTA);
		server.createContext("/status", new StatusHandler());
		server.setExecutor(null);
		server.start();
	}

}
