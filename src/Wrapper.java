public class Wrapper {

    public static void main(String[] args) {
        int a = 10;

        int b = 20;
        Integer num1 = 45;
        Integer num2 = 35;

        // we cannot do a.  as a is primitive
        //but we can do num.  as num is consider as an object

      swapPrimitive(a,b);
        System.out.println(a + " " + b); // print 10 and 20
        //as this swap function did not work as int a and b are primitive
        //and in java , primitive are passed by value and not passed by reference


        swapObject(num1,num2);
        System.out.println(num1 + " " + num2);//print 45 and 35

        //still this swap function did not work even though it is pass by reference and wrapper class
        //this is because of final class
    }

    static  void  swapPrimitive (int a , int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static  void  swapObject (Integer num1, Integer num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
