package SingleTon;

public class Main {
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
    Singleton obj3 = Singleton.getInstance();

    //all will give same instance
    //all 3 are pointing to same one object


}
