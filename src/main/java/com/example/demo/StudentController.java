package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentRepository serviceRepository;
	@Autowired
	StudentService service;
	@GetMapping("/get")
	List<Student> getList(){
		return serviceRepository.findAll();
	}
	@PostMapping("/post")
	public Student create(@RequestBody Student stu) {
		return serviceRepository.save(stu);
	}
	@GetMapping("/get/{roll}")
	public Optional<Student> getbyid(@PathVariable int roll){
		return service.getStudent(roll);
	}
	@PutMapping("/put")
	public String update(@RequestBody Student stu) {
		return service.updateDetails(stu);
	}
	@DeleteMapping("/del")
		public String delete(@RequestParam int roll) {
			return service.deleteDetails(roll);
		}
	@GetMapping("/student/{offset}/{PageSize}")
	public List<Student> studentWithPagination(@PathVariable int offset,@PathVariable int PageSize){
		return service.setPages(offset,PageSize);
		
	}
	@GetMapping("/student/{field}")
	public List<Student> StudentSortList(@PathVariable String field){
		return service.getSort(field);
	}
	
}
