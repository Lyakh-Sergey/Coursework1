public class EmployeeBook {
    private final Employee[] employees;
    private int capacity;


    public EmployeeBook(int capacity) {
        this.capacity = capacity;
        employees = new Employee[capacity];
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }


    public void removeEmployee(int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == employeeId) {
                employees[i] = null;
            }
        }
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printAllEmployee() {
        for (Employee employee : employees) System.out.println(employee);
    }

    public double calculateTotalSumSalary() {
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary())) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary())) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public double calculateAverageSalary() {
        return Math.round((calculateTotalSumSalary() / employees.length) * 100.0) / 100.0;
    }

    public void printFullNameEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void indexSalaryEmployee(double percent) {
        double indexSalary;
        for (Employee employee : employees) {
            if (employee != null) {
                indexSalary = employee.getSalary() + employee.getSalary() * percent / 100;
                employee.setSalary(Math.round(indexSalary * 100.0) / 100.0);
            }
        }
    }

    public Employee findEmployeeWithMinSalaryInDepartment(int departmentId) {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && (departmentId == employee.getDepartment() && (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()))) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee findEmployeeWithMaxSalaryInDepartment(int departmentId) {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees)
            if (employee != null && (departmentId == employee.getDepartment() && (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()))) {
                employeeWithMaxSalary = employee;
            }
        return employeeWithMaxSalary;
    }

    public double calculateTotalSumSalaryInDepartment(int departmentId) {
        double sumInDepartment = 0.0;
        for (Employee employee : employees) {
            if (employee != null && departmentId == employee.getDepartment()) {
                sumInDepartment += employee.getSalary();
            }
        }
        return sumInDepartment;
    }

    public double calculateAverageSalaryInDepartment(int departmentId) {
        int employeesInDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == departmentId) {
                employeesInDepartment++;
            }
        }
        return Math.round((calculateTotalSumSalaryInDepartment(departmentId) / employeesInDepartment) * 100.0) / 100.0;
    }

    public void indexSalaryEmployeeInDepartment(int departmentId, double percentInDepartment) {
        double indexSalaryInDepartment;
        for (Employee employee : employees) {
            if (employee != null && departmentId == employee.getDepartment()) {
                indexSalaryInDepartment = employee.getSalary() + employee.getSalary() * percentInDepartment / 100;
                employee.setSalary(Math.round(indexSalaryInDepartment * 100.0) / 100.0);
            }
        }
    }


    public void printAllEmployeeInDepartment(int departmentId) {
        for (Employee employee : employees) {
            if (employee != null && departmentId == employee.getDepartment()) {
                System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary() + " руб.коп.");
            }
        }
    }

    public void findAndPrintAllEmployeesWithSalaryBelowTheNumber(double number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary() + " руб.коп.");
            }
        }
    }

    public void findAndPrintAllEmployeesWithSalaryAboveTheNumber(double number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary() + " руб.коп.");
            }
        }
    }
}