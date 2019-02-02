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
    private Button button,button2;
    private TextView textView;

    private int i,k=3,n;
    private String string,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.et_text);
        button=findViewById(R.id.btn_encrypt);
        button2=findViewById(R.id.btn_decrypt);
        textView=findViewById(R.id.tv_output);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                string=editText.getText().toString();
                e="";

                for (i=0;i<string.length();i++){
                    n=string.charAt(i);
                    n=n-97;
                    n=((n+k)%26)+97;
                    char c= (char) n;
                    e=e+c;
                }
                textView.setText(e);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string=textView.getText().toString();
                e="";

                for (i=0;i<string.length();i++){
                    n=string.charAt(i);
                    n=n-k;
                   // n=((n+k)%26)+97;
                    char c= (char) n;
                    e=e+c;
                }
                textView.setText(e);
            }
        });
    }
}
