package SingleTon;
import access.A;

public class subClass extends A {
    public subClass(int num ,int age, String name){
        super(num, age,name);

    }

    public static void main(String[] args) {
        subClass obj = new subClass(22,33,"vansh");
        int n = obj.age;

        //yes we can access protected var age in
        //subclass of different package


        //access table

        //public : can be access in : 1.class 2.package 3. subclass(same package)4.subclass(diff package)5.world(diff package and not a subclass)
        //protected : can be access in : 1.class 2.package 3. subclass(same package)4.subclass(diff package)

        //no modifier : can be access in : 1.class 2.package 3. subclass(same package)
        //private : can be access in : 1.class
    }

}
