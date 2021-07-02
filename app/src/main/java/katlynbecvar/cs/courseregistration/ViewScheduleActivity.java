package katlynbecvar.cs.courseregistration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.annotations.NotNull;

import java.util.ArrayList;

public class ViewScheduleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private ViewScheduleAdapter viewScheduleAdapter;
    private ArrayList<ViewScheduleModel> scheduleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_schedule);

        recyclerView.findViewById(R.id.view_schedule_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        scheduleList = new ArrayList<>();
        viewScheduleAdapter = new ViewScheduleAdapter(this, scheduleList);
        recyclerView.setAdapter(viewScheduleAdapter);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("User");

        databaseReference.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    ViewScheduleModel viewScheduleModel = dataSnapshot.getValue(ViewScheduleModel.class);
                    scheduleList.add(viewScheduleModel);
                }
                viewScheduleAdapter.notifyDataSetChanged();
            }


            @Override
            public void onCancelled(DatabaseError error) {
                finish();
            }

        });

    }
}