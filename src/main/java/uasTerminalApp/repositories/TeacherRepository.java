package uasTerminalApp.repositories;

import uasTerminalApp.entities.Teacher;

public interface TeacherRepository {
    public abstract boolean addTeacherRepos(Teacher teacher);

    public abstract Teacher findOneTeacherByNameRepos(Teacher teacher);
}
