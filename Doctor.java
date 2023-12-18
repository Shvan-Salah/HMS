package testhospital;
import java.util.ArrayList;
import java.util.Scanner;
class Doctor extends Person {
    private static int doctorCount = 1;
    private String doctorId;
    private double salary;
    private String specialist;
    private String department;

    private static ArrayList<Doctor> doctors = new ArrayList<>();
    public Doctor() {
        super("", "", "", 0, 0);
        this.doctorId = "D" + doctorCount++;}
    public static void setDoctorCount(int doctorCount) {
        Doctor.doctorCount = doctorCount;}
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;}
    public void setSalary(double salary) {
        this.salary = salary;}
    public void setSpecialist(String specialist) {
        this.specialist = specialist;}
    public void setDepartment(String department) {
        this.department = department;}
    public static void setDoctors(ArrayList<Doctor> doctors) {
        Doctor.doctors = doctors;}
    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Enter salary: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter specialist: ");
        this.specialist = scanner.next();
        System.out.println("Enter department: ");
        this.department = scanner.next();}
    @Override
    public void display() {
        super.display();
        System.out.println("Doctor ID: " + this.getDoctorId());
        System.out.println("Specialist: " + this.getSpecialist());
        System.out.println("Salary: $" + this.getSalary());
        System.out.println("Department: " + this.getDepartment());}
    public String getDoctorId() {
        return doctorId;}
    public double getSalary() {
        return salary;}
    public String getSpecialist() {
        return specialist;}
    public String getDepartment() {
        return department;}
    public static ArrayList<Doctor> getDoctors() {
        return doctors;}}