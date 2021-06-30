
package katlynbecvar.cs.courseregistration;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ViewClassesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_classes);
        recyclerView = findViewById(R.id.recycler_view);

        //create array
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("Applied Calculus", "24000", "Quinn Straton", 4));
        courseModelArrayList.add(new CourseModel("Programming Fundamentals", "20000", "Natalie Adams", 3));
        courseModelArrayList.add(new CourseModel("Computer Organization", "21000", "Eric Chou", 3));
        courseModelArrayList.add(new CourseModel("Mobile Application Development", "45000", "Cindy Howard", 3));
        courseModelArrayList.add(new CourseModel("Software Systems Capstone Project", "50000", "Natalie Adams", 3));
        courseModelArrayList.add(new CourseModel("Scientific Computing", "30000", "Greg Manning", 3));
        courseModelArrayList.add(new CourseModel("Object Oriented Programming", "25000", "John Rinderer", 3));
        courseModelArrayList.add(new CourseModel("Encryption", "24500", "Eric Chou", 3));
        courseModelArrayList.add(new CourseModel("Video Game Programming", "35000", "Quinn Straton", 3));
        courseModelArrayList.add(new CourseModel("Cloud Computing", "41000", "Cindy Howard", 3));

        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false );
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(courseAdapter);

    }
}
