package Collection;
//collection provides set of interfaces for our data structure
//list extends collection
//arraylist extends List


//what is vector
//it is like arrayList, but it is synchronized(deals with one thread at a time)
//thats why it is slower than array List

//enums are group of variable that cannot be changed
//all enum explicitly extend java.lang.enums
//enum cannot be a super class
//enum can be implement interface




import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
       List<Integer> list1 = new ArrayList<>();
       List<Integer> list2 = new LinkedList<>();


       List<Integer> vector = new Vector<>();
       vector.add(34);
       vector.add(33);
        System.out.println(vector);

    }
}
