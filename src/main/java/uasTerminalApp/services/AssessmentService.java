package uasTerminalApp.services;

import uasTerminalApp.entities.Assessment;

public interface AssessmentService {
    abstract public boolean addAssessmentService(Assessment assessment);
    abstract public Assessment findOneAssessmentByNameService(Assessment assessment);
    abstract public Assessment findOneAssessmentByIdTeacherAndNameService(Assessment assessment);
}
