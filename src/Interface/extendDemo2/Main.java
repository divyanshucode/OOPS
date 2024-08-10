package Interface.extendDemo2;



//interface to interface uses extends
//class to interface is implements
public class Main implements A,B {


    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}

