import java.util.Scanner;
public class Main {
    public static void takequize(Question question[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to java quize");
        String answer;
        int score = 0;
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i].question);
            System.out.println("Enter the ans: ");
            answer = sc.next();
            if(answer.equals(question[i].answer)){
                score++;
                System.out.println("Correct answer");
            }
            else {
                System.out.println("wrong answer");
                System.out.println(question[i].answer);
            }
        }
        System.out.println("Your score is: "+score);
    }
    public static void main(String[] args) {
        String s1 = "1) Which of the following option leads to the portability and security of Java?\n" +
                "\n" +
                "Bytecode is executed by JVM\n" +
                "The applet makes the Java code secure and portable\n" +
                "Use of exception handling\n" +
                "Dynamic binding between objects";
        String s2 = "1) Which of the following option leads to the portability and security of Java?\n" +
                "\n" +
                "Bytecode is executed by JVM\n" +
                "The applet makes the Java code secure and portable\n" +
                "Use of exception handling\n" +
                "Dynamic binding between objects";
        String s3 = "1) Which of the following option leads to the portability and security of Java?\n" +
                "\n" +
                "Bytecode is executed by JVM\n" +
                "The applet makes the Java code secure and portable\n" +
                "Use of exception handling\n" +
                "Dynamic binding between objects";
        String s4 = "1) Which of the following option leads to the portability and security of Java?\n" +
                "\n" +
                "Bytecode is executed by JVM\n" +
                "The applet makes the Java code secure and portable\n" +
                "Use of exception handling\n" +
                "Dynamic binding between objects";
        String s5 = "1) Which of the following option leads to the portability and security of Java?\n" +
                "\n" +
                "Bytecode is executed by JVM\n" +
                "The applet makes the Java code secure and portable\n" +
                "Use of exception handling\n" +
                "Dynamic binding between objects";
        Question [] question = {
                new Question(s1,"b"),
                new Question(s1,"b"),
                new Question(s1,"b"),
                new Question(s1,"b"),
        };
        Main.takequize(question);
    }
}
