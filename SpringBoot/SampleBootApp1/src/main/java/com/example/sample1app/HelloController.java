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

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mv) {
		mv.addObject("msg", "名前を書いてください");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value = "/", method=RequestMethod.POST)
	public ModelAndView form(@RequestParam("text1") String str, ModelAndView mv) {
		mv.addObject("msg", "こんにちは" + str + "さん！");
		mv.addObject("value", str);
		mv.setViewName("index");
		return mv;
	}
	
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
