package uasTerminalApp.services;

import uasTerminalApp.entities.Teacher;

public interface TeacherService {
    public abstract boolean addTeacherService(Teacher teacher);
    public abstract Teacher findOneTeacherByNameService(Teacher teacher);
}
