package com.example.button_counter_murphyabbott;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //var init
    int total;
    TextView totalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vars and refs
        totalTextView = findViewById(R.id.totalTextView);
        total = 0;
        Button incButton = (Button) findViewById(R.id.incButton);
        Button decButton = (Button) findViewById(R.id.decButton);
        Button clrButton = (Button) findViewById(R.id.clrButton);

        //onclicklistener for increment button
        incButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
             total++;
             totalTextView.setText("" + total);
            }
        });

        //onclicklistener for decrement button
        decButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                total--;
                totalTextView.setText("" + total);
            }
        });

        // onclicklistener for clear button
        clrButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                total = 0;
                totalTextView.setText("" + total);
            }
        });
    }
}