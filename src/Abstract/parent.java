package Abstract;

public abstract class parent {


    //allows static and final variable via constructor
   static int age;
   final int VALUE;
    //you can create static method in abstract classes

    static void hello(){
        System.out.println("Hey");
    }


    //constructor
    public parent(int age){
        this.age=age;
        VALUE=233344;
    }

    //it allows normal function
    void normal(){
        System.out.println("This is just a normal function");
    }

    int age1;
    abstract void career(String name);
    abstract void partner(String name,int age);

}
