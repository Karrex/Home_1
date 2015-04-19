public abstract class Pet {
    private int age;
    private String name;
    private boolean canSwimming = false;

    public Pet(int age, String name, boolean canSwimming) {
        this.age = age;
        this.name = name;
        this.canSwimming = canSwimming;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanSwimming() {
        return canSwimming;
    }

    public void setCanSwimming(boolean canSwimming) {
        this.canSwimming = canSwimming;
    }

    public void eat() {
        System.out.println("I eat");
    }

    public abstract void walk();
}