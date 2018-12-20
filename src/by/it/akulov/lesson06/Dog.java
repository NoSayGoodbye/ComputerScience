package by.it.akulov.lesson06;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    double getPower() {
        return power;
    }

    void setPower(double power) {
        this.power = power;
    }

    boolean win(Dog otherDog) {
        double myChance = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double otherChance = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return myChance>otherChance;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }
}
