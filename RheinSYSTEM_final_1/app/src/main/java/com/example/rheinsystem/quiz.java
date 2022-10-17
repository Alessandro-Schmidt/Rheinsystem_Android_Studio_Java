package com.example.rheinsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class quiz extends AppCompatActivity {

    private TextView questionTV, questionNumberTV;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModel> quizModelArrayList;

    int currentScore = 0, questionAttemped = 1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ImageButton btn_return = findViewById(R.id.btn_return);
        btn_return.setOnClickListener(v -> {
            Intent intent_main = new Intent(quiz.this, MainActivity.class);
            startActivity(intent_main);
        });
        questionTV = findViewById(R.id.TVQuestion);
        questionNumberTV = findViewById(R.id.idquestionattempted);
        option1Btn = findViewById(R.id.idBtnOpt1);
        option2Btn = findViewById(R.id.idBtnOpt2);
        option3Btn = findViewById(R.id.idBtnOpt3);
        option4Btn = findViewById(R.id.idBtnOpt4);
        quizModelArrayList = new ArrayList<>();
        getQuizQuestion(quizModelArrayList);
        currentPos = 0;
        setDatatoViews(currentPos);
        option1Btn.setOnClickListener(v -> {
            if(quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())){
                currentScore++;
            }
            questionAttemped++;
            currentPos++;
            setDatatoViews(currentPos);
        });
        option2Btn.setOnClickListener(v -> {
            if(quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())){
                currentScore++;
            }
            questionAttemped++;
            currentPos++;
            setDatatoViews(currentPos);
        });
        option3Btn.setOnClickListener(v -> {
            if(quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())){
                currentScore++;
            }
            questionAttemped++;
            currentPos++;
            setDatatoViews(currentPos);

        });
        option4Btn.setOnClickListener(v -> {
            if(quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())){
                currentScore++;
            }
            questionAttemped++;
            currentPos++;
            setDatatoViews(currentPos);
        });
    }

    private void setDatatoViews(int currentPos){
        questionNumberTV.setText("Beantwortete Fragen: "+ questionAttemped + "/5");
        if(questionAttemped == 6){
            showBottomSheet();
        }else{
            questionTV.setText(quizModelArrayList.get(currentPos).getQuestion());
            option1Btn.setText(quizModelArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModelArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModelArrayList.get(currentPos).getOption3());
            option4Btn.setText(quizModelArrayList.get(currentPos).getOption4());
        }
    }

    private void showBottomSheet(){
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(quiz.this);
        //(LinearLayout)findViewById(R.id.idtoptop)
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet, (RelativeLayout) findViewById(R.id.idtoptop));
        TextView scoreTV = bottomSheetView.findViewById(R.id.TVScore);
        Button restartQuizBtn = bottomSheetView.findViewById(R.id.idBTNrestart);
        scoreTV.setText("Dein Ergebnis ist\n" +currentScore+"/5");
        restartQuizBtn.setOnClickListener(v -> {
            currentPos = 0;
            setDatatoViews(currentPos);
            questionAttemped = 1;
            currentScore=0;
            bottomSheetDialog.dismiss();
        });
        //bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }


    private void getQuizQuestion(ArrayList<QuizModel> quizModelArrayList) {
        quizModelArrayList.add(new QuizModel("Wie viel Prozent erneuerbarer Energie wurde " +
                "2020 in Deutschland verwendet?", "46%", "6%", "35%",
                "80%", "46%"));
        quizModelArrayList.add(new QuizModel("Was ist der höchst gemessene Pegelstand in Köln gewesen?", "6,86 m", "3,48 m", "10,69 m",
                "13,84 m", "13,84 m"));
        quizModelArrayList.add(new QuizModel("Wofür wurden Wasserräder, 3./4. Jahrhundert v. Chr. eigentlich verwendet?",
                "Stromerzeugung", "Schöpfrad zum heben von Wasser",
                "Mahlen von Getreide",
                "Elektrizität", "Schöpfrad zum heben von Wasser"));
        quizModelArrayList.add(new QuizModel("Wie viele Flüsse existieren in Deutschland?", "10.000", "15.000", "5.000",
                "20.000", "15.000"));
        quizModelArrayList.add(new QuizModel("Wie lang in der längste Fluss Deutschlands (Rhein)?", "635 km", "500 km", "865 km",
                "1045 km", "865 km"));
    }
// Class methods

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}