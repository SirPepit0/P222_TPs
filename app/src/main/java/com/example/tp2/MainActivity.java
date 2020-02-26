package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.InstanceCountViolation;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        RadioGroup radio = (RadioGroup)findViewById(R.id.radio);
        RadioButton b1 = (RadioButton)findViewById(R.id.radioPlus);
        RadioButton b2 = (RadioButton)findViewById(R.id.radioMoins);
        RadioButton b3 = (RadioButton)findViewById(R.id.radioMultiplie);
        RadioButton b4 = (RadioButton)findViewById(R.id.radioDivise);

        //Enregistrement
        b1.setOnClickListener(e);
        b2.setOnClickListener(e);
        b3.setOnClickListener(e);
        b4.setOnClickListener(e);
    }

    class Ecouteur implements View.OnClickListener {
        //Récupération du TextView '...'
        TextView texte = (TextView)findViewById(R.id.texteResultat);

        //Récupération des composants opérandes
        EditText op1 = (EditText)findViewById(R.id.opérande1);
        EditText op2 = (EditText)findViewById(R.id.opérande2);

        int res = 0;

        @Override
        public void onClick(View v) {
            /* Méthode par switch : */

            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);

            switch (v.getId()) {
                case R.id.calculer:
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                break;
            }
        }

        public void onRadioButtonClicked(View v){
            boolean checked = ((RadioButton) v).isChecked();

            switch (v.getId()) {
                case R.id.radioPlus:
                    if(checked) {
                        res = Integer.parseInt(op1.getText().toString()) + Integer.parseInt(op2.getText().toString());
                        texte.setText(res);
                    }
                    break;
                case R.id.radioMoins:
                    if (checked) {
                        res = Integer.parseInt(op1.getText().toString()) - Integer.parseInt(op2.getText().toString());
                        texte.setText(res);
                    }
                    break;
                case R.id.radioMultiplie:
                    if(checked) {
                        res = Integer.parseInt(op1.getText().toString()) * Integer.parseInt(op2.getText().toString());
                        texte.setText(res);
                    }
                    break;
                case R.id.radioDivise:
                    if(checked) {
                        res = Integer.parseInt(op1.getText().toString()) / Integer.parseInt(op2.getText().toString());
                        texte.setText(res);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + v);
            }
        }
    }
}
