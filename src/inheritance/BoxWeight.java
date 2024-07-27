package inheritance;

public class BoxWeight extends box {
    double weight;

    BoxWeight(){

        super();
        this.weight = -1;
    }

    BoxWeight (BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
     public BoxWeight (double side , double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l , double w , double h , double weight){
        super(l,w,h);//what is this?
        //parent class constructor
        //use to initialise public property of parent class

        //super can use as "this" keyword
        //why to use super
        //lets say child class also has property of w
        //to refer w of parent class we use super
        System.out.println(super.w);
        this.weight=weight;
    }
}
