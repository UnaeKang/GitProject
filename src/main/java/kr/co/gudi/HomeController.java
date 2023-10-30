package kr.co.gudi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("index");
		model.addAttribute("msg","hello git");

		
		return "home";
	}
	
	@RequestMapping(value="/list")
	public String list(Model model) {
		return "list";
	}
	
}
