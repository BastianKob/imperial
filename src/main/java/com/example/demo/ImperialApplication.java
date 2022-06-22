package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SpringBootApplication
@RestController
public class ImperialApplication {

	public ImperialAPI imp = new ImperialAPI(0, 0,0);
	public static void main(String[] args) {
		SpringApplication.run(ImperialApplication.class, args);
	}

	@GetMapping("/")
	public String get(@RequestParam(name = "inches") double inches,@RequestParam(name = "inches") double yards){
		imp = new ImperialAPI(0, inches, yards);
		return imp.toString() + "<form>" +
				"  <label for=\"inches\">Inches:</label><br>\n" +
				"  <input type=\"number\" id=\"inches\" name=\"inches\" value=\"John\"><br>\n" +
				"  <label for=\"yards\">Yards:</label><br>\n" +
				"  <input type=\"number\" id=\"yards\" name=\"yards\" value=\"Doe\"><br><br>\n" +
				"  <input type=\"submit\" value=\"Submit\">" +
				"</form>";
	}

	@PostMapping("/")
	public int post(){
		return 0;
	}
}
