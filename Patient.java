package testhospital;
import java.util.ArrayList;
import java.util.Scanner;

class Patient extends Person {
    private static int patientCount = 1;
    private String patientId;
    private String diseaseType;
    private String result;

    private static ArrayList<Patient> patients = new ArrayList<>();
    public Patient() {
        super("", "", "", 0, 0);
        this.patientId = "P" + patientCount++;}
    public void setPatientId(int patientId) {
        this.patientId = "P" + patientId;}
    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;}
    public void setResult(String result) {
        this.result = result;}
    public static void setPatients(ArrayList<Patient> patients) {
        Patient.patients = patients;}
    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Enter disease type (Chaw-Shkawe-Hanawe) ");
        this.diseaseType = scanner.next();
        switch (this.diseaseType.toLowerCase()) {
            case "chaw" -> {
                System.out.println("1. Enter chaw result: ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Enter chaw result: ");
                    this.result = scanner.next();}}
            case "Shkawe" -> {
                System.out.println("2. Upload an X-ray or MRI report.");}  
                case "hanawe" -> {
                System.out.println("3. Enter CBC result: ");
                this.result = scanner.next();}
            default -> System.out.println("Invalid disease type.");}}
    @Override
    public void display() {
        super.display();
        System.out.println("Patient ID: " + this.getPatientId());
        System.out.println("Disease Type: " + this.getDiseaseType());
        if (this.result != null) {
            System.out.println("Result: " + this.result);}}
     public String getPatientId() {
     return patientId;}
    public String getDiseaseType() {
        return diseaseType;}
    public static ArrayList<Patient> getPatients() {
        return patients;}}