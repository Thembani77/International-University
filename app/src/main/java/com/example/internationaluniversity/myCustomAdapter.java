package com.example.internationaluniversity;

import static android.widget.Toast.makeText;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internationaluniversity.R;
import com.example.internationaluniversity.shortcourses;

import java.util.List;

public class myCustomAdapter extends RecyclerView.Adapter<myCustomAdapter.shortcourseViewHolder> {

    public myCustomAdapter(List<shortcourses> myshortcourseList) {
        this.myshortcourseList = myshortcourseList;
    }

    public List<shortcourses> myshortcourseList;

    @NonNull
    @Override
    public myCustomAdapter.shortcourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view,parent,false);

        return new shortcourseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myCustomAdapter.shortcourseViewHolder holder, int position) {

        shortcourses shortcourses = myshortcourseList.get(position);
        holder.imageView.setImageResource(shortcourses.getImageView());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Course details coming soon :-)", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return myshortcourseList.size();
    }

    public static class shortcourseViewHolder extends RecyclerView.ViewHolder
    {
            ImageView imageView;
        public shortcourseViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}