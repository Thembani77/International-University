package com.example.internationaluniversity;

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

public class highcertificateui extends AppCompatActivity {

    public List<shortcourses>myshortcourseList;
    RecyclerView recyclerView;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, startui.class);
        startActivity(intent);
        finish();
        // You should call super.onBackPressed() here
        super.onBackPressed();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_highcertificateui);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);

        myshortcourseList = new ArrayList<>();

        myCustomAdapter adapter;

        shortcourses f1 = new shortcourses(R.drawable.chipb);
        shortcourses f2 = new shortcourses(R.drawable.datam);
        shortcourses f3 = new shortcourses(R.drawable.html);
        shortcourses f4 = new shortcourses(R.drawable.phython);
        shortcourses f5 = new shortcourses(R.drawable.seo);
        shortcourses f6 = new shortcourses(R.drawable.system);


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