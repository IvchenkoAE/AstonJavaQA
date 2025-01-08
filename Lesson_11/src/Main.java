abstract class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat() {
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public void eat(FoodBowl foodBowl) {
        if (foodBowl.getFoodAmount() > 0) {
            foodBowl.eat(5);
            isFull = true;
            System.out.println("Кот поел из миски.");
        } else {
            System.out.println("В миске недостаточно еды для кота.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void eat(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
        } else {
            System.out.println("Недостаточно еды в миске.");
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        FoodBowl foodBowl = new FoodBowl(10);

        dog1.run(300);
        dog1.swim(5);

        cat1.run(150);
        cat1.swim(5);

        cat1.eat(foodBowl);
        cat2.eat(foodBowl);

        System.out.println("Кот 1 сытость: " + (cat1.isFull() ? "Сытый" : "Голодный"));
        System.out.println("Кот 2 сытость: " + (cat2.isFull() ? "Сытый" : "Голодный"));
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество животных: " + Animal.getAnimalCount());
    }
}