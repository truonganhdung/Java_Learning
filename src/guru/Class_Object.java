package guru;

/* Author: truonganhdung
 * Created Date: 11/09/2018
 * Modified Date: ../../2018
 * 
 * https://www.guru99.com/java-oops-class-objects.html#1
 * */

class Dog {
    String breed;
    String size;
    int age;
    String color;

    public String getInfo() {
        return ("Breed is: " + breed + "\nSize is: " + size + "\nAge is: " + age + "\ncolor is: " + color);
    }
}

public class Class_Object{
    public static void main(String[] args) {
        Dog maltese = new Dog();
        
        maltese.breed="Maltese";
        maltese.size="Small";
        maltese.age=2;
        maltese.color="white";
        
        System.out.println(maltese.getInfo());
    }
} 
