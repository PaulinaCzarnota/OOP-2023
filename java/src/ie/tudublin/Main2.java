package ie.tudublin;

public class Main2 {
    public static void main(String[] args) {
        Cat ginger = new Cat("Ginger");
        while (ginger.getNumLives() > 0) {
            ginger.kill();
        }
    }
}