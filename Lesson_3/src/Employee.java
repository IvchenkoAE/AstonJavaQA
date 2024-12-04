public class Employee {
    private String fullname;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fullname, String position, String email, int phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + fullname);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);

    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Пертов Фёдор Николаеви", "Инжинер", "petr@E.ru", 8988675, 500000, 47);
        employee1.displayInfo();
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Иванов Иван Иванович", "Учитель", "ivivan@mailbox.com", 892312312, 30000, 30);
        empArray[1] = new Employee("Петров Пётр Петрович", "Строитель", "petrop@mailbox.com", 892312313, 40000, 35);
        empArray[2] = new Employee("Алёшкин Алёшка Алёшков", "Аналитик", "sisem@mailbox.com", 892312314, 50000, 28);
        empArray[3] = new Employee("Васильев Игорь Олегович", "Разработчик", "smigor@mailbox.com", 892312315, 45000, 32);
        empArray[4] = new Employee("Кошечкина Кошечка Собачкина", "Дизайнер", "kovm@mailbox.com", 892312316, 35000, 26);

        for (Employee emp : empArray) {
            emp.displayInfo();
        }
    }
}