package uasTerminalApp.services;

import uasTerminalApp.entities.ChoiceB;

public interface ChoiceBService {
    public abstract boolean addChoiceBService(ChoiceB choiceB);
    public abstract ChoiceB findOneChoiceBByIdQuestionService(ChoiceB choiceB);
    public abstract boolean updateOneChoiceBByIdQuestionService(ChoiceB choiceB);
    public abstract ChoiceB findOneChoiceBValueStatusTrueByIdQuestionService(ChoiceB choiceB);
}
