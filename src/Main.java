public class Main {
    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 45_678.67);
        employees[1] = new Employee("Петров Петр Петрович", 3, 34_348.98);
        employees[2] = new Employee("Сидоров Олег Олегович", 2, 57_567.64);
        employees[3] = new Employee("Сергеев Сергей Сергеевич", 4, 67_321.67);
        employees[4] = new Employee("Бедный Артем Степанович", 2, 54_342.87);
        employees[5] = new Employee("Хитрая Татьяна Владимировна", 5, 87_989.63);
        employees[6] = new Employee("Лидер Степан Александрович", 5, 97_567.34);
        employees[7] = new Employee("Работяга Илья Иванович", 1, 42_897.28);
        employees[8] = new Employee("Труд Ольга Викторовна", 1, 42_666.21);
        employees[9] = new Employee("Зам Карина Алексеевна", 5, 94_632.65);

        printAllEmployee();
        double sum = calculateTotalSumSalary();
        System.out.println("Сумма затрат на ЗП в месяц: " + sum + " руб.коп.");
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой в размере " + employeeWithMinSalary.getSalary() + " руб.коп. - " + employeeWithMinSalary.getFullName());
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой в размере " + employeeWithMaxSalary.getSalary() + " руб.коп. - " + employeeWithMaxSalary.getFullName());
        double averageSalary = calculateAverageSalary();
        System.out.println("Средняя зарплата сотрудников состовляет: " + averageSalary + " руб.коп.");
        printFullNameEmployee();

    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double calculateTotalSumSalary() {
        double sum = 0.0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static double calculateAverageSalary() {
        return Math.round((calculateTotalSumSalary() / employees.length) * 100.0) / 100.0;
    }

    public static void printFullNameEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}