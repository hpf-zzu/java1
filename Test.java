import model.*;
public class Test {
	public static void main(String[] args) {
		Student stu = new Student("aa", 20, "男", "123456");
		System.out.println("name "+stu.getName()+" age "+stu.getAge() + " sex "
				+stu.getSex() + "　学号 " + stu.getNumber());
		
	}
}
