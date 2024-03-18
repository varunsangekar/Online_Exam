package edu.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.main.model.Student;

import edu.main.model.Mark;
import edu.main.service.MarkService;
import edu.main.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	StudentService ss;
	@Autowired
	MarkService markService;

	@RequestMapping("/")
	public String prelogin() {
		return "userView";
	}

	@RequestMapping("/sss")
	public String StudentScreen() {
		return "registration";
	}

	@RequestMapping("/Ass")
	public String AdminScreen() {
		return "index";
	}

	@RequestMapping("/itsubmit")
	public String itmark(@ModelAttribute Mark itMark) {
		if (itMark.getItQ().equals("Central Processing Unit")) {
			itMark.setItMark(1);
		} else {
			itMark.setItMark(0);
		}

		markService.saveMark(itMark);
		return "end";

	}

	@RequestMapping("/cssubmit")
	public String csmark(@ModelAttribute Mark csMark) {
		if (csMark.getCsQ().equals("8")) {
			csMark.setCsMark(1);
		} else {
			csMark.setCsMark(0);
		}
		markService.saveMark(csMark);

		return "end";

	}

	@RequestMapping("/viewResult")
	public String viewResult(@RequestParam("sid") int sid, @ModelAttribute Mark mark, Model m) {
		List<Mark> mock = markService.getAllMarks();
		m.addAttribute("Data", mock);
		return "viewResult";
	}

	@RequestMapping("/reg")
	public String itsave(@ModelAttribute Student s, @ModelAttribute Mark mark) {
		String s1 = "it";
		String s2 = "cs";

		ss.Save(s);

		if (s.getBranch().equals(s1)) {

			return "itexam";

		} else if (s.getBranch().equals(s2)) {
			return "csexam";
		}

		return "end";

	}

	@RequestMapping("/log")
	public String adminlog(@RequestParam("uname") String un, @RequestParam("password") String pa, Model m,
			@ModelAttribute Student student) {
		if (un.equals("admin") && pa.equals("admin123")) {
			List<Student> list = ss.getAllStudent();
			ss.Save(student);
			m.addAttribute("data", list);

			return "success";

		} else {
			m.addAttribute("login_fail", "Enter Valid Login detail");
			return "index";

		}
	}

	@RequestMapping("back")
	public String logout() {
		return "userView";
	}

}
