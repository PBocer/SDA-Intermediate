package quizgame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private static final String PATH_TO_RESULTS = "wyniki.txt";
    public static final String PATH_TO_QUESTIONS = "pytania.txt";


    public static List<String> getRanking() {
        List<String> result = null;
        try {
            result = Files.readAllLines(Paths.get(PATH_TO_RESULTS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Question> readAllQuestions() {
        //1. Odczytac wszystkie linie z pliku
        List<String> questionsFromFile = null;
        List<Question> questionList = new ArrayList<>();
        try {
            questionsFromFile = Files.readAllLines(Paths.get(PATH_TO_QUESTIONS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2. Zmapowac pytanie na obiekt typu Question
        for (int i = 0; i < questionsFromFile.size(); i += 6) {
            Question question = new Question();
            question.setTitle(questionsFromFile.get(i));
            question.getAnswers().add(questionsFromFile.get(i + 1));
            question.getAnswers().add(questionsFromFile.get(i + 2));
            question.getAnswers().add(questionsFromFile.get(i + 3));
            question.getAnswers().add(questionsFromFile.get(i + 4));
            question.setCorrectAnswer(questionsFromFile.get(i + 5));
            questionList.add(question);
        }


        return questionList;
    }

}