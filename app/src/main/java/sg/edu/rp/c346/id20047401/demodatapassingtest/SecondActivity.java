package sg.edu.rp.c346.id20047401.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        Intent intent = getIntent();
        int value = intent.getIntExtra("value", -1);
        char cValue = intent.getCharExtra("value",'z');
        double dValue = intent.getDoubleExtra("value", 0);
        tvAnswer.setText("Integer value received is " + value + "\nChar value received is " + cValue + "\nDouble value received is " + dValue);
    }
}