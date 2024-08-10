package Interface;

public class CustomCar {
    private Engine engine;
    private Media player = new MusicPlayer();

    public CustomCar(){
      engine = new powerEngine();
    }
    public CustomCar(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }
    public void changeEngine(){
        this.engine=new ElectricEngine();
        System.out.println("Engine is changed from power to electric");
    }
}
