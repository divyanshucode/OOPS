package access;

public class subClass extends A{

    public subClass(int num,int age, String name){
        super(num,age,name);
    }
    //same package subclass: protected behaviour
    public static void main(String[] args) {
        subClass obj = new subClass(28,14,"yjr");
        int n = obj.age;

        //yes:
        //we can access protected  var in same package subclass

        System.out.println(obj instanceof A);
        System.out.println(obj instanceof subClass);
        System.out.println(obj instanceof Object);
        //all true
    }
}
