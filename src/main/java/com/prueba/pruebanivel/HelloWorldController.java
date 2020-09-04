package com.prueba.pruebanivel;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// Declaro el contador
	private final AtomicLong counter = new AtomicLong();

	// Realizo la llamada
	@GetMapping("/world")
	public Response response() {
		Response response = new Response(counter.incrementAndGet(), "Hello world");
		return response;
	}
}
