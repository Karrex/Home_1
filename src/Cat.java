public class Cat extends Pet {
    private boolean canCatchMouse = true;

    public Cat(int age, String name, boolean canSwimming, boolean canCatchMouse) {
        super(age, name, canSwimming);
        this.canCatchMouse = canCatchMouse;
    }

    public boolean isCanCatchMouse() {
        return canCatchMouse;
    }

    public void setCanCatchMouse(boolean canCatchMouse) {
        this.canCatchMouse = canCatchMouse;
    }

    @Override
    public void walk() {
        System.out.println("Hello, I walk");
    }
}
