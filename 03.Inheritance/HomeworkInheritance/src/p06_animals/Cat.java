package p06_animals;

public class Cat extends Animal {

    protected Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void produceSound() {
        System.out.println("MiauMiau");
    }
}
