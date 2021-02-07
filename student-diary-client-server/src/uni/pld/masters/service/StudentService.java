package uni.pld.masters.service;

import java.util.Collection;

import uni.pld.masters.dataprovider.StudentDataProvider;
import uni.pld.masters.model.Student;

public class StudentService {

    private final StudentDataProvider studentDataProvider = new StudentDataProvider();

    public Collection<Student> findStudents() {
        return studentDataProvider.getStudents();
    }

    public long createStudent(Student student) {
        return studentDataProvider.addStudent(student);
    }

}
