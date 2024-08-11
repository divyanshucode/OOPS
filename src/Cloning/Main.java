package Cloning;

import java.util.Arrays;

//cloning provides shallow copy
//for primitives like int it is making new var
//but for object it just points the ref variable to old ones value
public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(34,"KK");
        Human twin = (Human)kunal.clone();
        System.out.println(twin.age + " " + twin.name);//34 KK

        System.out.println(Arrays.toString(twin.arr));//[2, 5, 7, 8, 4]

        twin.arr[0]=100;

        System.out.println(Arrays.toString(kunal.arr));//[100, 5, 7, 8, 4]
        //sees kunal value changes this is because
        //cloning provides shallow copy
        //for primitives like int it is making new var
        //but for object it just points the ref variable to old ones value

        //to solve shallow copy we use deep copy

        //after applying deep copy
        System.out.println(Arrays.toString(twin.arr));//[100, 5, 7, 8, 4]

        System.out.println(Arrays.toString(kunal.arr));//[2, 5, 7, 8, 4]

        //twin changed but kunal did not




    }
}
