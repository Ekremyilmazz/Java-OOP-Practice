package oop_1;
//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, 
//set their attributes using the constructor, and print their name and age.
public class main {

	public static void main(String[] args) {
		Person person1=new Person("Ekrem",22);
		Person person2=new Person("Yiğit",12);
		
		System.out.println(person1.getName()+" is " + person1.getAge() +" years old.");
		System.out.println(person2.getName()+ " is " + person2.getAge() +" years old.");

	}

}
