package com.mtz.stu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StuController {

	List<Student> stuList = new ArrayList<Student>();
	
	
	private List<Student> getAllStuData(){
		
		stuList.add(new Student(100,"S1","CBIT",56000,66,77,88));
		stuList.add(new Student(101,"S2","CBIT",46000,16,77,88));
		stuList.add(new Student(102,"S3","CBIT",16000,66,17,88));
		stuList.add(new Student(103,"S4","CBIT",36000,66,77,18));
		stuList.add(new Student(104,"S5","CBIT",26000,36,37,98));
		stuList.add(new Student(105,"S6","CBIT",76000,56,47,38));
		
		return stuList;
		
	}
	@RequestMapping("/mtz/stu/pass")
	public List<Student> getPassStuList(){
		List<Student> passList = new ArrayList<Student>();
		List<Student> stuData = getAllStuData();
		Student stu = null;
		for(int i=0;i<stuData.size();i++) {
			
			stu = stuData.get(i);
			
			if( (stu.getMaths() > 35) 
				&&
				(stu.getSci() > 35) 
				&&
				(stu.getEng() > 35)
			){
				passList.add(stu);
			}// if
			
		}// for
		return passList;
	}
	@RequestMapping("/mtz/stu/fail")
	public List<Student> getFailStuList(){
		List<Student> failList = new ArrayList<Student>();
		List<Student> stuData = getAllStuData();
		Student stu = null;
		for(int i=0;i<stuData.size();i++) {
			
			stu = stuData.get(i);
			
			if( (stu.getMaths() < 35) 
				||
				(stu.getSci() < 35) 
				||
				(stu.getEng() < 35)
			){
				failList.add(stu);
			}// if
			
		}// for
		return failList;
	}


	@RequestMapping("/mtz/stu/sub/pass")
	public List<Student> getPassForParticularSubStuList(@RequestParam String sub){
		List<Student> subPassList = new ArrayList<Student>();
		List<Student> stuData = getAllStuData();
		Student stu = null;
		for(int i=0;i<stuData.size();i++) {
			
			stu = stuData.get(i);
			
			if(sub.equalsIgnoreCase("maths")) {
				if(stu.getMaths() > 35) {
					subPassList.add(stu);
				}
			}
			else if(sub.equalsIgnoreCase("sci")) {
				if(stu.getSci() > 35) {
					subPassList.add(stu);
				}
			}
			else if(sub.equalsIgnoreCase("eng")) {
				if(stu.getEng() > 35) {
					subPassList.add(stu);
				}
			}
		}// for
		return subPassList;
	}

}
