package uni.pld.masters;

import java.rmi.RemoteException;
import java.util.Objects;
import java.util.Scanner;

import uni.pld.masters.cli.ActionEnum;
import uni.pld.masters.service.client.specialty.SpecialityServiceStub;
import uni.pld.masters.service.client.specialty.SpecialityServiceStub.CreateSpeciality;
import uni.pld.masters.service.client.specialty.SpecialityServiceStub.FindSpecialities;
import uni.pld.masters.service.client.specialty.SpecialityServiceStub.FindSpecialitiesResponse;
import uni.pld.masters.service.client.specialty.SpecialityServiceStub.Specialty;
import uni.pld.masters.service.client.student.StudentServiceStub;
import uni.pld.masters.service.client.student.StudentServiceStub.CreateStudent;
import uni.pld.masters.service.client.student.StudentServiceStub.FindStudents;
import uni.pld.masters.service.client.student.StudentServiceStub.FindStudentsResponse;
import uni.pld.masters.service.client.student.StudentServiceStub.Student;
import uni.pld.masters.service.client.university.UniversityServiceStub;
import uni.pld.masters.service.client.university.UniversityServiceStub.CreateUniversity;
import uni.pld.masters.service.client.university.UniversityServiceStub.FindUniversities;
import uni.pld.masters.service.client.university.UniversityServiceStub.FindUniversitiesResponse;
import uni.pld.masters.service.client.university.UniversityServiceStub.University;

/**
 * 
 * Class that is starting point of the command line interface of client side
 * 
 * @author nstoilov
 *
 */
public class CliClient {

    private static StudentServiceStub studentServiceStub;
    private static UniversityServiceStub universityServiceStub;
    private static SpecialityServiceStub specialityServiceStub;
    private static Scanner scanner;

    public static void main(String[] args) throws RemoteException {
        studentServiceStub = new StudentServiceStub();
        universityServiceStub = new UniversityServiceStub();
        specialityServiceStub = new SpecialityServiceStub();

        while (true) {
            showActions();
            chooseAction();
        }

    }

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        return scanner;
    }

    private static void chooseAction() {
        System.err.println("Please choose an action: ");

        scanner = getScanner();
        int choice = scanner.nextInt();
        
        switch (ActionEnum.valueById(choice)) {
            case PRINT_STUDENTS:
                printStudents();
                break;
            case ADD_STUDENT:
                addStudent();
                break;
            case PRINT_SPECIALITIES:
                printSpecialities();
                break;
            case ADD_SPECIALITY:
                addSpeciality();
                break;
            case PRINT_UNIVERSITIES:
                printUniversities();
                break;
            case ADD_UNIVERSITY:
                addUniversity();
                break;

            default:
                break;
        }
    }

    private static void showActions() {
        for (ActionEnum action : ActionEnum.values()) {
            System.out.println(action.getId() + " : " + action.getName());
        }
    }

    private static void createStudent(StudentServiceStub studentServiceStub, Student student) throws RemoteException {
        CreateStudent createStudent = new CreateStudent();
        createStudent.setStudent(student);

        studentServiceStub.createStudent(createStudent);
        System.out.println("Student added");
    }
    
    private static void printStudents() {
        FindStudents findStudents = new FindStudents();

        FindStudentsResponse studentsResponse = null;
        try {
            studentsResponse = studentServiceStub.findStudents(findStudents);
        }
        catch (RemoteException e) {
            e.printStackTrace();
            System.err.println("Failed to fetch students!");
            return;
        }

        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(
                "| Column             | Faculty number     | First name         | Last name          | University                             | Speciality                             | Year               |");
        System.out.println(
                "|--------------------|--------------------|--------------------|--------------------|----------------------------------------|----------------------------------------|--------------------|");

        String dataAlignment = "| %-18s | %-18s | %-18s | %-18s | %-38s | %-38s | %-18d |%n";
        for (Student student : studentsResponse.get_return()) {
            System.out.format(dataAlignment, student.getId(), student.getFacultyNumber(), student.getFirstName(), student.getLastName(), student.getUniversity()
                    .getName(),
                    student.getSpecialty()
                            .getName(),
                    student.getYearOfStudying());
        }

        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

    }

    private static void printSpecialities() {
        FindSpecialities findSpecialities = new FindSpecialities();

        FindSpecialitiesResponse response;
        try {
            response = specialityServiceStub.findSpecialities(findSpecialities);
        }
        catch (RemoteException e) {
            e.printStackTrace();
            System.err.println("Failed to fetch specialities!");
            return;
        }
        
        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(
                "| Column             | Name                                   | Faculty                                | Years duration     | Magister degree    |");
        System.out.println(
                "|--------------------|----------------------------------------|----------------------------------------|--------------------|--------------------|");
        
        String dataAlignment = "| %-18s | %-38s | %-38s | %-18s | %-18s |%n";

        for (Specialty specialty : response.get_return()) {
            System.out.format(dataAlignment, specialty.getId(), specialty.getName(), specialty.getFaculty(), specialty.getYearsDuration(),
                    specialty.getMagisterDegree());
        }

        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------|");
    }

    private static void printUniversities() {
        FindUniversities findUniversities = new FindUniversities();

        FindUniversitiesResponse response;
        try {
            response = universityServiceStub.findUniversities(findUniversities);
        }
        catch (RemoteException e) {
            e.printStackTrace();
            System.err.println("Failed to fetch universities!");
            return;
        }

        System.out.println("|------------------------------------------------------------------------------------------------------|");
        System.out.println("| Column             | Name                                   | Location                               |");
        System.out.println("|--------------------|----------------------------------------|----------------------------------------|");

        String dataAlignment = "| %-18s | %-38s | %-38s |%n";
        for (University university : response.get_return()) {
            System.out.format(dataAlignment, university.getId(), university.getName(), university.getLocation());
        }

        System.out.println("|------------------------------------------------------------------------------------------------------|");
    }

    private static void addUniversity() {
        University university = new University();

        String name = null;
        System.out.println("Please enter name for university: ");
        while (isEmpty(name)) {
            name = scanner.nextLine();
        }

        String location = null;
        System.out.println("Please enter location for university: ");
        while (isEmpty(location)) {
            location = scanner.nextLine();
        }

        university.setName(name);
        university.setLocation(location);

        CreateUniversity createUniversity = new CreateUniversity();
        createUniversity.setUniversity(university);

        try {
            universityServiceStub.createUniversity(createUniversity);
        }
        catch (RemoteException e) {
            e.printStackTrace();
            System.err.println("Failed to create university");
            return;
        }

        System.out.println("University added successfully");
    }

    private static void addSpeciality() {
        Specialty speciality = new Specialty();
        
        String name = null;
        System.out.println("Please enter name for the speciality: ");
        while (isEmpty(name)) {
            name = scanner.nextLine();
        }
        
        String faculty = null;
        System.out.println("Please enter faculty for the speciality: ");
        while (isEmpty(faculty)) {
            faculty = scanner.nextLine();
        }
        
        Byte yearsDuration = null;
        System.out.println("Please enter years duration for speciality: ");
        while (yearsDuration == null) {
            yearsDuration = scanner.nextByte();
        }

        Boolean magisterDegree = null;
        System.out.println("Please enter if the speciality is for magister degree: (true/false)");
        while (magisterDegree == null) {
            String value = scanner.nextLine();
            if (Objects.equals(value, "true") || Objects.equals(value, "false")) {
                magisterDegree = Boolean.parseBoolean(value);
            }
        }
        
        speciality.setName(name);
        speciality.setFaculty(faculty);
        speciality.setYearsDuration(yearsDuration);
        speciality.setMagisterDegree(magisterDegree);

        CreateSpeciality createSpeciality = new CreateSpeciality();
        createSpeciality.setSpecialty(speciality);

        try {
            specialityServiceStub.createSpeciality(createSpeciality);
        }
        catch (RemoteException e) {
            e.printStackTrace();
            System.err.println("Failed to create speciality");
            return;
        }

        System.out.println("Speciality added successfully");
    }

    private static void addStudent() {
        Student student = new Student();

        String facultyNumber = null;
        System.out.println("Please enter faculty number of the student");
        while (isEmpty(facultyNumber)) {
            facultyNumber = scanner.nextLine();
        }

        String firstName = null;
        System.out.println("Please enter first name of the student");
        while (isEmpty(firstName)) {
            firstName = scanner.nextLine();
        }

        String lastName = null;
        System.out.println("Please enter last name of the student");
        while (isEmpty(lastName)) {
            lastName = scanner.nextLine();
        }

        StudentServiceStub.University university = null;
        printUniversities();
        System.out.println("Choose university of the student (enter number of the row of the university): ");
        while (university == null) {
            int universityId = scanner.nextInt();
            university = findUniversityById(universityId);
        }

        StudentServiceStub.Specialty speciality = null;
        printSpecialities();
        System.out.println("Choose speciality of the student (enter number of the row of the speciality): ");
        while (speciality == null) {
            int specialityId = scanner.nextInt();
            speciality = findSpecialityById(specialityId);
        }

        student.setFacultyNumber(facultyNumber);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setUniversity(university);
        student.setSpecialty(speciality);
        student.setYearOfStudying((byte) 1);

        CreateStudent createStudent = new CreateStudent();
        createStudent.setStudent(student);

        try {
            studentServiceStub.createStudent(createStudent);
        }
        catch (RemoteException e) {
            e.printStackTrace();
            System.err.println("Failed to create student");
            return;
        }

        System.out.println("Student added successfully");

    }

    private static StudentServiceStub.University findUniversityById(int id) {
        FindUniversities findUniversities = new FindUniversities();

        FindUniversitiesResponse response = null;
        try {
            response = universityServiceStub.findUniversities(findUniversities);
        }
        catch (RemoteException e) {
            e.printStackTrace();
            System.err.println("Failed to load universities");
            return null;
        }

        for (University university : response.get_return()) {
            if (university.getId() == id) {
                StudentServiceStub.University uni = null;
                try {
                    uni = StudentServiceStub.University.class.newInstance();
                }
                catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                    return null;
                }
                uni.setName(university.getName());
                uni.setLocation(university.getLocation());

                return uni;
            }
        }

        return null;
    }

    private static StudentServiceStub.Specialty findSpecialityById(int id) {
        FindSpecialities findSpecialities = new FindSpecialities();

        FindSpecialitiesResponse response = null;
        try {
            response = specialityServiceStub.findSpecialities(findSpecialities);
        }
        catch (RemoteException e) {
            e.printStackTrace();
            System.err.println("Failed to load specialities");
            return null;
        }

        for (Specialty speciality : response.get_return()) {
            if (speciality.getId() == id) {
                StudentServiceStub.Specialty spec = null;
                try {
                    spec = StudentServiceStub.Specialty.class.newInstance();
                }
                catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                    return null;
                }
                
                spec.setName(speciality.getName());
                spec.setFaculty(speciality.getFaculty());
                spec.setYearsDuration(speciality.getYearsDuration());
                spec.setMagisterDegree(speciality.getMagisterDegree());
                
                return spec;
            }
        }

        return null;
    }

    private static boolean isEmpty(String value) {
        return value == null || value.trim()
                .isEmpty();
    }

}
