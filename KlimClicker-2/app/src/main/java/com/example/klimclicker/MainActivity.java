package com.example.klimclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //private long score = 0;
    int score = 0;
    int money = 1;
    //int num;
    //String raz;
    //char symbol = score.charAt(score.length() - 1);
    //int symbol = score % 10;
    TextView mainTextView;
    Button mainBtn;
    Button mainBtn2;
    Button mainBtn3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainBtn = (Button) findViewById(R.id.main_btn);
        mainBtn2 = (Button) findViewById(R.id.main_btn_2);
        mainBtn3 = (Button) findViewById(R.id.main_btn_3);
        mainBtn();//*
        mainBtn2();//*
        mainBtn3();
    }
    void mainBtn(){
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score += money;
                int symbol = score % 10;
                if (symbol == 2 || symbol == 3 || symbol == 4) {
                    mainTextView.setText("Кнопка нажата " + score + " раза");
                }
                else {
                    mainTextView.setText("Кнопка нажата " + score + " раз");
                }
                if (score == 12 || score == 13 || score == 14) {
                    mainTextView.setText("Кнопка нажата " + score + " раз");
                }
            }
        });
    }
    void mainBtn2(){
        mainBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score -= money;
                int symbol = score % 10;
                if (symbol == 2 || symbol == 3 || symbol == 4) {
                    mainTextView.setText("Кнопка нажата " + score + " раза");
                }
                else {
                    mainTextView.setText("Кнопка нажата " + score + " раз");
                }
                if (score == 12 || score == 13 || score == 14) {
                    mainTextView.setText("Кнопка нажата " + score + " раз");
                }
            }
        });
    }
    void mainBtn3(){
        mainBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                int symbol = score % 10;
                if (symbol == 2 || symbol == 3 || symbol == 4) {
                    mainTextView.setText("Кнопка нажата " + score + " раза");
                }
                else {
                    mainTextView.setText("Кнопка нажата " + score + " раз");
                }
                if (score == 12 || score == 13 || score == 14) {
                    mainTextView.setText("Кнопка нажата " + score + " раз");
                }
            }
        });
    }
}