public class Main {


    public final static Employee[] employees = new Employee[10];

    public static void initEmployees(){
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

    public static void main (String[] agrs) {
        initEmployees();
        printEmployee();
        System.out.println("Общая сумма ЗП сотрудников " + getSumSalary());
        System.out.println("Минимальная зарплата " + getEmployeeWithMinSalary());
        System.out.println("Максимальная зарплата " + getEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП " + getMonthlyAverageSalary());
        printEmployeesFullNames();
    }

    private static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int getSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    private static Employee getEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    private static Employee getEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    private static double getMonthlyAverageSalary() {
        double monthlyAverageSalary = getSumSalary() / employees.length;
        return monthlyAverageSalary;
    }

   private static void printEmployeesFullNames() {
       for (Employee employee : employees) {
           System.out.println(employee.getFullName());
       }




    }
}
