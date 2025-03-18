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
        System.out.println();
        double sum = calculateTotalSumSalary();
        System.out.println("Сумма затрат на ЗП в месяц: " + sum + " руб.коп.");
        System.out.println();
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой в размере " + employeeWithMinSalary.getSalary() + " руб.коп. - " + employeeWithMinSalary.getFullName());
        System.out.println();
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой в размере " + employeeWithMaxSalary.getSalary() + " руб.коп. - " + employeeWithMaxSalary.getFullName());
        System.out.println();
        double averageSalary = calculateAverageSalary();
        System.out.println("Средняя зарплата сотрудников состовляет: " + averageSalary + " руб.коп.");
        System.out.println();
        printFullNameEmployee();
        System.out.println();
        double percent = 10.2;
        indexSalaryEmployee(percent);
        printAllEmployee();
        System.out.println();
        int departmentId = 1;
        Employee employeeWithMinSalaryInDepartment = findEmployeeWithMinSalaryInDepartment(departmentId);
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + employeeWithMinSalaryInDepartment.getDepartment() + " в размере " + employeeWithMinSalaryInDepartment.getSalary() + " руб.коп. - " + employeeWithMinSalaryInDepartment.getFullName());
        System.out.println();
        Employee employeeWithMaxSalaryInDepartment = findEmployeeWithMaxSalaryInDepartment(departmentId);
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + employeeWithMaxSalaryInDepartment.getDepartment() + " в размере " + employeeWithMaxSalaryInDepartment.getSalary() + " руб.коп. - " + employeeWithMaxSalaryInDepartment.getFullName());
        System.out.println();
        double sumInDepartment = calculateTotalSumSalaryInDepartment(departmentId);
        System.out.println("Сумма затрат на ЗП по отделу " + departmentId + " в месяц: " + sumInDepartment + " руб.коп.");
        System.out.println();
        double averageSalaryInDepartment = calculateAverageSalaryInDepartment(departmentId);
        System.out.println("Средняя зарплата сотрудников в отделе " + departmentId + " состовляет: " + averageSalaryInDepartment + " руб.коп.");
        System.out.println();
        double percentInDepartment = 9.5;
        indexSalaryEmployeeInDepartment(departmentId, percentInDepartment);
        printAllEmployeeInDepartment(departmentId);
        System.out.println();
        double number = 60_000.0;
        findAndPrintAllEmployeesWithSalaryBelowTheNumber(number);
        System.out.println();
        findAndPrintAllEmployeesWithSalaryAboveTheNumber(number);
    }

    private static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double calculateTotalSumSalary() {
        double sum = 0.0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateAverageSalary() {
        return Math.round((calculateTotalSumSalary() / employees.length) * 100.0) / 100.0;
    }

    private static void printFullNameEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    private static void indexSalaryEmployee(double percent) {
        double indexSalary;
        for (Employee employee : employees) {
            indexSalary = employee.getSalary() + employee.getSalary() * percent / 100;
            employee.setSalary(Math.round(indexSalary * 100.0) / 100.0);
        }
    }

    private static Employee findEmployeeWithMinSalaryInDepartment(int departmentId) {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (departmentId == employee.getDepartment() && (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary())) {
                    employeeWithMinSalary = employee;
                }
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalaryInDepartment(int departmentId) {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (departmentId == employee.getDepartment()) {
                if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateTotalSumSalaryInDepartment(int departmentId) {
        double sumInDepartment = 0.0;
        for (Employee employee : employees) {
            if (departmentId == employee.getDepartment()) {
                sumInDepartment += employee.getSalary();
            }
        }
        return sumInDepartment;
    }

    private static double calculateAverageSalaryInDepartment(int departmentId) {
        int employeesInDepartment = 0;
        for (Employee employee : employees) {
            if (departmentId == employee.getDepartment()) {
                employeesInDepartment++;
            }
        }
        return Math.round((calculateTotalSumSalaryInDepartment(departmentId) / employeesInDepartment) * 100.0) / 100.0;
    }

    private static void indexSalaryEmployeeInDepartment(int departmentId, double percentInDepartment) {
        double indexSalaryInDepartment;
        for (Employee employee : employees) {
            if (departmentId == employee.getDepartment()) {
                indexSalaryInDepartment = employee.getSalary() + employee.getSalary() * percentInDepartment / 100;
                employee.setSalary(Math.round(indexSalaryInDepartment * 100.0) / 100.0);
            }
        }
    }

    private static void printAllEmployeeInDepartment(int departmentId) {
        for (Employee employee : employees) {
            if (departmentId == employee.getDepartment()) {
                System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary() + " руб.коп.");
            }
        }
    }

    private static void findAndPrintAllEmployeesWithSalaryBelowTheNumber(double number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary() + " руб.коп.");
            }
        }

    }

    private static void findAndPrintAllEmployeesWithSalaryAboveTheNumber(double number) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary() + " руб.коп.");
            }
        }

    }
}
