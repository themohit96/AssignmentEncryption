package com.thegiant.assignmentencryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.et_text);
        button=findViewById(R.id.btn_encrypt);
        textView=findViewById(R.id.tv_output);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string=editText.getText().toString();

                StringBuffer stringBuffer=new StringBuffer(string);
                stringBuffer.reverse();



                textView.setText(stringBuffer.toString());

            }
        });
    }
}
