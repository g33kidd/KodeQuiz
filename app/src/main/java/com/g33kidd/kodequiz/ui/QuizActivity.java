package com.g33kidd.kodequiz.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.TextView;

import com.g33kidd.kodequiz.R;
import com.g33kidd.kodequiz.quiz.Quiz;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class QuizActivity extends ActionBarActivity {

    private Quiz quiz;

    @InjectView(R.id.questionsLeftLabel) TextView questionsLeftLabel;
    @InjectView(R.id.questionTitleLabel) TextView questionTitleLabel;
    @InjectView(R.id.nextQuestionButton) Button nextQuestionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ButterKnife.inject(this);

//        quiz = new Quiz();
//        quiz.setQuestions(questions);
//        quiz.setTitle("Guess The Language");
//        quiz.setCurrentQuestion(0);
//
//        updateQuestionDisplay();
//
//        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int currentQuestion = quiz.getCurrentQuestion() + 1;
//                quiz.setCurrentQuestion(currentQuestion);
//                updateQuestionDisplay();
//            }
//        });
    }

//    public void updateQuestionDisplay() {
//        // Set the question counter label.... could be made simpler
//        int questionCount = quiz.getQuestionsCount();
//        int currentQuestion = quiz.getCurrentQuestion();
//
//        String questionsLeft = currentQuestion + "/" + questionCount;
//        questionsLeftLabel.setText(questionsLeft);
//
//        if(quiz.getCurrentQuestion() >= quiz.getQuestionsCount()) {
//            nextQuestionButton.setVisibility(View.INVISIBLE);
//        }else{
//            nextQuestionButton.setVisibility(View.VISIBLE);
//            String[] questions = quiz.getQuestions();
//            String questionText = questions[quiz.getCurrentQuestion()];
//            questionTitleLabel.setText(questionText);
//        }
//    }

}
