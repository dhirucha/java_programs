
class Person{
    String name;
    int age;



public Person(){
    name = "unknown";
    age = 0;
}

public Person(String name) {
    this.name = name;
    age = 0; // Default age
}


public Person(String name, int age){
    this.name = name;
    this.age = age;
}

public void display(){
    System.out.println("Name:" + name + ", Age: " + age);
}

}


public class ConstructorOverloading {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice");
        Person p3 = new Person("bob", 25);

        p1.display();
        p2.display();
        p3.display();

    }
}


