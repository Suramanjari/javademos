package s18classes;

public class Dog 
{  
    String name; 
    String breed; 
    int age; 
    String color; 
    public Dog(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("My name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Dog scott = new Dog("Saraah","Labrador", 3, "Golden"); 
        System.out.println(scott.toString()); 
    } 
}

