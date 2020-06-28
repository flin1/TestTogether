package com.flin.testtogether2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.textView);
        TextView tv2 = (TextView)findViewById(R.id.textView2);
        TextView tv3 = (TextView)findViewById(R.id.textView3);
        ImageView iv = (ImageView)findViewById(R.id.imageView);
        EditText et = (EditText)findViewById(R.id.editText);
        EditText et2 = (EditText)findViewById(R.id.editText3);
        Button btn = (Button)findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = (Intent) new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(intent);
            }
        });



    }
}
