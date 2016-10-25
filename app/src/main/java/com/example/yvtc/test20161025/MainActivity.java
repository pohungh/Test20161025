package com.example.yvtc.test20161025;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn2;
    ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2=(Button)findViewById(R.id.button2);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(it);
            }
        });
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Log.d("MYLOG", "使用者打開開關");
                }
                else
                {
                    Log.d("MYLOG", "使用者關閉開關");
                }
            }
        });
    }

    public void click(View v)
    {
        Log.d("MYLOG","This is click1");
    }
}
