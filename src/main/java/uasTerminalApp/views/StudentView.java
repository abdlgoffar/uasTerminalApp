package uasTerminalApp.views;

import uasTerminalApp.entities.Student;
import uasTerminalApp.helpers.UserRequest;
import uasTerminalApp.repositories.StudentRepositoryImplement;
import uasTerminalApp.services.StudentService;
import uasTerminalApp.services.StudentServiceImplement;

public class StudentView {
    private StudentService studentService = new StudentServiceImplement(new StudentRepositoryImplement());
    public Long  addStudentView() {
        String requestStudentName = UserRequest.request("name student");
        Student student = new Student();
        student.setName(requestStudentName);
        this.studentService.addStudentService(student);
        Student oneStudentByNameService = this.studentService.findOneStudentByNameService(student);
        return oneStudentByNameService.getId();
    }
    public Student findOneStudentView(String name) {
        Student student = new Student();
        student.setName(name);
        Student oneStudentByNameService = this.studentService.findOneStudentByNameService(student);
        return  oneStudentByNameService;
    }
}
