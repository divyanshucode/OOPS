package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    //if static keyword is not used it will put the  population just one for every object


    public Human(int age, String name,int salary,boolean married){
        this.age=age;
        this.salary=salary;
        this.married=married;
        this.name=name;
        //this.population+=1;// this will increase population whenever a new human class object is created
        //we dont need this keyword for static variables
        //className is enough
        Human.population+=1;
    }
}
