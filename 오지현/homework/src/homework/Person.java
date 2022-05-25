package homework;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]\n Age [age="+age+"]";
	}
}
