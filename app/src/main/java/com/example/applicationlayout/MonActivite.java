package com.example.applicationlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MonActivite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onCreate!", Toast.LENGTH_SHORT).show();

        for(int i = 0 ; i < 50 ; i++) {
            TextView blabla = new TextView(this);
            blabla.setText("Item #"+i);
            findViewById("@textView2");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onStart!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onResume!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onPause!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onStop!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onDestroy!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onRestart!", Toast.LENGTH_SHORT).show();
    }

}
