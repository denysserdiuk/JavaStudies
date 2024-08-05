package studies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person ("John", "Doe", 20);
		Person person2 = new Person ("Mike", "James", 56);
		Person person3 = new Person("Alice", "Smith", 25);
        Person person4 = new Person("Bob", "Johnson", 32);
        Person person5 = new Person("Charlie", "Williams", 28);
        Person person6 = new Person("Diana", "Brown", 45);
        Person person7 = new Person("Edward", "Jones", 34);
        Person person8 = new Person("Fiona", "Garcia", 22);
        
        List <Person> people = new ArrayList<>();
        
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        
        /*for (Person person:people) {
        	System.out.println(person.toString());
        }*/
        
       
        List <Person> peopleOld = people.stream()
        		.map(p -> new Person(p.getFirstName(),p.getLastName(),p.getAge()+1000))
        		.sorted()
        		.collect(Collectors.toList());
        	
        peopleOld.forEach(p -> System.out.println(p));
        
        List <Person> peopleByAge = people.stream()
        		.filter(p -> p.getAge() > 30)
        		.collect(Collectors.toList());
        
        System.out.println();
        peopleByAge.forEach(System.out::println);        
	}
}
