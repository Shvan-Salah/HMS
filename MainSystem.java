package testhospital;
import java.util.Scanner;
public class MainSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMainMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Add Patient info: ");
                    addRecord("Patient", scanner);break;
                case 2:
                    System.out.println("Add Employee info: ");
                    addRecord("Employee", scanner);break;
                case 3:
                    System.out.println("Add Doctor info: ");
                    addRecord("Doctor", scanner); break;
                case 4:
                    editRecord("Patient", scanner); break;
                case 5:
                    editRecord("Employee", scanner);break;
                case 6:
                    editRecord("Doctor", scanner);break;
                case 7:
                    viewRecord("Patient");break;
                case 8:
                    viewRecord("Employee");break;
                case 9:
                    viewRecord("Doctor");break;
                case 10:
                    deleteRecord("Patient", scanner);break;
                case 11:
                    deleteRecord("Employee", scanner);break;
                case 12:
                    deleteRecord("Doctor", scanner);break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;}}}
    private static void displayMainMenu() {
        System.out.println("\n\t\t\t\tMain Menu");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("| 1. Add Patient      |" + "\t| 2. Add Employee     |" + "\t| 3. Add Doctor       |");
        System.out.println("| 4. Edit Patient     |" + "\t| 5. Edit Employee    |" + "\t| 6. Edit Doctor      |");
        System.out.println("| 7. View Patient     |" + "\t| 8. View Employee    |" + "\t| 9. View Doctor      |");
        System.out.println("| 10. Delete Patient  |" + "\t| 11. Delete Employee |" + "\t| 12. Delete Doctor   |");
        System.out.println("\t\t\t| 0. Exit             |");
        System.out.println("-------------------------------------------------------------------------");}
    private static void addRecord(String recordType, Scanner scanner) {
        Person person = createPerson(recordType);
        person.input(scanner);
        switch (recordType) {
            case "Patient":
                Patient.getPatients().add((Patient) person); break;
            case "Employee":
                Employee.getEmployees().add((Employee) person); break;
            case "Doctor":
                Doctor.getDoctors().add((Doctor) person); break;
            default:
                throw new IllegalArgumentException("Invalid record type: " + recordType);}
        System.out.println("Successfully added " + recordType + ".");}
    private static void editRecord(String recordType, Scanner scanner) {
        System.out.println("Enter the ID of the " + recordType + " to edit: ");
        String idToEdit = scanner.next();
        Person person = null;
        switch (recordType) {
            case "Patient":
                for (Patient patient : Patient.getPatients()) {
                    if (patient.getPatientId().equalsIgnoreCase(idToEdit)) {
                        person = patient;break;}} break;
            case "Employee":
                for (Employee employee : Employee.getEmployees()) {
                    if (employee.getEmployeeId().equalsIgnoreCase(idToEdit)) {
                        person = employee;break;}}break;
            case "Doctor":
                for (Doctor doctor : Doctor.getDoctors()) {
                    if (doctor.getDoctorId().equalsIgnoreCase(idToEdit)) {
                        person = doctor;break;}}break;
            default:
                System.out.println("Invalid record type: " + recordType);
                return;}
        if (person != null) {
            person.input(scanner);
            System.out.println("Record updated successfully.");
        } else {
            System.out.println("No " + recordType + " record found with ID: " + idToEdit);}}
    private static void viewAllRecords(String recordType) {
        switch (recordType) {
            case "Patient":
                for (Patient patient : Patient.getPatients()) {
                    patient.display();}break;
            case "Employee":
                for (Employee employee : Employee.getEmployees()) {
                    employee.display();}break;
            case "Doctor":
                for (Doctor doctor : Doctor.getDoctors()) {
                    doctor.display();}break;
            default:
                System.out.println("Invalid record type: " + recordType); break;}}
    private static void viewRecord(String recordType) {
        System.out.println("Viewing " + recordType + ":");
        viewAllRecords(recordType);}
    private static void deleteRecord(String recordType, Scanner scanner) {
        System.out.println("Enter the ID of the " + recordType + " to delete: ");
        String idToDelete = scanner.next();
        boolean recordFound = false;
        switch (recordType) {
            case "Patient":
                for (Patient patient : Patient.getPatients()) {
                    if (patient.getPatientId().equalsIgnoreCase(idToDelete)) {
                        Patient.getPatients().remove(patient);
                        recordFound = true;break;}}break;
            case "Employee":
                for (Employee employee : Employee.getEmployees()) {
                    if (employee.getEmployeeId().equalsIgnoreCase(idToDelete)) {
                        Employee.getEmployees().remove(employee);
                        recordFound = true;break;  }}break;
            case "Doctor":
                for (Doctor doctor : Doctor.getDoctors()) {
                    if (doctor.getDoctorId().equalsIgnoreCase(idToDelete)) {
                        Doctor.getDoctors().remove(doctor);
                        recordFound = true;break;}}break;
            default:
                System.out.println("Invalid record type: " + recordType);return;}
        if (recordFound) {
            System.out.println("Successfully deleted " + recordType + " record with ID: " + idToDelete);
        } else {
            System.out.println("No " + recordType + " record found with ID: " + idToDelete);}}
      private static Person createPerson(String recordType) {
        switch (recordType) {
            case "Patient":
                return new Patient();
            case "Employee":
                return new Employee();
            case "Doctor":
                return new Doctor();
            default:
                throw new IllegalArgumentException("Invalid record type: " + recordType);
        }}}