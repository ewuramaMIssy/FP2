package com.example.control;
 
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    SwitchCompat switchCompat;
    //ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat= findViewById(R.id.switchButton);
        switchCompat= findViewById(R.id.switchButton2);
        switchCompat= findViewById(R.id.switchButton3);
        switchCompat= findViewById(R.id.switchButton4);
        switchCompat= findViewById(R.id.switchButton5);
       // imageView= findViewById(R.id.imageView);

       // imageView.setImageDrawable(getResources().getDrawable(R.drawable.));
    }
}

