package a;
//this import helps in understanding how java using package b , message class into package a
//only public class is available
import static b.message.message;

public class greeting {

    //using the message method from package b in package a , greeting class
    public static void main(String[] args) {
        System.out.println("Hello ");
        message();
//        Hello
//        This will go in greeting class of package a
    }


}
