package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	@Autowired
	DataInterface repo;
	
	public List<Data> getData() {
		
		Iterator<Data> itr = repo.findAll().iterator();
		List<Data> lst = new ArrayList<Data>();
		
		while(itr.hasNext()) {
			System.out.println("Hello");
			Data obj = (Data)itr.next();
			lst.add(obj);
			System.out.println(obj.toString());
		}
		
		return lst;
	}
	
	public String data_insert(Data data) {
		repo.save(data);
		return "Data saved Successfully";
	}
}
