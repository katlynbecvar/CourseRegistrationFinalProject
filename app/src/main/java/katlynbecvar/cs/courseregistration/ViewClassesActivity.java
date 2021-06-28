package katlynbecvar.cs.courseregistration;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class ViewClassesActivity extends AppCompatActivity {

    private static ArrayList<CourseData> courseInfo;
    static View.OnClickListener viewOnClickListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.activity_view_classes);
    }
}