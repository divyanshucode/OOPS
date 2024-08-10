package Interface;

public class MusicPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Music player starts");
    }

    @Override
    public void stop() {
        System.out.println("Music player stops");
    }
}
