package com.example.homework_extrim_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText userIn;
    private EditText whereIn;
    private EditText hereIn;
    private EditText departureTimeIn;
    private EditText arrivalTimeIn;
    private EditText priceIn;
    private Button button;

    private String user;
    private String where;
    private String here;
    private String departureTime;
    private String arrivalTime;
    private String price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        userIn = findViewById(R.id.one);
        whereIn = findViewById(R.id.two);
        hereIn = findViewById(R.id.three);
        departureTimeIn = findViewById(R.id.four);
        arrivalTimeIn = findViewById(R.id.five);
        priceIn = findViewById(R.id.six);
        button = findViewById(R.id.button_one);

        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            user = userIn.getText().toString();
            where = whereIn.getText().toString();
            here = hereIn.getText().toString();
            departureTime = departureTimeIn.getText().toString();
            arrivalTime = arrivalTimeIn.getText().toString();
            price = priceIn.getText().toString();

            Ticket ticket = new Ticket(user,where,here,departureTime,arrivalTime,price);

            Intent intent = new Intent(getApplicationContext(), TwoActivity.class);
            intent.putExtra(Ticket.class.getSimpleName(), ticket);
            startActivity(intent);
        }
    };
}