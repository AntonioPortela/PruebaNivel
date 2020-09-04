package com.prueba.pruebanivel;

public class Response {

	// Atributos
	private final long id;
	private final String message;

	// Constructor
	public Response(long id, String message) {
		this.id = id;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public long getId() {
		return id;
	}

}
