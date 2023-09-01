package uasTerminalApp.views;

import uasTerminalApp.entities.Teacher;
import uasTerminalApp.helpers.UserRequest;
import uasTerminalApp.repositories.TeacherRepositoryImplement;
import uasTerminalApp.services.TeacherService;
import uasTerminalApp.services.TeacherServiceImplement;

public class TeacherView {

    private TeacherService teacherService = new TeacherServiceImplement(new TeacherRepositoryImplement());

    public Long addTeacherView() {
        String requestTeacherName = UserRequest.request("name teacher");
        Teacher teacher = new Teacher();
        teacher.setName(requestTeacherName);
        this.teacherService.addTeacherService(teacher);
        Teacher oneTeacherByNameService = this.teacherService.findOneTeacherByNameService(teacher);
        return oneTeacherByNameService.getId();
    }
    public Teacher findOneTeacherView(String name) {
        Teacher teacher = new Teacher();
        teacher.setName(name);;
        Teacher oneTeacherByNameService = this.teacherService.findOneTeacherByNameService(teacher);
        return  oneTeacherByNameService;
    }
}
