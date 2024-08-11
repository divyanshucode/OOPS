package generics;



import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i * 2);
        }
//        arr.forEach((item) ->
//                System.out.println(item * 2));
        //0
        //4
        //8
        //12
        //16

        Consumer<Integer> fun = (item)-> System.out.println(item*2);
        arr.forEach(fun);

        Operation prod = (a,b)->a * b;
        Operation sub = (a,b)->a - b;
        Operation sum = (a,b)->a + b;

        lambdaFunctions myCalci = new lambdaFunctions();
        System.out.println(myCalci.operate(4,3,sum));
        System.out.println(myCalci.operate(8,2,prod));
        System.out.println(myCalci.operate(6,3,sub));
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }

}
interface Operation {
    int operation(int a,int b);
}
