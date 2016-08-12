package kr.pe.niad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by niad on 8/12/16.
 */
@Controller
@RequestMapping("/")
public class RootController {

	@RequestMapping(method = RequestMethod.GET)
	public String showRootPage() {

		return "root";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String showLoginView() {
		return "login";
	}
}
