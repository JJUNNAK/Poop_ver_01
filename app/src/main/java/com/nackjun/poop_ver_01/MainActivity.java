package com.nackjun.poop_ver_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1호선 버튼 클릭시 화면전환
        Button line_1_btn = (Button) findViewById(R.id.line_1_btn); //버튼 아이디
        line_1_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_1Activity.class);
                startActivity(intent);
            }
        });

        //2호선 버튼 클릭시 화면전환
        Button line_2_btn = (Button) findViewById(R.id.line_2_btn); //버튼 아이디
        line_2_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_2Activity.class);
                startActivity(intent);
            }
        });

        //3호선 버튼 클릭시 화면전환
        Button line_3_btn = (Button) findViewById(R.id.line_3_btn); //버튼 아이디
        line_3_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_3Activity.class);
                startActivity(intent);
            }
        });

        //4호선 버튼 클릭시 화면전환
        Button line_4_btn = (Button) findViewById(R.id.line_4_btn); //버튼 아이디
        line_4_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_4Activity.class);
                startActivity(intent);
            }
        });

        //5호선 버튼 클릭시 화면전환
        Button line_5_btn = (Button) findViewById(R.id.line_5_btn); //버튼 아이디
        line_5_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_5Activity.class);
                startActivity(intent);
            }
        });

        //6호선 버튼 클릭시 화면전환
        Button line_6_btn = (Button) findViewById(R.id.line_6_btn); //버튼 아이디
        line_6_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_6Activity.class);
                startActivity(intent);
            }
        });

        //7호선 버튼 클릭시 화면전환
        Button line_7_btn = (Button) findViewById(R.id.line_7_btn); //버튼 아이디
        line_7_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_7Activity.class);
                startActivity(intent);
            }
        });

        //8호선 버튼 클릭시 화면전환
        Button line_8_btn = (Button) findViewById(R.id.line_8_btn); //버튼 아이디
        line_8_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_8Activity.class);
                startActivity(intent);
            }
        });

        //9호선 버튼 클릭시 화면전환
        Button line_9_btn = (Button) findViewById(R.id.line_9_btn); //버튼 아이디
        line_9_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_9Activity.class);
                startActivity(intent);
            }
        });

        //경의중앙선 버튼 클릭시 화면전환
        Button line_middle_btn = (Button) findViewById(R.id.line_middle_btn); //버튼 아이디
        line_middle_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_MiddleActivity.class);
                startActivity(intent);
            }
        });

        //분당선 버튼 클릭시 화면전환
        Button line_bundang_btn = (Button) findViewById(R.id.line_bundang_btn); //버튼 아이디
        line_bundang_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){                            //연결할 엑티비티
                Intent intent = new Intent(getApplicationContext(), Line_BundangActivity.class);
                startActivity(intent);
            }
        });







    }
}