import javax.sound.midi.ControllerEventListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] name = new String[5];

        Student[] students = new Student[5];
//        Student kunal = new Student(21,"Divyanshu"); //constructor calling with parameter
//        kunal.greetings();  //method callin for constructor
//        kunal.rno = 13;
//        kunal.name = "Kunal";
//
//        Student random2 = new Student();
//        System.out.println(random2.name); // print Sanjay
//
//
//        System.out.println(kunal.name);
//        System.out.println(kunal.rno);

     //assigning one object to another
        Student one = new Student();
        Student two = one;
        one.name = "XYZ";
        System.out.println(two.name);   //Print XYZ
    }

}
    class Student {
        int rno;
        String name;

//       this: keyword in method
//        void greetings(){
//            System.out.println("Hello my name is " + this.name);
//        }
//


//        constructor
//        so if you call a constructor with no parameters this will perform
//        Student () {
//           this.rno=14;
//           this.name = "Kunal Kushwaha";
//        }

        //call a contructor with this parameters this will perform
        //this is called constructor overloading
//
//        Student (int rno , String name) {
//           this.rno = rno;
//           this.name = name;
//        }


//        Student() {
//
//            //calling constructor from another constructor
//            // this basically gives reference to random2
//            this (13,"Sanjay");
//        }

}

