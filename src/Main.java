public class Main {

    public Employee[] employees;

    public Main() {
        employees = new Employee[10];
        initializeEmployees();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.printEmployee();
        System.out.println("Общая сумма затрат на заработную плату в месяц: " + main.getSumSalary());
        System.out.println("Сотрудник с минимальной зработной платой: " + main.getEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной заработной платой: " + main.getEmployeeWithMaxSalary());
        System.out.println("Средняя заработная плата в месяц: " + main.getMonthlyAverageSalary());
        System.out.println("Список сотрудников: ");
        main.printEmployeesFullNames();

    }

    public void initializeEmployees() {
        employees[0] = new Employee("Рогов Макар Федосеевич", 1, 15000);
        employees[1] = new Employee("Дмитриев Болеслав Семёнович", 2, 20000);
        employees[2] = new Employee("Шубин Аркадий Валентинович", 3, 30000);
        employees[3] = new Employee("Симонов Фрол Миронович", 4, 45000);
        employees[4] = new Employee("Кононов Алан Макарович", 5, 55000);
        employees[5] = new Employee("Аксёнова Моника Мэлоровна", 1, 16000);
        employees[6] = new Employee("Сорокина Гелена Матвеевна", 2, 21000);
        employees[7] = new Employee("Крылова Цветана Эльдаровна", 3, 31000);
        employees[8] = new Employee("Моисеева Нания Валерьяновна", 4, 46000);
        employees[9] = new Employee("Артемьева Илона Платоновна", 5, 56000);
    }

    public void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int getSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }
    public Employee getEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double getMonthlyAverageSalary() {
        double monthlyAverageSalary = getSumSalary() / employees.length;
        return monthlyAverageSalary;
    }
    public void printEmployeesFullNames() {
        int idCount = 1;
        for (Employee employee : employees) {
            System.out.printf("%d. %s%n", idCount, employee.getFullName());
            idCount++;

        }

    }
}
