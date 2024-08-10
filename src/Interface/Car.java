package Interface;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake() {
        System.out.println("Normal Brake");
    }

    @Override
    public void start() {
        System.out.println("Normal engine start");
    }



    @Override
    public void stop() {
        System.out.println("Normal engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Normal accelerate");
    }
}
