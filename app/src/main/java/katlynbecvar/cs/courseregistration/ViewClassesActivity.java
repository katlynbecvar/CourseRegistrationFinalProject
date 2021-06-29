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
    private static ArrayList<CourseDataModel> courseInfo;
    private static RecyclerView recyclerView;
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_view_classes);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        CourseAdapter adapter = new CourseAdapter(ViewClassesActivity.this, courseInfo);
        recyclerView.setAdapter(adapter);


       courseInfo = new ArrayList<CourseDataModel>(32);
  /*      for (int i = 0; i < CourseData.courseNameArray.length; i++) {

            courseInfo.add(new CourseDataModel(
                    CourseData.courseNameArray[i],
                    CourseData.courseNumberArray[i],
                    CourseData.courseInstructorArray[i],
                    CourseData.creditHoursArray[i]
            ));
        }
*/
    }
}