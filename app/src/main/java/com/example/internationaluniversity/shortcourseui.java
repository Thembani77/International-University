package com.example.internationaluniversity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class shortcourseui extends AppCompatActivity {

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
        setContentView(R.layout.activity_shortcourseui);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);

        myshortcourseList = new ArrayList<>();

        myCustomAdapter adapter;

        shortcourses f1 = new shortcourses(R.drawable.chip);
        shortcourses f2 = new shortcourses(R.drawable.ethical);
        shortcourses f3 = new shortcourses(R.drawable.networking);
        shortcourses f4 = new shortcourses(R.drawable.data);
        shortcourses f5 = new shortcourses(R.drawable.project);
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