package com.shakibcsekuet.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton johnCena, randyOrton, goldBerg, romanReigns, sheamus;
    String selectedSuperStar;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        johnCena = (RadioButton) findViewById(R.id.johnCena);
        randyOrton = (RadioButton) findViewById(R.id.randyOrton);
        goldBerg = (RadioButton) findViewById(R.id.goldBerg);
        romanReigns = (RadioButton) findViewById(R.id.romanReigns);
        sheamus = (RadioButton) findViewById(R.id.sheamus);
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randyOrton.isChecked()) {
                    selectedSuperStar = randyOrton.getText().toString();
                } else if (sheamus.isChecked()) {
                    selectedSuperStar = sheamus.getText().toString();
                } else if (johnCena.isChecked()) {
                    selectedSuperStar = johnCena.getText().toString();
                } else if (romanReigns.isChecked()) {
                    selectedSuperStar = romanReigns.getText().toString();
                } else if (goldBerg.isChecked()) {
                    selectedSuperStar = goldBerg.getText().toString();
                }
                Toast.makeText(getApplicationContext(), selectedSuperStar, Toast.LENGTH_LONG).show(); // print the value of selected super star
            }
        });
    }
}