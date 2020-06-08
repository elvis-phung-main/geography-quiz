import java.util.Scanner;

/**
 * The geographyQuiz class gives 5 geography questions.
 * You cannot proceed to the next question until you answer correctly.
 * Number of incorrect answers is given once finished.
 */
public class geographyQuiz {
    public static void main(String[]args)
    {

    /**
     * An array containing the questions
     */
    String questions[] = {   
                        "What is the capital city of Russia",
                        "What is the most populous Asian country?",
                        "How many countries are there in Asia?",
                        "Which city in Africa is the biggest, by population?",
                        "Which country is the city Stockholm in?"
                        };
    /**
     * An array containing the answers, with respect to the questions array
     */
    String answers[] =  {
                       "Moscow",
                       "China",
                       "49",
                       "Lagos",
                       "Sweden"            
                        };
    
    Scanner sc = new Scanner(System.in); // Scanner initialized
    int attempts = 0; // Attempt counter initialized at 1
    String answer; // Declare answer variable to hold user's answer

    /**
     * A starting message
     */
    System.out.println("Enter your answers to the questions.\nYou can move on if you enter the correct answers");
    System.out.println("Perfect attempts amount is: " + questions.length);
    /**
     * Iterate through each question in the array
     */
    for(int i = 0; i < questions.length; i++)
    {
        /**
         * Display the question with the question order number
         */
        System.out.println("Question " + (i+1) + ":");
        System.out.println(questions[i]);

        answer = sc.nextLine(); // Take user input

        /**
         * If the user gets the wrong answer:
         * Message is displayed saying it is incorrect
         * Attempt amount is incremented    
         */
        while(!answer.equalsIgnoreCase(answers[i]))
        {
            System.out.println("Incorrect answer, try again.");
            answer = sc.nextLine();
            attempts++;
        }
        /**
         * Display correct answer message when answer is correct
         */
        System.out.println("CORRECT ANSWER");
        attempts++;
    }
    /**
     * Output completion message
     * and number of answers inputted
     */
    sc.close();
    System.out.println("Quiz complete");
    System.out.println("Total answers inputted: " + attempts);
    System.out.println("Best possible was: " + questions.length);  
    }      
}