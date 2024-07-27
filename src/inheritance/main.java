package inheritance;

public class main {
    public static void main(String[] args) {
//        box box1 = new box(4);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);


//        BoxWeight box2 = new BoxWeight();
//        box2.weight=15;
//        System.out.println(box2.h + " " +box2.weight);
//
//        //access all properties l,w,h from base class and  weight from its own
//
//        BoxWeight box3 = new BoxWeight(2,6,7,9);
//        System.out.println(box3.h + " " + box3.weight);// 7 and 2



        //type of reference variable determine the properties and not the object variable
        //reference variable is of box type allowing l,w,h
        //but not allowing weight
//        box box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.w);//allow
//        System.out.println(box5.weight);//show error


        //variable access is given to ref variable
        //hence having box weight as the ref variable you should only have access to weight
        //this means weight should be initialised
        //but,here obj is box type, how can parent class(box) will have access to child class(box weight) ,parent class cannot called
        //the constructor of child class
        //hence error below

//        BoxWeight box6 = new Box(1,2,3);
//        System.out.println(box6);


        //multilevel inheritance
        BoxPrice boxA = new BoxPrice(15 ,8,2000);



    }
}
