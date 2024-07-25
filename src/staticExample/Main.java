//package staticExample;
////if the class is in same package(folder) , no need to import it
//
//
//import java.util.MissingFormatArgumentException;
//
////object independent properties are called static variables or static methods
////for e.g  population property will be independent of any class , it will be same for everyone 7 billion
//public class Main {
//    public static void main(String[] args) {
////        Human kunal = new Human(22,"kunal kushwaha",10000,false);
////        Human rahul = new Human(34,"rahul",15000,true);
//
////        System.out.println(kunal.population);
////        System.out.println(rahul.population);//result : 2 for both
//        System.out.println(Human.population);
//        //dont use kunal.population or any object name use Human.population
//        //a static variable can be accessed before even  creating  any object
//        // and can be accessed through class like Human.population
//        //you can also create static method as well e.g. public static void main
//
//
//        //imp : why psvm is static
//        //static allows using method before creating a object
//        //main is the first thing that runs on java
//        //if psvm is not static , in order to run anything inside a class we have to create an object for it
//        //static allow us to run main before even creating the object
//
//
////        greeting(); // error throw as non static method greeting cannot be referenced through static main method
//
//
//        Main funn = new Main() {
//            funn.fun2();
//        }
//    }
//
//    //this does not dependent on objects
//     static void fun(){
////        greeting(); // error: this is non static and it is dependent on object(instance)
//
//
//         //you cannot access non static stuff without referencing their instances in a static context
//         //this will allow greeting to run as we are referencing through obj
//         Main obj = new Main();
//         obj.greeting();
//     }
//     //how can you call greeting which is dependent on instance inside  fun which is not dependent on instance
//
//    //point : Inside a static method you cannot call something that is not static without explicitly referencing an object to it
//    //for e,g, this non static greeting method will show error when call inside psvm
//
//
//    //fun2 will get reference through an object funn , so automatically greeting get refernced through funn
//    void fun2(){
//        greeting();
//    }
//
//    //we know that something which is not static belongs to an object(instance)
//    void greeting(){
//        fun();//but we can have static method fun inside a non static method greeting
//        System.out.println("Hello guys");
//
//
//    }
//}
