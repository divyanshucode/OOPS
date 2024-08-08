package access;

public class A {
    private int num;

    protected int age;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void  setNum(int num) {
        this.num = num;
    }    public A(int num,int age,String name){
        this.num = num;
        this.age = age;
        this.name=name;
        this.arr = new int[num];
    }
}
