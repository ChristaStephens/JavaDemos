package JavaProjects.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectsController {

	
	@RequestMapping("/")
	public ModelAndView index() {
		// will handle the home/index html page

		//overloaded 1st is jsp, 2nd is expressions and 3rd is value of expression
		return new ModelAndView("index");

	}
}
