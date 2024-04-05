package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class HelloController {
	private boolean flag= false;
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		flag = !flag;
		mv.addObject("flag", flag);
		mv.setViewName("index");
		mv.addObject("msg", "messages are shown");
		return mv;
	}
	
//	@RequestMapping("/other")
//	public String other() {
//		return "redirect:/";
//	}
//	
//	@RequestMapping("/home")
//	public String home() {
//		return "forward:/";
//	}
	
//	@RequestMapping(value = "/", method=RequestMethod.POST)
//	public ModelAndView form(@RequestParam(value="check1") boolean check1,
//							 @RequestParam(value="radio1", required = false)String radio1,
//							 @RequestParam(value="select1", required = false)String select1,
//							 @RequestParam(value="select2", required = false)String[] select2,
//							 ModelAndView mv) {
//		
//		String res = "";
//		try {
//			res=  "check:" + check1 +
//					" radio:" + radio1 +
//					" select:" + select1 +
//					" select2:";
//		}catch (NullPointerException e) {}
//		try {
//			res += select2[0];
//			for(int i = 1; i  < select2.length; i++) {
//				res += ", " + select2[i];
//			}
//		} catch (NullPointerException e) {
//			res += "null";
//		}
//		mv.addObject("msg", res);
//		mv.setViewName("index");
//		return mv;
//	}
	
	/* Model */
//	@RequestMapping("/{num}")
//	public String index(@PathVariable int num, Model model) { //Request Handler : index
//		int res = 0;
//		for(int i = 1; i <= num; i++) {
//			res += i;
//		}
//		model.addAttribute("msg", "total : " + res);
//		return "index";
//	}
}
