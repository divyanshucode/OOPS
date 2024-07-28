package polymorphism;

public class Shapes {

    //final can be used to prevent overriding and also inheritance

    //how it does prevent overrding and enhance performance

    //java compiler knows that final method cannot be overriden
    //when a small final method is called
    //java compiler can copy the byte code from subroutine or internal system
    //directly with the compiling code of called method
    //hence eliminating the overhead
 void area(){
     System.out.println("I am in shape");
 }
}

//Early binding : Early binding occurs when the method or function to be called is determined
// at compile time. In Java, this is typically associated with:
//Method Overloading: When you have multiple methods with the same name but different parameters in the same class, Java resolves which method to call at compile time based on the method signatures.
//Static Methods: Calls to static methods are resolved at compile time because they belong to the class itself rather than an instance of the class.
//Private Methods: Private methods are resolved at compile time because they are not visible outside the class where they are defined.


//Late Binding (Dynamic Binding)
//Late binding happens when the method to be executed is determined at runtime rather than compile time. This is often related to:
//
//Method Overriding: When a subclass provides a specific implementation for a method that is already defined in its superclass, Java determines at runtime which version of the method to call based on the actual object's type.
//Virtual Methods: Non-static, non-private methods in Java are virtual by default, meaning that the call to these methods is resolved at runtime.
