package access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num,float gpa){
        this.num = num;
        this.gpa = gpa;
    }
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    //hashcode gives us the unique number representation of the object
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(34);
//        System.out.println(obj.hashCode());
//        //81628611

        ObjectDemo obj1 = new ObjectDemo(12,56.f);
        ObjectDemo obj2 = new ObjectDemo(12,78.5f);
        //this checks reference basically address
        if(obj1 == obj2){
            System.out.println("Obj1 == Obj2");
        }

        //this checks content (value)
        if(obj1.equals(obj2)){
            System.out.println("Obj1 is equal to Obj2");

            //this value is changed using override so its printing
            //Obj1 is equal to Obj2
        }
        System.out.println(obj1.getClass().getName());//access.ObjectDemo
    }
}
