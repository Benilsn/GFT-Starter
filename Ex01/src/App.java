import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.println("Type the age, height, weight from 10 people:");

        for (int i = 1; i <= 10; i++) {

            Person p = new Person();

            System.out.println();
            System.out.println("Data of " + i + "° person:");
            System.out.print("Age: > ");
            p.setAge(input.nextInt());
            System.out.print("Height: > ");
            p.setHeight(input.nextDouble());
            System.out.print("Weight: > ");
            p.setWeight(input.nextDouble());

            people.add(p);
        }

        olderThan50(people);
        averageHeight(people);
        lessThan40(people);

    }

    public static void olderThan50(List<Person> list) {

        var olders = list.stream()
                        .filter(p -> p.getAge() > 50)
                        .count();

        System.out.println("Amount of older than 50: " + olders);
    }

    public static void averageHeight(List<Person> list){

        double heights = 0;
        int amount = 0;

        for (Person p : list){
            if (p.getAge() >= 20 || p.getAge() <= 30){
                heights += p.getHeight();
                amount += 1;
            }
        }

        var avg = heights / amount;

        System.out.printf("Average height of people of 10 to 20 years: %.2f",avg);
    }

    public static void lessThan40(List<Person> list){

        int amount = 0;
        int total = list.size();

        for (Person p : list){
            if (p.getWeight() < 40.0){
                amount += 1;
            }
        }

        var porcentage = (amount * 100) / total;

        System.out.println("Percentage of people with weight less than 40.0 kg: " + porcentage + "%");
    }
}

