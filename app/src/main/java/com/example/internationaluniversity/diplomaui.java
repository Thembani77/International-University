package com.example.internationaluniversity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class diplomaui extends AppCompatActivity {

    public List<shortcourses> myshortcourseList;
    RecyclerView recyclerView;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, startui.class);
        startActivity(intent);
        finish();
        // You should call super.onBackPressed() here
        super.onBackPressed();

    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_diplomaui);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);

        myshortcourseList = new ArrayList<>();

        myCustomAdapter adapter;

        shortcourses f1 = new shortcourses(R.drawable.crm);
        shortcourses f2 = new shortcourses(R.drawable.diploma2);
        shortcourses f3 = new shortcourses(R.drawable.diploma5);
        shortcourses f4 = new shortcourses(R.drawable.support);
        shortcourses f5 = new shortcourses(R.drawable.seo);
        shortcourses f6 = new shortcourses(R.drawable.surver);


        myshortcourseList.add(f1);
        myshortcourseList.add(f2);
        myshortcourseList.add(f3);
        myshortcourseList.add(f4);
        myshortcourseList.add(f5);
        myshortcourseList.add(f6);


        adapter = new myCustomAdapter(myshortcourseList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }


    public void btnReg(View v)
    {
        Intent intent = new Intent(getApplicationContext(), registerui.class);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }


}