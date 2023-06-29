package com.example.android_mobile_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText height_edit, eight_edit;
    TextView result_text;
    Button calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_view();
    }

    private void init_view(){
        height_edit = findViewById(R.id.height);
        eight_edit = findViewById(R.id.weight);
        result_text = findViewById(R.id.result);
        calculate = findViewById(R.id.calculate);
        calculate.OnClickListener(actionBtnOnClick);

    }

    private View.OnClickListener actionBtnOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case.R.id.calculate:
            }
        }
    }

}