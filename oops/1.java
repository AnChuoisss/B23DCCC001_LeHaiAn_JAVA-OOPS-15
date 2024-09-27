class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double calculateSalary() {
        return 0;
    }
}

class OfficeEmployee extends Employee {
    private int workingDays;
    private static final double DAILY_WAGE = 100.0;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        if (workingDays < 0) {
            throw new IllegalArgumentException("Số ngày làm việc không thể nhỏ hơn 0.");
        }
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return workingDays * DAILY_WAGE;
    }
}

class TechnicalEmployee extends Employee {
    private int workingHours;
    private double hourlyWage;

    public TechnicalEmployee(String name, int age, int workingHours, double hourlyWage) {
        super(name, age);
        if (workingHours < 0 || hourlyWage < 0) {
            throw new IllegalArgumentException("Số giờ làm việc và tiền công theo giờ phải lớn hơn 0.");
        }
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyWage;
    }
}

class EmployeeManagement {
    public static void main(String[] args) {
        try {
            OfficeEmployee officeEmployee = new OfficeEmployee("Nguyễn Văn A", 30, 20);
            System.out.println("Lương nhân viên văn phòng: " + officeEmployee.calculateSalary());

            TechnicalEmployee technicalEmployee = new TechnicalEmployee("Trần Thị B", 28, 160, 50.0);
            System.out.println("Lương nhân viên kỹ thuật: " + technicalEmployee.calculateSalary());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
