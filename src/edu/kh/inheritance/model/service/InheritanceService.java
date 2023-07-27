package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {

		// 상속 확인 예제
		public void ex1() {
		// Person을 상속받은 Student가 Person 필드, 메소드를
		// 사용할 수 있는가?
					
		Person p = new Person();
					
		//p.name = "홍길동"; // private 때문에 직접접근불가(에러발생)
					
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
					
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());

		System.out.println("-----------------------------------");
		
		
		// Student 객체 생성
		Student std = new Student();
		
		// Student만의 고유한 필드
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로부터 상속받은 필드, 메서드
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		// Student가 Person의 메소드뿐 아니라 필드도 상속받았는지 확인
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
	
		System.out.println("-----------------------------------");

		Employee emp = new Employee();
		
		// Employee만의 고유 메서드
		emp.setCompany("KH정보교육원");
		
		// Person 클래스로부터 상속받은 메서드
		emp.setName("송원철");
		emp.setAge(7);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		// 추가된 breath() 메서드 상속 확인
		p.breath();
		std.breath();
		emp.breath();
		// 상속의 특징 : 코드 추가 및 수정에 용이함
		// -> 부모에게 정의하면 상속받은 자식들은 모두 부모의 것을 그대로
		// 받아서 쓸 수 있음!
		
		}
		
		// super() 생성자 사용방법
		public void ex2() {
			
			// Student 매개변수 5개짜리 생성자
			Student std = new Student("김철수", 17, "한국", 1, 3);
			
			System.out.println(std.getName());
			System.out.println(std.getAge());
			System.out.println(std.getNationality());
			
			System.out.println(std.getGrade());
			System.out.println(std.getClassRoom());
			
		}
}
