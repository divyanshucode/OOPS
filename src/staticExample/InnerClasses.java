package staticExample;

//Outside class never be static ...
//nested class can be static

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kunal") ;
        Test b = new Test("Rahul");


        System.out.println(a.name);
        System.out.println(b.name);
        //output is kunal and rahul
        //but how come they have different value if they are from static variables


        //Test is not dependent of InnerClasses object but
        // main and Test are dependent on each other instances
        //giving kunal and rahul as answers


        //this both will give error if Test is not static
        //because how can we reference non static test (which is itself   dependent on Inner Class)
        // inside static main method

        //it can work on two condition
        // if test class was not a nested class
        //or if test class was static indicating it does not depend on InnerClasses Object



        //****
        //Objects are created at run time
        //and Static variable does not dependent on Object
        //Static are class level , so they are created at compile time
    }

    //so
    //System.out.println(xyz);
    //System is class
    //println is method
    //out is public static variable of printstream class
    //out is printstream referencing the println method through . operator
    //printLn call valueOf, valueOf inturn call toString method
}
