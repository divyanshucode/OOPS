package polymorphism;
//polymorphism means many ways to represent
//act of representing the same thing in multiple ways
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        square square = new square();
        //I am in shape
        //Area is 3.142*r*r
        //Area is side*side
        shape.area();
        circle.area();
        square.area();

        //area function is represented in square , circle

        //ref variable is of parent class still it works
        Shapes square2 = new square();
        square2.area();//Area is side*side

    }
}
