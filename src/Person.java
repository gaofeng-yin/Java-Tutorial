
public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	Person(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		if(gender != 'M' && gender != 'F') {
			System.out.println("Gender can only be M(for male) or F(for female)!");
		}else {
			this.gender = gender;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void personInfo() {
		System.out.println("Name: " + getName() + "\nage: " + getAge() + "\nGender: " + getGender());
	}
	
	public void happyBirthday() {
		age++;
		System.out.println("Happy birthday " + getName() + " you are " + getAge() + " now!");
	}
	
}
