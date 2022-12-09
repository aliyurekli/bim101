package lectures.lecture08;

/**
 * Please refer to the course material slide #8
 */
public class GradingMultipleChoiceTest {

    public static double evaluate(char[] keys, char[] answers) {
        int correct = 0;

        for (int i=0; i<keys.length; i++) {
            if (keys[i] == answers[i]) {
                correct ++;
            }
        }

        return correct * (100.0 / keys.length);
    }

    public static void main(String[] args) {

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        char[][] studentAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}
        };

        int id = 0;
        for (char[] answers: studentAnswers) {
            double grade = evaluate(keys, answers);
            System.out.printf("Student %d grade = %.2f\n", id++, grade);
        }
    }
}
