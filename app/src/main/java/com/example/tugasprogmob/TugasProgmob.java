package com.example.tugasprogmob;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TugasProgmob extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tugas_activity);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("test");
    }
}
