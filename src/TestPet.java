import java.util.ArrayList;

public class TestPet {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        Pet pet1 = new Cat(5, "Myr4ik", false, true);
        Pet pet2 = new Dog(10, "Sharik", true, true);
        Pet pet3 = new Parrot(4, "Kesha", false, false);
        Pet pet4 = new Turtle(11, "Turtle", true, 20);
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        for (Pet p : pets) {
            System.out.println(p.getName());
            p.eat();
            p.walk();
            System.out.println("~~~~~");
        }
    }
}
