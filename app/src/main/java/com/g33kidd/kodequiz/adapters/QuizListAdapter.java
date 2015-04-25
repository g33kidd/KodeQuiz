package com.g33kidd.kodequiz.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.g33kidd.kodequiz.R;
import com.g33kidd.kodequiz.quiz.Quiz;

/**
 * Created by g33kidd on 4/21/15.
 */
public class QuizListAdapter extends RecyclerView.Adapter<QuizListAdapter.QuizViewHolder> {

    private Quiz[] mQuizzes;
    private Context mContext;
    private int lastPosition = -1;

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
        setAnimation(holder.mContainer, position);
    }

    @Override
    public int getItemCount() {
        return mQuizzes.length;
    }

    public class QuizViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView mQuizNameLabel;
        public TextView mPointsWorthLabel;
        public TextView mDescriptionLabel;
        public CardView mContainer;

        public QuizViewHolder(View itemView) {
            super(itemView);

            mContainer = (CardView) itemView.findViewById(R.id.quiz_list_item);
            mQuizNameLabel = (TextView) itemView.findViewById(R.id.quizNameLabel);
            mPointsWorthLabel = (TextView) itemView.findViewById(R.id.pointsWorthLabel);
            mDescriptionLabel = (TextView) itemView.findViewById(R.id.quizDescriptionLabel);

            itemView.setOnClickListener(this);
        }

        public void bindQuiz(Quiz quiz) {
            mQuizNameLabel.setText(quiz.getTitle());
            mPointsWorthLabel.setText(quiz.getPointsWorth() + "");
            mDescriptionLabel.setText(quiz.getDescription());
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "Testing", Toast.LENGTH_LONG).show();
        }
    }

    private void setAnimation(View view, int position) {
        if(position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(mContext, android.R.anim.slide_in_left);
            view.startAnimation(animation);
            lastPosition = position;
        }
    }

}
