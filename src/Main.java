public class Main {


    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);

        boolean added1 = employeeBook.addEmployee(new Employee("Иванов Иван Иванович", 1, 45_678.67));
        boolean added2 = employeeBook.addEmployee(new Employee("Свободный Сергей Иванович", 2, 25_679.23));
        boolean added3 = employeeBook.addEmployee(new Employee("Петров Петр Петрович", 3, 34_348.98));
        boolean added4 = employeeBook.addEmployee(new Employee("Сергеев Сергей Сергеевич", 2, 67_321.67));
        boolean added5 = employeeBook.addEmployee(new Employee("Бедный Артем Степанович", 4, 54_342.87));
        boolean added6 = employeeBook.addEmployee(new Employee("Хитрая Татьяна Владимировна", 5, 87_989.63));
        boolean added7 = employeeBook.addEmployee(new Employee("Лидер Степан Александрович", 5, 97_567.34));
        boolean added8 = employeeBook.addEmployee(new Employee("Работяга Илья Иванович", 1, 42_897.28));
        boolean added9 = employeeBook.addEmployee(new Employee("Труд Ольга Викторовна", 1, 42_666.21));
        boolean added10 = employeeBook.addEmployee(new Employee("Зам Карина Алексеевна", 5, 94_632.65));
        boolean added11 = employeeBook.addEmployee(new Employee("Лишний Андрей Владимрович", 5, 56_678.84));
        System.out.println("Добавить нового сотрудника, результат: " + added1);
        System.out.println("Добавить нового сотрудника, результат: " + added2);
        System.out.println("Добавить нового сотрудника, результат: " + added3);
        System.out.println("Добавить нового сотрудника, результат: " + added4);
        System.out.println("Добавить нового сотрудника, результат: " + added5);
        System.out.println("Добавить нового сотрудника, результат: " + added6);
        System.out.println("Добавить нового сотрудника, результат: " + added7);
        System.out.println("Добавить нового сотрудника, результат: " + added8);
        System.out.println("Добавить нового сотрудника, результат: " + added9);
        System.out.println("Добавить нового сотрудника, результат: " + added10);
        System.out.println("Добавить нового сотрудника, результат: " + added11);
        System.out.println("Список сотрудников: ");
        employeeBook.printAllEmployee();
        System.out.println();
        int employeeId = 2;
        employeeBook.removeEmployee(employeeId);
        System.out.println("Удаляем сотрудника с номером " + employeeId);
        System.out.println();
        System.out.println("Список сотрудников: ");
        employeeBook.printAllEmployee();
        System.out.println();
        int id = 8;
        System.out.println("Сотрудник с номером: " + employeeBook.getEmployeeById(id));
        System.out.println();
        double sum = employeeBook.calculateTotalSumSalary();
        System.out.println("Сумма затрат на ЗП в месяц: " + sum + " руб.коп.");
        System.out.println();
        Employee employeeWithMinSalary = employeeBook.findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой в размере " + employeeWithMinSalary.getSalary() + " руб.коп. - " + employeeWithMinSalary.getFullName());
        System.out.println();
        Employee employeeWithMaxSalary = employeeBook.findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой в размере " + employeeWithMaxSalary.getSalary() + " руб.коп. - " + employeeWithMaxSalary.getFullName());
        System.out.println();
        double averageSalary = employeeBook.calculateAverageSalary();
        System.out.println("Средняя зарплата сотрудников состовляет: " + averageSalary + " руб.коп.");
        System.out.println();
        System.out.println("ФИО сотрудников:");
        employeeBook.printFullNameEmployee();
        System.out.println();
        double percent = 10.2;
        System.out.println("Список сотрудников после индексации ЗП на " + percent + "%: ");
        employeeBook.indexSalaryEmployee(percent);
        employeeBook.printAllEmployee();
        System.out.println();
        int departmentId = 1;
        Employee employeeWithMinSalaryInDepartment = employeeBook.findEmployeeWithMinSalaryInDepartment(departmentId);
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + employeeWithMinSalaryInDepartment.getDepartment() + " в размере " + employeeWithMinSalaryInDepartment.getSalary() + " руб.коп. - " + employeeWithMinSalaryInDepartment.getFullName());
        System.out.println();
        Employee employeeWithMaxSalaryInDepartment = employeeBook.findEmployeeWithMaxSalaryInDepartment(departmentId);
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + employeeWithMaxSalaryInDepartment.getDepartment() + " в размере " + employeeWithMaxSalaryInDepartment.getSalary() + " руб.коп. - " + employeeWithMaxSalaryInDepartment.getFullName());
        System.out.println();
        double sumInDepartment = employeeBook.calculateTotalSumSalaryInDepartment(departmentId);
        System.out.println("Сумма затрат на ЗП по отделу " + departmentId + " в месяц: " + sumInDepartment + " руб.коп.");
        System.out.println();
        double averageSalaryInDepartment = employeeBook.calculateAverageSalaryInDepartment(departmentId);
        System.out.println("Средняя зарплата сотрудников в отделе " + departmentId + " состовляет: " + averageSalaryInDepartment + " руб.коп.");
        System.out.println();
        double percentInDepartment = 9.5;
        System.out.println("Список сотрудников " + departmentId + " отдела после индексации ЗП на " + percentInDepartment + "%: ");
        employeeBook.indexSalaryEmployeeInDepartment(departmentId, percentInDepartment);
        employeeBook.printAllEmployeeInDepartment(departmentId);
        System.out.println();
        double number = 60_000.00;
        System.out.println("Список сотрудников c ЗП меньше " + number + " руб.коп:");
        employeeBook.findAndPrintAllEmployeesWithSalaryBelowTheNumber(number);
        System.out.println();
        System.out.println("Список сотрудников c ЗП больше или равно " + number + " руб.коп:");
        employeeBook.findAndPrintAllEmployeesWithSalaryAboveTheNumber(number);
    }



}