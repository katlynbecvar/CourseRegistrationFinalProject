package katlynbecvar.cs.courseregistration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.annotations.NotNull;

import java.util.ArrayList;

public class ViewScheduleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private ViewScheduleAdapter viewScheduleAdapter;
    private ArrayList<ViewScheduleModel> scheduleList;
    private Query query;
    private FirebaseRecyclerAdapter<ViewScheduleModel, ViewScheduleAdapter.ScheduleViewHolder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_schedule);

        recyclerView = findViewById(R.id.view_schedule_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        query = firebaseDatabase.getReference().child("register");
        recyclerView.setAdapter(viewScheduleAdapter);
        FirebaseRecyclerOptions<ViewScheduleModel> options =
                new FirebaseRecyclerOptions.Builder<ViewScheduleModel>()
                        .setQuery(query, ViewScheduleModel.class).build();

        databaseReference = FirebaseDatabase.getInstance().getReference();

        adapter = new ViewScheduleAdapter(options,this);
        recyclerView.setAdapter(viewScheduleAdapter);
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

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT )  {
            @Override
            public boolean onMove( RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped( RecyclerView.ViewHolder viewHolder, int direction) {
                int id = (int)viewHolder.itemView.getTag();
                firebaseDatabase.delete
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drop_option, menu);
        return super.onCreateOptionsMenu(menu);
    }

}