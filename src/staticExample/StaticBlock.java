package staticExample;

//demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b ;

    //initialisation using static block

    //only run once when the first obj is created .ie when the class is loaded for the first time
    static {
        System.out.println("static block");
        b= a* 5;
    }

    public static void main(String[] args) {
       StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " +StaticBlock.b);

    }
}
