package model;

public class Student {
	String name;
	int age;
	String sex;
	String number;
	public Student(String name, int age, String sex, String number){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.number = number;	
	}
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;	
	}
	public void setSex(String sex) {
		this.sex = sex;
	}public String getNumber() {
		return number;	
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
