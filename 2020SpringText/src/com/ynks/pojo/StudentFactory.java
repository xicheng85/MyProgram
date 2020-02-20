package com.ynks.pojo;

public class StudentFactory {
	   public Student studentFactory(String witch) {
		  switch (witch) {
		case "A":
			  return new A();
		case "B":
			  return new B();
		default:
			  return new Student();
		}
	}
		public Student  newInstance(){
			  return new Student();
		}
}
