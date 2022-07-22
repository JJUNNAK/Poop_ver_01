package com.nackjun.poop_ver_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //상세보기 버튼 클릭시 화면전환
        Button show_data_btn = (Button) findViewById(R.id.show_data_btn); //버튼 아이디
        show_data_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(),ListviewActivity.class);
                startActivity(intent);
            }
        });

        //노선보기 버튼 클릭시 화면전환
        Button show_line_btn = (Button) findViewById(R.id.show_line_btn); //버튼 아이디
        show_line_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(),Line_Menu.class);
                startActivity(intent);
            }
        });




    }

}
