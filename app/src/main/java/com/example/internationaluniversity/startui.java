package com.example.internationaluniversity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class startui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_startui);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void bachelor(View v)
    {

        Intent intent = new Intent(getApplicationContext(), bachelorui.class);
        startActivity(intent);

        Toast.makeText(getApplicationContext(), "Bachelor's degree programs typically have a minimum duration of 5 years. ", Toast.LENGTH_LONG).show();
    }
    public void diploma(View v)
    {

        Toast.makeText(getApplicationContext(), "Diploma courses entail a minimum duration of 3 years. ", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(getApplicationContext(), diplomaui.class);
        startActivity(intent);
        finish();


    }
    public void shortcourse(View v)
    {


        Intent intent = new Intent(getApplicationContext(), shortcourseui.class);
        startActivity(intent);
        finish();
        Toast.makeText(getApplicationContext(), "Short courses require a minimum commitment of 6 months. ", Toast.LENGTH_LONG).show();

    }
    public void higherC(View v)
    {

        Intent intent = new Intent(getApplicationContext(),highcertificateui.class);
        startActivity(intent);
        finish();

        Toast.makeText(getApplicationContext(), "Higher Certificate courses have a minimum duration of 12 months. ", Toast.LENGTH_LONG).show();
    }
    public void exiting(View v){
        myDialog myDialog = new myDialog();
        myDialog.show(getSupportFragmentManager(),"123");
    }

    public void returning(View v)
    {

        Intent intent = new Intent(this, returnui.class);
        startActivity(intent);
        finish();

        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

}