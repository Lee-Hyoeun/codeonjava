package com.angie.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);



        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        ConstraintLayout.LayoutParams constraintLayoutParams =
                new ConstraintLayout.LayoutParams(
                        ConstraintLayout.LayoutParams.WRAP_CONTENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT
                );

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.BLUE);

        // 레이아웃 파라미터 생성
        LinearLayout.LayoutParams linearLayoutParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        // 텍스트뷰를 생성한 후 파라미터 설정
        TextView textView = new TextView(this);
        textView.setText("Text View");
        textView.setTextColor(Color.WHITE);
        textView.setLayoutParams(linearLayoutParams);

        linearLayout.addView(textView);

        Button btn1 = new Button(this);
        btn1.setText("Go back button");

        constraintLayout.addView(btn1);

        setContentView(linearLayout);
        addContentView(constraintLayout , constraintLayoutParams); //레이아웃 추가 addcontentview

    }
}
