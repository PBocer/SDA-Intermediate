package quizgame;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Podaj nick
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println("QUIZ");
            System.out.println("1. Nowy quiz");
            System.out.println("2. Lista wynikow");
            System.out.println("0. Wyjscie");
            option = scanner.nextInt();
            switch (option){
                case 1:{
                    System.out.println("NOWY QUIZ");
                    Quiz quiz = new Quiz();
                    List<Question> questions = quiz.readAllQuestions();

                    for (Question q : questions){
                        System.out.println(q);
                    }
                    break;
                }
                case 2:{
                    System.out.println("NAJWYZSZE WYNIKI");
                    List<String> ranking = Quiz.getRanking();
                    if(ranking != null){
                        for(String wynik : ranking){
                            System.out.println(wynik);
                        }
                    }else {
                        System.out.println("Brak wynikow");
                    }

                    break;
                }
                case 0:{
                    System.out.println("Wychodze z programu");
                    break;
                }
            }
        }


    }
}