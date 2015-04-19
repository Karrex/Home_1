public class Dog extends Pet {
    private boolean huntingDog = true;

    Dog(int age, String name, boolean canSwimming, boolean huntingDog) {
        super(age, name, canSwimming);
        this.huntingDog = huntingDog;
    }

    public boolean isHuntingDog() {
        return huntingDog;
    }

    public void setHuntingDog(boolean huntingDog) {
        this.huntingDog = huntingDog;
    }

    @Override
    public void walk() {
        System.out.println("Hello, i walk");
    }
}
