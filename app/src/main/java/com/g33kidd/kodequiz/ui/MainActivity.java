package com.g33kidd.kodequiz.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.g33kidd.kodequiz.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.getStartedButton)
    public void startQuizListView(View view) {
        Intent intent = new Intent(view.getContext(), QuizListingActivity.class);
        startActivity(intent);
    }

}
