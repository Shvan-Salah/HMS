package testhospital;
import java.util.ArrayList;
import java.util.Scanner;

    class Employee extends Person {
            private static int employeeCount = 1;
            private String employeeId;
            private String jobTitle;
            private double salary;
            private String department;
            private String image;
            
    private static ArrayList<Employee> employees = new ArrayList<>();
    public Employee() {
        super("", "", "", 0, 0);
        this.employeeId = "E" + employeeCount++;}
    public static int getEmployeeCount() {
        return employeeCount;}
    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;}
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;}
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;}
    public void setSalary(double salary) {
        this.salary = salary;}
    public void setDepartment(String department) {
        this.department = department;}
    public void setImage(String image) {
        this.image = image;}
    public static void setEmployees(ArrayList<Employee> employees) {
        Employee.employees = employees;}
    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Enter Job Title: ");
        this.jobTitle = scanner.next();
        System.out.println("Enter Salary: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Department: ");
        this.department = scanner.next();
        System.out.println("Enter Image: ");
        this.image = scanner.next();}
    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + this.getEmployeeId());
        System.out.println("Job Title: " + this.getJobTitle());
        System.out.println("Salary: $" + this.getSalary());
        System.out.println("Department: " + this.getDepartment());
        System.out.println("Image: " + this.getImage());}
    public String getEmployeeId() {
        return employeeId;}
    public String getJobTitle() {
        return jobTitle;}
    public double getSalary() {
        return salary;}
    public String getDepartment() {
        return department;}
    public String getImage() {
        return image;}
    public static ArrayList<Employee> getEmployees() {
        return employees;}}