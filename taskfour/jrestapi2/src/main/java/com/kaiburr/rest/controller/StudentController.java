package com.kaiburr.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kaiburr.rest.model.Student;
import com.kaiburr.rest.rep.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo rep;
	
	@RequestMapping("/")
	public String home() {
		
		
		return "home.jsp";
	}
	
//	@RequestMapping("/addStudent")
//	public String addStudent(Student student) {
//		rep.save(student);
//		return "home.jsp";
//	}
	
	@RequestMapping("/getStudent/{name}")
	@ResponseBody
	public List<Student> getStudentByName(@PathVariable("name") String name) {
//		ModelAndView mv = new ModelAndView("showStudent.jsp");
//		Student student = rep.findByName(name);
		
//		List<Student> val = rep.findByName(name); 
//		mv.addObject(student);
		return rep.findByName(name);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		Student s = rep.getOne(id);
		rep.delete(s);
		return "Deleted";
	}
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		rep.save(student);
		return "Saved Successfully";
	}
	
	@PutMapping("/student")
	public String saveOrUpdateStudent(@RequestBody Student student) {
		
		rep.save(student);
		return "udpated Successfully";
	}
	
	@GetMapping("/students")
	@ResponseBody
	public List<Student> getStudents() {
		
		return rep.findAll();
	}
	
	@RequestMapping("/student/{id}")
	@ResponseBody
	public Optional<Student> getStudent(@PathVariable("id") int id) {
		
		return rep.findById(id);
	}
	
	
	@RequestMapping("/addStudent")
	public String addStudentUI(Student student) {
		rep.save(student);
		return "home.jsp";
	}
	
	@RequestMapping("/getStudentById")
	public ModelAndView getStudentUI(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("showStudent.jsp");
		Student student = rep.findById(id).orElse(new Student());
		mv.addObject(student);
		return mv;
	}
	
	@RequestMapping("/deleteStudentById")
	public String deleteStudentUI(@RequestParam int id) {
		Student s = rep.getOne(id);
		rep.delete(s);
		return "home.jsp";
	}
	

	
}
