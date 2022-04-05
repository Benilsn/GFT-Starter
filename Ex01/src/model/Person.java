package model;

public class Person {

    private int age;
    private double height;
    private double weight;

    public Person() {}

    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nAge: " + age);
        sb.append("\nHeight: " + height);
        sb.append("\nWeight: " + weight);

        return sb.toString();
    }
    
}
