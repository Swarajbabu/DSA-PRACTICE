// Basic Class and Object 
class Student{
    String name;
    int age;
    // COnstracter
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    void study(){
        System.out.println(name + " is studying");
    }
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
}

public class Main{
    public static void main(String[] args){
        Student obj = new Student("Swaraj",22);
        // obj.name = "Swaraj";
        // obj.age = 22;
        obj.study();
        obj.display();
    }
}


// 
class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    public void Sounds(){
        System.out.println("Animal Make sounds Differently");
        System.out.println("Name of the Animal: "+name);
    }
}
class Dog extends Animal{
    // super(name);
    Dog(String name){
        super(name);
    }
    
    public void Bark(){
        System.out.println("Name of the Animal: "+name);
        System.out.println("Make Sound is Bark");
    }
}
public class Main{
	public static void main(String[] args) {
		Dog obj = new Dog("Streat Dog");
		
		System.out.println(obj.name);
		obj.Sounds();
		obj.Bark();
	}
}


// 
class Animal{
    String name;
    
    Animal(String name){
        this.name = name;
    }
    
    public void Sound(){
        System.out.println("Animals make different sounds");
        System.out.println("Name of the animal: "+ name);
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    
    public void Bark(){
        System.out.println("Name of the animal: "+ name);
        System.out.println("Animal make sounds Barking");
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    
    public void Meom(){
        System.out.println("Name of the animal: "+ name);
        System.out.println("Animal make sounds meom");
    }
}

public class Main{
    public static void main(String[] args){
        Cat obj = new Cat("home Cat");
        obj.Sound();
        obj.Meom();
        
        System.out.println("\n");
        
        Dog obj1 = new Dog("Street Dog");
        obj1.Sound();
        obj1.Bark();
    }
}
