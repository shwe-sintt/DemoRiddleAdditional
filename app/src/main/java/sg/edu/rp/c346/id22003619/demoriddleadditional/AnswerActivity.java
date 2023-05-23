package sg.edu.rp.c346.id22003619.demoriddleadditional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tv=findViewById(R.id.textView);

        Intent intentReceived=getIntent();
        String qselect=intentReceived.getStringExtra("Question");
        if(qselect.equals("Q1")) {
            tv.setText(qselect + " answer is: Queue");
        }else if(qselect.equals("Q2")){
            tv.setText(qselect + " answer is: Gone");
        }
    }
}