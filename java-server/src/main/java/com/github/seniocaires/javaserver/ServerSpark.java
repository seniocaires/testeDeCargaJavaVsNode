package com.github.seniocaires.javaserver;

import static spark.Spark.init;
import static spark.Spark.get;

public class ServerSpark {

	public static void main(String[] args) {
		
		init();
		get("/status", (request, response) -> {
			response.status(200);
			return "OK";
		});
	}

}
