package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse res) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (password.equals("admin")) {
			String message = "HELLO " + name;
			return new ModelAndView("result", "message", message);
		} else {
			return new ModelAndView("result", "message", "Sorry, username or password error");
		}
	}
}