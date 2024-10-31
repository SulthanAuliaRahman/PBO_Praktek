
class Employee extends Sortable {
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary)
            return -1;
        if (salary > eb.salary)
            return +1;
        return 0;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireyear;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHireday() {
        return this.hireday;
    }

    public void setHireday(int hireday) {
        this.hireday = hireday;
    }

    public int getHiremonth() {
        return this.hiremonth;
    }

    public void setHiremonth(int hiremonth) {
        this.hiremonth = hiremonth;
    }

    public int getHireyear() {
        return this.hireyear;
    }

    public void setHireyear(int hireyear) {
        this.hireyear = hireyear;
    }

    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
}
