package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {
	
	@Autowired
	DataService d1;
	
	@PostMapping("insert")
	@ResponseBody
	public String saveData(@RequestBody() Data obj) {
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		d1.data_insert(obj);
		return "Data Saved successfully";
	}
	
	@PostMapping("getData")
	@ResponseBody
	public String getData() {
		List<Data> lst = d1.getData();
		return "Data fetch successfully";
	}
}
