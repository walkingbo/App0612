package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewAttr extends AppCompatActivity {
    //버튼과 텍스트를 저장할 변수
    private Button btn;
    private TextView label;

    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_attr);

        //xml에 디자인 뷰를 가져오기
        btn = (Button)findViewById(R.id.btn);
        label = (TextView)findViewById(R.id.label);

        String msg ="문자열 설정";
        label.setText(msg);
        //안드로이드에서 뷰에 설정하는 문자열의 자료형은
        //String이 아니고 CharSequence 나 Editable인 경우가 많습니다.
        //String은 CharSequence와 Editable 인터페이스를 구현했기 때문에
        //String으로 설정은 할 수 있지만 가져온 내용을 String에 바로 대입할수 없습니다.
        String txt = label.getText().toString();

        //버튼을 클릭했을 때 이벤트 처리
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                //자바코드로 View의 속성을 변경할 때는 set 메소드 이용
                //View의 속성을 가져올 때는 get 메소드 이용
                if(flag)
                    label.setVisibility(View.VISIBLE);
                else
                    label.setVisibility(View.INVISIBLE);
                flag = !flag;
            }
        });

    }
}
