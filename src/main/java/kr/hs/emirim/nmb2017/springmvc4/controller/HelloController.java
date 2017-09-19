package kr.hs.emirim.nmb2017.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	// root 로 들어오는 것들을 처리한다.
	//	@RequestMapping("/")
	//	@ResponseBody
	//	 public String hello() {
	//	    return "안녕. 스프링!";
	//	 }
	
	@RequestMapping("/")
	 public String hello(@RequestParam("name") String userName, Model model) {
		model.addAttribute("message", userName + "님 안녕하세요."); // 주소창/?name=이름 을 넣어줘야 실행 가
		  return "resultPage";
	 }
}
