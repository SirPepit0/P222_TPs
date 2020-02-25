package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.InstanceCountViolation;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
        Ecouteur eTexte = new Ecouteur();

        //Récupération du composant bouton
        Button b1 = (Button)findViewById(R.id.buttonPlus);
        Button b2 = (Button)findViewById(R.id.buttonMoins);
        Button b3 = (Button)findViewById(R.id.buttonMultiplie);
        Button b4 = (Button)findViewById(R.id.buttonDivise);

        //Enregistrement
        b1.setOnClickListener(e);
        b2.setOnClickListener(e);
        b3.setOnClickListener(e);
        b4.setOnClickListener(e);
    }

    class Ecouteur implements View.OnClickListener {
        //Récupération du TextView '...'
        TextView texte = (TextView)findViewById(R.id.textResultat);

        //Récupération des composants opérandes
        EditText op1 = (EditText)findViewById(R.id.opérande1);
        EditText op2 = (EditText)findViewById(R.id.opérande2);

        int res = 0;

        @Override
        public void onClick(View v) {
            /* Méthode par switch : */

            switch (v.getId()) {
                case R.id.buttonPlus:
                    res = Integer.parseInt(op1.getText().toString()) + Integer.parseInt(op2.getText().toString());
                    texte.setText("" + res);
                    break;
                case R.id.buttonMoins:
                    res = Integer.parseInt(op1.getText().toString()) - Integer.parseInt(op2.getText().toString());
                    texte.setText("" + res);
                    break;
                case R.id.buttonMultiplie:
                    res = Integer.parseInt(op1.getText().toString()) * Integer.parseInt(op2.getText().toString());
                    texte.setText("" + res);
                    break;
                case R.id.buttonDivise:
                    res = Integer.parseInt(op1.getText().toString()) / Integer.parseInt(op2.getText().toString());
                    texte.setText("" + res);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + v);
            }
        }
    }
}
