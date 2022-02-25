package entity;

import java.util.Objects;

public class Person implements Greetable {
	private final String name;
	private final String lastname;
	private final int age;
	private final String sex;


	public Person(String name, String lastname, int age, String sex) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.sex = sex;
	}



	public String getName() {
		return name;
	}



	public String getLastname() {
		return lastname;
	}



	public int getAge() {
		return age;
	}



	public String getSex() {
		return sex;
	}




	@Override
	public int hashCode() {
		return Objects.hash(age, lastname, name, sex);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(lastname, other.lastname) && Objects.equals(name, other.name)
				&& Objects.equals(sex, other.sex);
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", age=" + age + ", sex=" + sex + "]";
	}



	@Override
	public void greet() {

		System.out.println("Hi, i'm " + getName()+ " " + getLastname() + ", and i'm " + getAge() + " year old " + getSex());
	}



}
