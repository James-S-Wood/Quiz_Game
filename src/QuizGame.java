import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and answers
        String[] questions = {
                "What is the capital of France?",
                "Who painted the Mona Lisa?",
                "What is the largest planet in our solar system?"
        };

        String[] answers = {
                "Paris",
                "Leonardo da Vinci",
                "Jupiter"
        };

        // Number of questions and score initialization
        int numQuestions = questions.length;
        int score = 0;

        // Loop through the questions
        for (int i = 0; i < numQuestions; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        // Display the final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + numQuestions);

        scanner.close();
    }
}
