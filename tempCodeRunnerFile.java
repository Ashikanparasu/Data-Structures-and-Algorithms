import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizApp extends JFrame implements ActionListener {
    private JLabel questionLabel;
    private JRadioButton option1, option2, option3, option4;
    private JButton submitButton;
    private ButtonGroup optionsGroup;
    private int currentQuestion = 0;
    private int score = 0;
    private String[] questions = {
            "Which of the following is not a Java feature?",
            "Which keyword is used to inherit a class in Java?",
            "Which method is the entry point of a Java program?"
    };
    private String[][] options = {
            {"Object-Oriented", "Platform-Independent", "Pointers", "Secure"},
            {"this", "super", "extends", "implements"},
            {"start()", "main()", "run()", "init()"}
    };
    private int[] correctAnswers = {2, 2, 1};

    public QuizApp() {
        setTitle("Unit Test Practice App");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1));
        questionLabel = new JLabel();
        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();
        optionsGroup = new ButtonGroup();
        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(questionLabel);
        add(option1);
        add(option2);
        add(option3);
        add(option4);
        add(submitButton);
        loadQuestion();
    }

    private void loadQuestion() {
        if (currentQuestion < questions.length) {
            questionLabel.setText("Q" + (currentQuestion + 1) + ": " + questions[currentQuestion]);
            option1.setText(options[currentQuestion][0]);
            option2.setText(options[currentQuestion][1]);
            option3.setText(options[currentQuestion][2]);
            option4.setText(options[currentQuestion][3]);
            optionsGroup.clearSelection();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Quiz Over! Your Score: " + score + "/" + questions.length);
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedOption = -1;
        if (option1.isSelected()) selectedOption = 0;
        else if (option2.isSelected()) selectedOption = 1;
        else if (option3.isSelected()) selectedOption = 2;
        else if (option4.isSelected()) selectedOption = 3;
        if (selectedOption == -1) {
            JOptionPane.showMessageDialog(this, "Please select an option!");
            return;
        }
        if (selectedOption == correctAnswers[currentQuestion]) {
            score++;
            JOptionPane.showMessageDialog(this, "Correct!");
        } else {
            JOptionPane.showMessageDialog(this, "Wrong! Correct answer is: " +
                    options[currentQuestion][correctAnswers[currentQuestion]]);
        }
        currentQuestion++;
        loadQuestion();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new QuizApp().setVisible(true);
        });
    }
}
