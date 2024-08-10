package Abstract;


// an abstract method provides the structure frame
//the actual implementation is done by child
//e.g. abstract void career(String name);...this provide the main frame
//child method will have the actual logic e.g. one would chose engineer, other may be doctor


//imp point
//if a class have one or more abstract method
//than the class itself needs to be abstract

//you cannot create object of abstract class
//e.g. Parent mom = new Parent(); // this is not allowed

//you cannot create abstract constructor

//you cannot create abstract static method
//as static doesnt support overriding

//although you can create static method in abstract classes

import java.lang.reflect.Parameter;
//we cannot use final
//as final will prevent it from inheritance
//to overridden inherited is needed
//so  final is not allowed


//static and final variable can be used through constructor

//multiple inheritance is not allowed
//why because we can use normal function e.g. normal function below
//lets say you have 2 normal class each in one super class having same name
//how will child knows which superclass function we are talking about
public class main {
    public static void main(String[] args) {
        Son son = new Son(45);
        son.career("doctor");//I am going to be a doctor


        parent.hello();//Hey

        //we can declare parent as ref variable
        //parent will determine what we can access
        //obj son will determine which method we can access
        //same as run time polymorphism
        parent son2 = new Son(33);
        son.partner("xyz",32);


       son.normal();
    }
}
