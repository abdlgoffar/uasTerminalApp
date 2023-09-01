package uasTerminalApp.services;

import uasTerminalApp.entities.Student;


public interface StudentService {
    public abstract boolean addStudentService(Student student);
    public  abstract Student findOneStudentByNameService(Student student);
}
