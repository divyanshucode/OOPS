package Abstract;

//use abstract when there is guarantee
//the method needs to be overridden

public class Son extends parent{
    public Son(int age){
//        this.age = age;
        super(age);
    }

    //implementing through overriding(overriding is Method with same name but different implementation)
    @Override
    void career(String name){
        System.out.println("I am going to be a " + name);

    }

    @Override
    void partner(String name,int age){
        System.out.println("My partner name is " + name + " and her age is " + age );

    }
}
