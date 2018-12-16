/**
 * 
 */
package com.moltra.appEngineTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Molter
 *
 */
@RestController
public class WeatherController {
	@Autowired
	private WeatherRepository repository;
	/**
	 * Maps "/" to a simple welcome message.
	 * Created to test that the application is running
	 * on the server in a simple way
	 * @return a String with a welcome message
	 */
	@RequestMapping("/")
	public String welcome() {
		return "<h1>Welcome to the star trek weather service</h1>";
	}
	
	@RequestMapping("/weather")
	public Weather weather(@RequestParam(name="day", required=true) Long day) {
		return repository.findById(day).get();
	}
	
}
