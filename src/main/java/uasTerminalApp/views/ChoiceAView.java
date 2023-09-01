package uasTerminalApp.views;

import uasTerminalApp.entities.ChoiceA;
import uasTerminalApp.helpers.UserRequest;
import uasTerminalApp.repositories.ChoiceARepositoryImplement;
import uasTerminalApp.services.ChoiceAService;
import uasTerminalApp.services.ChoiceAServiceImplement;

public class ChoiceAView {
    private ChoiceAService choiceAService = new ChoiceAServiceImplement(new ChoiceARepositoryImplement());
    public void addChoiceAView(Long idQuestion) {
        String requestChoiceAName = UserRequest.request("fill choose a");
        ChoiceA choiceA = new ChoiceA();
        choiceA.setIdQuestion(idQuestion);
        choiceA.setName(requestChoiceAName);
        this.choiceAService.addChoiceAService(choiceA);
    }
    public void findOneChoiceAByIdQuestionView(Long idQuestion) {
        ChoiceA choiceA = new ChoiceA();
        choiceA.setIdQuestion(idQuestion);
        ChoiceA oneChoiceAByIdQuestionService = this.choiceAService.findOneChoiceAByIdQuestionService(choiceA);
        System.out.println("a. " + oneChoiceAByIdQuestionService.getName());
    }
    public void updateOneChoiceAByIdQuestionView(Long idQuestion) {
        ChoiceA choiceA = new ChoiceA();
        choiceA.setIdQuestion(idQuestion);
        this.choiceAService.updateOneChoiceAByIdQuestionService(choiceA);
    }

    public ChoiceA findOneChoiceAValueStatusTrueByIdQuestionView(Long idQuestion) {
        ChoiceA choiceA = new ChoiceA();
        choiceA.setIdQuestion(idQuestion);
        ChoiceA oneChoiceAValueStatusTrueByIdQuestionService = this.choiceAService.findOneChoiceAValueStatusTrueByIdQuestionService(choiceA);
        return oneChoiceAValueStatusTrueByIdQuestionService;
    }
}
