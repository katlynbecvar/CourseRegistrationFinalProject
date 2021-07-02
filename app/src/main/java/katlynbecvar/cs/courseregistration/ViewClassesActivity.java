
package katlynbecvar.cs.courseregistration;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ViewClassesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ViewCourseModel> courseModelArrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_classes);
        recyclerView = findViewById(R.id.recycler_view);

        //create array
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new ViewCourseModel("Applied Calculus", "24000", "Quinn Straton", 4));
        courseModelArrayList.add(new ViewCourseModel("Programming Fundamentals", "20000", "Natalie Adams", 3));
        courseModelArrayList.add(new ViewCourseModel("Computer Organization", "21000", "Eric Chou", 3));
        courseModelArrayList.add(new ViewCourseModel("Mobile Application Development", "45000", "Cindy Howard", 3));
        courseModelArrayList.add(new ViewCourseModel("Software Systems Capstone Project", "50000", "Natalie Adams", 3));
        courseModelArrayList.add(new ViewCourseModel("Scientific Computing", "30000", "Greg Manning", 3));
        courseModelArrayList.add(new ViewCourseModel("Object Oriented Programming", "25000", "John Rinderer", 3));
        courseModelArrayList.add(new ViewCourseModel("Encryption", "24500", "Eric Chou", 3));
        courseModelArrayList.add(new ViewCourseModel("Video Game Programming", "35000", "Quinn Straton", 3));
        courseModelArrayList.add(new ViewCourseModel("Cloud Computing", "41000", "Cindy Howard", 3));

        ViewCourseAdapter courseAdapter = new ViewCourseAdapter(this, courseModelArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false );
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(courseAdapter);

    }
}
