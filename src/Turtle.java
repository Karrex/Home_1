public class Turtle extends Pet {
    private int weight;

    public Turtle(int age, String name, boolean canSwimming, int weight) {
        super(age, name, canSwimming);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void walk() {
        System.out.println("Hello, i swimming");
    }
}
