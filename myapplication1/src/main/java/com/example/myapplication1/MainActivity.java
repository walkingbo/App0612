package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //레이아웃 xml 파일을 가지고 화면을 만드는 설정
        //setContentView(R.layout.activity_main);

        //Layout 객체 생성 - 여러 개의 뷰를 배치하는 Container 생성
        LinearLayout linear = new LinearLayout(this);

        //레이우웃에 추가할 위젯을 생성
        Button btn1 = new Button(this);
        btn1.setText("버튼1");
        //레이아웃에 추가
        linear.addView(btn1);

        Button btn2 = new Button(this);
        btn2.setText("버튼2");
        linear.addView(btn2);

        //Activity에 linear를 전체 뷰로 설정해서 출력
        setContentView(linear);

    }
}
