package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentService {
	@Autowired
	StudentRepository  repository;
	
	public Optional<Student> getStudent(int roll){
		return repository.findById(roll);
	}
	public String updateDetails(Student stu) {
		repository.save(stu);
		return "updated";
	}
	public String deleteDetails(int roll) {
		repository.deleteById(roll);
		return "Roll Deleted";
	}
	public List<Student> setPages(@PathVariable int offset,@PathVariable int PageSize){
		Page<Student> page= repository.findAll(PageRequest.of(offset, PageSize));
		return page.getContent();
	}
	public List<Student> getSort(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
		
	}
}
