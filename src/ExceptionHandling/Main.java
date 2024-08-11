package ExceptionHandling;
//Exception is something that obstruct the normal flow of code
//exception can be recoverable
//e.g. no divide by zero is arithmetic exception

//throwable class is used for exception handling

//Exception is of two types 1.checked 2. unchecked
//checked exception are checked at compile time
//unchecked exception are checked when programme is running

//throw and throws difference
//throw is used to throw the exception
//throws is used to declare an exception

//there can be only one finally
public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try{
////            int c = a/b;
//            divide(a,b);

            //order of catch is imp
            //if less strict exception on  top , the other catch will not execute
            //for e.g. if Exception is on top , arithmetic exception below it will not execute
            //as exception is parent class and arithmetic exception is child class , so exception will include all
            //hence subclass or more strict exception should be on top

            //mimicking


            String name = "Divyanshu";
            if(name.equals("Divyanshu")){
                throw new MyException("Exception made by divyanshu");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(" Exception " + e.getMessage());
            //Arithmetic Exception / by zero
        }
        catch (Exception e) {
            System.out.println("Arithmetic Exception " + e.getMessage());
        }finally{
            //Arithmetic Exception / by zerofinally {
            System.out.println("this will executed no matter what");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
