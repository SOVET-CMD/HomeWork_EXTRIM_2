package com.example.homework_extrim_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    private TextView textTicket;
    private Button button;
    private Ticket ticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        textTicket = findViewById(R.id.textTicket);
        button = findViewById(R.id.button_two);

        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null ){
            ticket = (Ticket) bundleIntent.getSerializable(Ticket.class.getSimpleName());

        }
        textTicket.setText("ID: " + ticket.getUser() + "\n"
                + "От куда: " + ticket.getWhere() + "\n"
                + "Куда: " + ticket.getHere() + "\n"
                + "Время отправки: " + ticket.getDepartureTime() + "\n"
                + "Время прибытия: " + ticket.getArrivalTime() +"\n"
                + "Цена билета: " + ticket.getPrice());

        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
    };
}