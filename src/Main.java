public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivan", "Ivanov", 25000, 1);
        employees[1] = new Employee("Petya", "Petrov", 35000, 2);
        employees[2] = new Employee("Kirill", "Sidorov", 33000, 2);
        employees[3] = new Employee("Katya", "Kozlova", 45000, 4);
        employees[4] = new Employee("Georgiy", "Kasnov", 55000, 5);
        employees[5] = new Employee("Stanislav", "Kachanovskiy", 30000, 2);
        employees[6] = new Employee("Evgeniy", "Zotov", 23000, 1);
        employees[7] = new Employee("Dmitriy", "Klenin", 41000, 3);
        employees[8] = new Employee("Denis", "Khapilov", 46000, 4);
        employees[9] = new Employee("Artem", "Peskostruev", 40000, 3);

        System.out.println("Список всех сотрудников:");
        printEmployees();
        System.out.println("~~~~~~~~~~~~");
        System.out.println("Сумму затрат на ЗП в месяц равна " + salariesSumma());
        System.out.println("~~~~~~~~~~~~");
        System.out.println("Cотрудник с минимальной ЗП: " + findMinSalary());
        System.out.println("~~~~~~~~~~~~");
        System.out.println("Cотрудник с максимальной ЗП: " + findMaxSalary());
        System.out.println("~~~~~~~~~~~~");
        System.out.println("Среднее значение зарплат равно " + averageSalary());
        System.out.println("~~~~~~~~~~~~");
        System.out.println("ФИО всех сотрудников:");
        printFIO();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int salariesSumma() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee findMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double averageSalary() {
        return (double) salariesSumma() / employees.length;
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSurName());
        }
    }
}