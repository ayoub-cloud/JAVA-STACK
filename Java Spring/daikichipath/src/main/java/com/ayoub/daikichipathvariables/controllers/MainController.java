package com.ayoub.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	  @RequestMapping("/travel/{city}")
      public String travel(@PathVariable("city") String city ) {
              return "Congradulation! You Will soon travel to "  +  city;
      }

	  
	  @RequestMapping("/lotto/{number}")
		public String lotto(@PathVariable("number") Integer number) {
			if(number % 2 == 0) {
				return "You will take a grand journey in the near future, but be weary of tempting offers...";
			}else {
				return "You have enjoyed the fruits of your labor, but now is best to spend time with family and friends.";
			}
}
}