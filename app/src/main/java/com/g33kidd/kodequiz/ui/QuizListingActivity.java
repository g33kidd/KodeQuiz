package com.g33kidd.kodequiz.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.g33kidd.kodequiz.R;
import com.g33kidd.kodequiz.adapters.QuizListAdapter;
import com.g33kidd.kodequiz.quiz.Quiz;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class QuizListingActivity extends ActionBarActivity {

    private static final String TAG = QuizListingActivity.class.getSimpleName();
    private Quiz[] mQuizzes;

    @InjectView(R.id.quizListView) RecyclerView mQuizList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_listing);
        ButterKnife.inject(this);

        // Temporary until API is added
        mQuizzes = new Quiz[10];
        for(int i=0; i<10; i++) {
            Quiz newQuiz = new Quiz();

            if(i == 0) {
                newQuiz.setTitle("Android Development: Logic");
            }else if(i == 1) {
                newQuiz.setTitle("Guess the Language: Hello World");
            }else if(i == 2) {
                newQuiz.setTitle("Code Complete: PHP");
            }else if(i == 3) {
                newQuiz.setTitle("JavaScript: Logical Operators");
            }else if(i == 4) {
                newQuiz.setTitle("Guess the Language: FizBuz");
            }else if(i == 5) {
                newQuiz.setTitle("Code Complete: JavaScript");
            }else if(i == 6) {
                newQuiz.setTitle("PHP Development: OOP Basics");
            }else if(i == 7) {
                newQuiz.setTitle("Swift Development: Playground");
            }else if(i == 8) {
                newQuiz.setTitle("Code Complete: JavaScript");
            }else{
                newQuiz.setTitle("Quiz #" + (i + 1));
            }

            newQuiz.setDescription("Finish the code snippet before time runs out.");

            newQuiz.setPointsWorth(3 * i + (i / 2));
            mQuizzes[i] = newQuiz;
        }

        QuizListAdapter adapter = new QuizListAdapter(mQuizzes);
        mQuizList.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mQuizList.setLayoutManager(layoutManager);
    }

}
