package com.example.brianmushiyi.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        MainActivity mainActivity = new MainActivity();
        TextView textView =findViewById(R.id.order_summary_text_view);
        textView.setText(mainActivity.createOrderSummary(9));

    }

}
