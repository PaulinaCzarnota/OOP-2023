package ie.tudublin;

class Cat {
    private String name;
    private int numLives;

    public Cat(String name) {
        this.name = name;
        this.numLives = 9;
    }

    public String getName() {
        return name;
    }

    public int getNumLives() {
        return numLives;
    }

    public void kill() {
        if (numLives > 0) {
            numLives--;
            System.out.println("Ouch!");
        } else {
            System.out.println("Dead");
        }
    }
}
