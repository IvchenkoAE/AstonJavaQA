public class Park {
   
    public class Attraction {
        private String name; // Название аттракциона
        private String openingTime; // Время открытия
        private String closingTime; // Время закрытия
        private double cost; // Стоимость

        public Attraction(String name, String openingTime, String closingTime, double cost) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + openingTime + " - " + closingTime);
            System.out.println("Стоимость: " + cost + " рублей");
            System.out.println();
        }
    }

    private Attraction[] attractions;
    private int currentIndex;

    public Park(int size) {
        attractions = new Attraction[size];
        currentIndex = 0;
    }
    public void addAttraction(String name, String openingTime, String closingTime, double cost) {
        if (currentIndex < attractions.length) {
            attractions[currentIndex] = new Attraction(name, openingTime, closingTime, cost);
            currentIndex++;
        } else {
            System.out.println("Нет свободного места для нового аттракциона.");
        }
    }
    public void displayAttractions() {
        System.out.println("Список аттракционов в парке:");
        for (int i = 0; i < currentIndex; i++) {
            attractions[i].displayInfo();
        }
    }
    public static void main(String[] args) {
        Park park = new Park(5);
        park.addAttraction("Американские горки", "10:00", "22:00", 500);
        park.addAttraction("Пороговая река", "10:30", "20:00", 300);
        park.addAttraction("Колесо обозрения", "11:00", "23:00", 200);
        park.addAttraction("Детская площадка", "09:00", "19:00", 150);
        park.addAttraction("Замок ужасов", "10:00", "21:00", 400);
        park.displayAttractions();
    }
}