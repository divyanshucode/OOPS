package polymorphism;
//1.compile time overloading also called as static overloading
//achieved via method overloading
//method overloading is when one class have mutiple method with same name
//but different no of argument, parameter,return types,order of type of parameter
//e,g. different constructor  below

//why it is called static cos java decide which method to call during compile time
//it uses casting concept to convert data types
public class numbers {

    double sum(double a, double b){
        return a+b ;
    }

    int sum(int a , int b , int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
        numbers obj = new numbers();
        //it finds the right constructor at compile type

        obj.sum(2,3);//here 2 is int but we have double in our constructor
        //so it performs implicit casting at compile time, convert 2 int into double

        obj.sum(1,2,3);

        //obj.(1,2,3,4) // gives error as there is no constructor with 4 paramter
    }
}
