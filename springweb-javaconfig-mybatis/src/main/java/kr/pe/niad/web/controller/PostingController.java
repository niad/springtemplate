package kr.pe.niad.web.controller;

import kr.pe.niad.domain.Posting;
import kr.pe.niad.service.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("posting")
public class PostingController {

	@Autowired
	private PostingService postingService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showPostings() {

		List<Posting> results = postingService.findPostings();

		ModelAndView mav = new ModelAndView("posting/posting_list");
		mav.addObject("results", results);
		return mav;
	}

}
