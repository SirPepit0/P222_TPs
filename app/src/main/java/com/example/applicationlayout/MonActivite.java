package com.example.applicationlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MonActivite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        this.displayMessage("onCreate");

        /*
        TextView view = findViewById(R.id.textView2);

        for(int i = 0 ; i < 50 ; i++) {
            TextView blabla = new TextView(this);
            blabla.setText("Item #"+i);
            view.setContentDescription();

        }
         */
    }

    private void displayMessage(string mess) {
        // Affichage du toast
        Toast.makeText(getApplicationContext(), mess, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        this.displayMessage("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.displayMessage("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        this.displayMessage("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        this.displayMessage("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        this.displayMessage("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        this.displayMessage("onRestart");
    }

}
