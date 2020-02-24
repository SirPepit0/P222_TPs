package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.InstanceCountViolation;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Création écouteur
        Ecouteur e = new Ecouteur();

        //Récupération du composant bouton
        Button bouton = (Button)findViewById(R.id.button);

        //Enregistrement
        bouton.setOnClickListener(e);
    }

    class Ecouteur implements View.OnClickListener {
        //Récupération du TextView '...'
        TextView texte = (TextView)findViewById(R.id.textThreeDots);
        int i = 1;
        @Override
        public void onClick(View v) {
            texte.setText("Clic #"+i);
            i++;
        }
    }
}
