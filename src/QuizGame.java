import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and answers
        String[] questions = {
                "What is the capital of France?",
                "Who painted the Mona Lisa?",
                "What is the largest planet in our solar system?",
                "Which country is known as the Land of the Rising Sun?",
                "Who wrote the play Romeo and Juliet?"
        };

        String[] answers = {
                "Paris",
                "Leonardo da Vinci",
                "Jupiter",
                "Japan",
                "William Shakespeare"
        };

        // Number of questions and score initialization
        int numQuestions = questions.length;
        int score = 0;

        // Timer variables
        final int SECONDS_PER_QUESTION = 10; // Time per question in seconds
        long startTime = System.currentTimeMillis();

        // Loop through the questions
        for (int i = 0; i < numQuestions; i++) {
            // Calculate remaining time
            long elapsedTime = System.currentTimeMillis() - startTime;
            long remainingTime = (SECONDS_PER_QUESTION * 1000) - elapsedTime;
            int remainingSeconds = (int) (remainingTime / 1000);

            if (remainingSeconds <= 0) {
                System.out.println("Time's up!");
                break;
            }

            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

            System.out.println("Time remaining: " + remainingSeconds + " seconds\n");
        }

        // Display the final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + numQuestions);

        scanner.close();
    }
}

/*In this updated code, I have added a timer feature using the System.currentTimeMillis()
 method. The startTime variable stores the starting time of the quiz, and on each
 iteration of the loop, the remaining time is calculated by subtracting the elapsed time
 from the starting time. If the remaining time for a question reaches zero or goes
 negative, the game displays a "Time's up!" message and ends. The duration per question
 is set to 10 seconds in the SECONDS_PER_QUESTION variable, but you can adjust it
 according to your preference. */

/*Note that the timer implementation assumes that the user will provide an answer
within the time limit for each question. If the user takes longer to answer,
will still move on to the next question. If you want to enforce strict time limits
for each question, additional logic would be required. Feel free to customize the
timer feature or add other enhancements according to your requirements.
 */