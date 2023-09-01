package uasTerminalApp.views;

import uasTerminalApp.entities.ChoiceB;
import uasTerminalApp.helpers.UserRequest;
import uasTerminalApp.repositories.ChoiceBRepositoryImplement;
import uasTerminalApp.services.ChoiceBService;
import uasTerminalApp.services.ChoiceBServiceImplement;


public class ChoiceBView {
    private ChoiceBService choiceBService = new ChoiceBServiceImplement(new ChoiceBRepositoryImplement());
    public void addChoiceBView(Long idQuestion) {
        String requestChoiceBName = UserRequest.request("fill choose b");
        ChoiceB choiceB = new ChoiceB();
        choiceB.setIdQuestion(idQuestion);
        choiceB.setName(requestChoiceBName);
        this.choiceBService.addChoiceBService(choiceB);
    }
    public void findOneChoiceBByIdQuestionView(Long idQuestion) {
        ChoiceB choiceB = new ChoiceB();
        choiceB.setIdQuestion(idQuestion);
        ChoiceB oneChoiceBByIdQuestionService = this.choiceBService.findOneChoiceBByIdQuestionService(choiceB);
        System.out.println("b. " + oneChoiceBByIdQuestionService.getName());
    }
    public void updateOneChoiceBByIdQuestionView(Long idQuestion) {
        ChoiceB choiceB = new ChoiceB();
        choiceB.setIdQuestion(idQuestion);
        this.choiceBService.updateOneChoiceBByIdQuestionService(choiceB);
    }
    public ChoiceB findOneChoiceBValueStatusTrueByIdQuestionView(Long idQuestion) {
        ChoiceB choiceB = new ChoiceB();
        choiceB.setIdQuestion(idQuestion);
        ChoiceB oneChoiceBValueStatusTrueByIdQuestionService = this.choiceBService.findOneChoiceBValueStatusTrueByIdQuestionService(choiceB);
        return  oneChoiceBValueStatusTrueByIdQuestionService;
    }
}
