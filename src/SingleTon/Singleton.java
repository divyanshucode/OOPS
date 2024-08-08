package SingleTon;
//Singleton class is a class that can create only one instance( object)
public class Singleton {


    //stop allowing use of constructor by making it private
    //so other people cannot create object
    //singleton will run only in this class as it is private

    private Singleton (){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
//check if 1 obj is created or not : if not create one , if already there just return that
        if(instance == null){
            instance =new Singleton();
        }

        return  instance;
    }
}
