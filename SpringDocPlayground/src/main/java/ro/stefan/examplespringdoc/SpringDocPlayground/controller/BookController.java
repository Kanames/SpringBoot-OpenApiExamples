package ro.stefan.examplespringdoc.SpringDocPlayground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(description = "Book Store details that will appear in the UI", name = "Books store")
public class BookController {

	@GetMapping("/bookshop")
	@Operation(summary = "Get book store name")
	public String getBookShopName(@Parameter(in = ParameterIn.COOKIE) String cookie) {
		return "Stefan's books shop name";
	}
}
