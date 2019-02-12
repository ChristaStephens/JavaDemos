package JavaProjects.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectsController {

	
	@RequestMapping("/")
	public ModelAndView index() {
		// will handle the home/index html page

		//overloaded 1st is jsp, 2nd is expressions and 3rd is value of expression
		return new ModelAndView("index", "reverse", reverse());

	}
	
	public static  String reverse() {
		System.out.println("Hey friend, please input a string: ");
		Scanner scnr = new Scanner(System.in);
		String str = scnr.nextLine();
		String reverse ="";
		for (int i =str.length()-1;i >=0;i--) {
			reverse = reverse +str.charAt(i);
		}
		
		return "\"Your reversed string is: \"" + reverse;
	}
	
}
