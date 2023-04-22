import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 45);

        Plate plate = new Plate(500);
        plate.info();
        System.out.println("Сытость = " + cat1.getSatiety());
        if (plate.getFood() >= cat1.getAppetite()){
            cat1.eat();
            cat1.setSatiety(true);
            System.out.println("Сытость = " + cat1.getSatiety());
            plate.setFood(plate.getFood() - cat1.getAppetite());
        }
        else {System.out.println("Котик ничего не поел и голоден");
            System.out.println("Сытость = " + cat1.getSatiety());}

        plate.info();
        System.out.println();

        plate.addFood(99);

        Cat cat2 = new Cat("Мурзик", 45);
        Cat cat3 = new Cat("Пушистик", 35);
        Cat cat4 = new Cat("Рыжик", 65);
        Cat cat5 = new Cat("Барон", 30);
        Cat cat6 = new Cat("Шпик", 50);
        Cat cat7 = new Cat("Валет", 42);

        List<Cat> cats = new ArrayList<>();

        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);

        for (Cat cat : cats) {
            plate.info();
            if (plate.getFood() >= cat.getAppetite()) {
                cat.eat();
                cat.setSatiety(true);
                System.out.println("Сытость = " + cat.getSatiety());
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.println();
            }

            else {System.out.println("Еды меньше чем надо " + cat.getName() + " не поел и остался голодным");
                cat.setSatiety(false);
                System.out.println("Сытость = " + cat.getSatiety());
                System.out.println();
            }
        }
    }
}