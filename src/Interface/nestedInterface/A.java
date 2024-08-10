package Interface.nestedInterface;
//nested interface has to be declared as private or protected
//top interface has to be declared as public or default
public class A {

    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}
class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(5));//true
    }
}
