package reference;

class Student{
	String name;
	int age;
}

public class ReferenceEx1 {
	public static void main(String[] args) {
		int age=25;
		double price = 100.5;
		
		int age1= age;
		age=30;
		System.out.println("age: "+ age + ", age1:" +age1);
		
//		String name =new String("홍길동");
//		String name1= name;
//		name = new String("시");
//		
//		System.out.println("name: "+ name + ", name1:" +name1);
//		String hobby="독서";
		Student s1= new Student();
		s1.name = "홍길동";
		s1.age= 20;
		
		Student s2= s1;
		s1.name= "김길동";
		s1.age = 22;
//		s1=null;
		
		System.out.println(s1.name + ", "+s2.name);
		
	}
}
