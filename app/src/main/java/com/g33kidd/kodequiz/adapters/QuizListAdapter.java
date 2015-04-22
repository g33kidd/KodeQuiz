package com.g33kidd.kodequiz.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.g33kidd.kodequiz.R;
import com.g33kidd.kodequiz.quiz.Quiz;

/**
 * Created by g33kidd on 4/21/15.
 */
public class QuizListAdapter extends RecyclerView.Adapter<QuizListAdapter.QuizViewHolder> {

    private Quiz[] mQuizzes;
    private Context mContext;

    public QuizListAdapter(Quiz[] quizzes) {
        mQuizzes = quizzes;
    }

    @Override
    public QuizViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quiz_list_item, parent, false);
        mContext = parent.getContext();
        return new QuizViewHolder(view);
    }

    @Override
    public void onBindViewHolder(QuizViewHolder holder, int position) {
        holder.bindQuiz(mQuizzes[position]);
    }

    @Override
    public int getItemCount() {
        return mQuizzes.length;
    }

    public class QuizViewHolder extends RecyclerView.ViewHolder {

        public TextView mQuizNameLabel;
        public TextView mPointsWorthLabel;
        public TextView mDescriptionLabel;

        public QuizViewHolder(View itemView) {
            super(itemView);
            mQuizNameLabel = (TextView) itemView.findViewById(R.id.quizNameLabel);
            mPointsWorthLabel = (TextView) itemView.findViewById(R.id.pointsWorthLabel);
            mDescriptionLabel = (TextView) itemView.findViewById(R.id.quizDescriptionLabel);
        }

        public void bindQuiz(Quiz quiz) {
            mQuizNameLabel.setText(quiz.getTitle());
            mPointsWorthLabel.setText(quiz.getPointsWorth() + "");
            mDescriptionLabel.setText(quiz.getDescription());
        }
    }

}
