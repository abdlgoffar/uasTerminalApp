package uasTerminalApp.repositories;

import uasTerminalApp.entities.Student;

public interface StudentRepository {
    public abstract boolean addStudentRepos(Student student);

    public abstract Student findOneStudentByNameRepos(Student student);
}
