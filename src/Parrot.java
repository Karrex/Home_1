public class Parrot extends Pet {

    private boolean canTalk = false;

    public Parrot(int age, String name, boolean canSwimming, boolean canTalk) {
        super(age, name, canSwimming);
        this.canTalk = canTalk;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    public void walk() {
        System.out.println("Hello, i flying");
    }
}
