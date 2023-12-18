package testhospital;
import java.util.ArrayList;
import java.util.Scanner;
class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private int phone;
    public Person(String firstName, String lastName, String address, int age, int phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.phone = phone;}
    public String getFirstName() {
        return firstName;}
    public void setFirstName(String firstName) {
        this.firstName = firstName;}
    public String getLastName() {
        return lastName;}
    public void setLastName(String lastName) {
        this.lastName = lastName;}
    public String getAddress() {
        return address;}
    public void setAddress(String address) {
        this.address = address;}
    public int getAge() {
        return age;}
    public void setAge(int age) {
        this.age = age;}
    public int getPhone() {
        return phone;}
    public void setPhone(int phone) {
        this.phone = phone;}
    public void input(Scanner scanner) {
        System.out.print("First Name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Address: ");
        this.address = scanner.nextLine();
        System.out.print("Age: ");
        this.age = scanner.nextInt();
        System.out.print("Phone Number: ");
        this.phone = scanner.nextInt();
        scanner.nextLine();}
    public void display() {
        System.out.println("------------------------");
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Age: " + this.getAge());
        System.out.println("Phone Number: " + this.getPhone());
        System.out.println("------------------------");}}
