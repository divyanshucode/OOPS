public class Wrapper {

    public static void main(String[] args) {
        int a = 10;

        int b = 20;
        Integer num1 = 45;
        Integer num2 = 35;

        // we cannot do a.  as a is primitive
        //but we can do num.  as num is consider as an object

//      swapPrimitive(a,b);
//        System.out.println(a + " " + b); // print 10 and 20
//        //as this swap function did not work as int a and b are primitive
//        //and in java , primitive are passed by value and not passed by reference
//
//
//        swapObject(num1,num2);
//        System.out.println(num1 + " " + num2);//print 45 and 35

        //still this swap function did not work even though it is pass by reference and wrapper class
        //this is because of final class


//        final Keyword:
//        A field can be declared as final. Doing so prevents its contents from being modified, making it, essentially, a constant.
//        This means that you must initialize a final field when it is declared.
//        final int val = 2;
//        val =3  //error as final wont let it modify it


        //final provides immutability for primitive data values
        //but for non primitive like object
        //Object value can be modified  even with final keyword
        //but reassigning is not allowed

//        final Student kunal = new Student(); //allowed
//        kunal.name = "new name"; //modifying value is allowed
//        kunal = "Other Object"; //reassigning not allowed


//        The finalize( ) Method:
//        Sometimes an object will need to perform some action when it is destroyed.
//                To handle such situations, Java provides a mechanism called finalization. By using finalization,
//                you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
//        To add a finalizer to a class, you simply define the finalize( ) method. The Java run time calls that method whenever
//        it is about to recycle an object of that class. Right before an asset is freed, the Java run time calls the finalize( )
//        method on the object.
//
//        protected void finalize( ) {
//            // finalization code here
//        }
//
//        A obj;
//        for (int i = 0 ; i < 100000000 ;i++){
//            obj = new A("Random name");
//        }
//    }

//    static  void  swapPrimitive (int a , int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }
//
//    static  void  swapObject (Integer num1, Integer num2) {
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//
//}

//
//    class A {
//        final  int num = 10;
//        String name;
//
//
//        public A(String name){
//            this.name = name;
//        }
//
//        protected  void finalize() throws Throwable {
//            System.out.println("Object is destroyed");
//        }
//    }
    }
}
