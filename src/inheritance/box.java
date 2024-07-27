package inheritance;

public class box {
    double l;
    double h;
    double w;


    //different ways to create a constructor
    box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    box( double l , double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    box(box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public box(double side){
        this.l=side;
        this.w=side;
        this.h = side;
    }

}
