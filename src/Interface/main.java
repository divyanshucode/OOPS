package Interface;
//Interface doesnt maintain any state of information
//thats why variables are static and final in interface

//interface vs abstract
//interface can have only abstract method.final var,static
//abstract has abstract method, normal method , static method,final and non final

//interface support multiple inheritance which abstract doesnot


//abstract can implementation of the interface
//but interface cannot provide abstraction implementation

//interface use implements keyword
//abstract use extends keyword

//interface can implement multiple java interface while abstract extends only single
//interface can be public by default, abstract can be public , protected...


//the main logic to use interface
//lets say 3 superclass
//engine, media and brake
//you can use abstract ,but you can inherit from only one superclass
//lets say you want to have a custom car taking in property of all 3 super class
//then hat will you do
//that's when interface comes in picture making use of multiple implementation

//two classes that are unrelated to each other can also have same implementation
public class main {
    public static void main(String[] args) {
        Car car = new Car();


        Engine car2 = new Car();//we can use type of the ref variable as type of the implementation
//       car2.brake(); //this will not work because which thing we access depend on var
        //engine does not have brake
        car2.start();//this will work

        car.accelerate();
        car.brake();
        //Normal accelerate
        //Normal Brake



        Media car3 = new Car();
        car3.stop();//Normal engine stop
        //this is problem we want to stop car music, but it stops car engine
        //so we create classes to resolve this


        //customcar using classes
        CustomCar car4 = new CustomCar();
        car4.start();
        car4.startMusic();
        // Power Engine starts
        //Music player starts
        //power engine is default so


        car4.changeEngine();//Engine is changed from power to electric
        car4.start();// Electric Engine starts
        //engine changed
    }
}
