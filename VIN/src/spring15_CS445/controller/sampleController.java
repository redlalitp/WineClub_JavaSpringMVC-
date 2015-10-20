package spring15_CS445.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class sampleController {

	 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	 public String getGreeting(@PathVariable String name) {
	  String result="Hello "+name; 
	  return result;
	 }
}


