package polymorphism;
//2 type of polymorphism
//run time polymorphism also known as dynamic
//achieved via method overriding
//method overriding when child and parent have same method name  but different body
//when obj of circle will run it will override the method of parent(shapes)
//annotation @Override is used
public class Circle extends Shapes{
    @Override
    void area(){
        System.out.println("Area is 3.142*r*r");
    }


    //if the type of ref variable is of parent class
    //and object is of child class

    //parent obj = new child();
    //which method will be called depend on obj type(ie. child)
    //this is known as upcasting
    //the ref type defines which all things you can access

    //how java determines which version of method to called?
    //it uses dynamic method dispatch

    //this all happens in run time


    //static methods can be inherited but cannot be override
    //because override depends on object and static does not depend on object
    //so static cannot be override
}

