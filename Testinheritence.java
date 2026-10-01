//Single inheritance
class Animal{
void eat(){System.out.println("Animal eating...");}
}
class Dog extends Animal{
void bark(){System.out.println("Dog is barking...");}
}
class Testinheritence{
public static void main(String[] args){
Dog d= new Dog();
d.eat();
d.bark();
}
}
