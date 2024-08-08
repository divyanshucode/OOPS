package access;

public class main {
    public static void main(String[] args) {
        A obj = new A(34,18,"Rahul");

        //1.access the data members
        //2.modify the data members

        //since num is private we cant directly access to it but we made it public get and set function
        //but we can access it via getter or setter method
        obj.getNum();
        obj.setNum(44);

        //private : access only that file
        //public : anywhere access through import
        //default :
//         1. if we dont specify it , like int num we can have access
//         in same package but not in different package





    }


}
