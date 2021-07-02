package katlynbecvar.cs.courseregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// add UID for DB

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterForClassesActivity extends AppCompatActivity {

    EditText courseNameText, courseNumberText, courseInstructorText, creditHourText;
    Button buttonRegister;
    Register register;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private String userId;
    private String ref;
    private ViewCourseModel courseModel;
    private Button registerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_for_classes);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterForClassesActivity.this, RegisterForClassesActivity.class);
                startActivity(intent);
            }
        });


        courseNameText = findViewById(R.id.course_name_edit_text);
        courseInstructorText = findViewById(R.id.course_instructor_edit_text);
        courseNumberText = findViewById(R.id.course_number_text_edit);
        creditHourText = findViewById(R.id.credit_hour_text_edit);
        buttonRegister = findViewById(R.id.registration_submit_button);
        register = new Register();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Register");

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register.setCourseName(courseNameText.getText().toString());
                register.setCourseNumber(courseNumberText.getText().toString());
                register.setCourseInstructor(courseInstructorText.getText().toString());
                int creditHour = Integer.parseInt(creditHourText.getText().toString());
                register.setCreditHour(creditHour);
                databaseReference.push().setValue(register);
                Toast.makeText(RegisterForClassesActivity.this, "Registration Saved", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
