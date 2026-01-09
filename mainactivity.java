package com.example.finalfinslapp123;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

private static final String STAFF_PASSWORD = "restaurant123";

private EditText staffPassword;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

staffPassword = findViewById(R.id.staffPassword);
    }

public void guestLogin(View view) {
startActivity(new Intent(this, GuestActivity.class));
    }

public void staffLogin(View view) {
String enteredPassword = staffPassword.getText().toString();
if (enteredPassword.equals(STAFF_PASSWORD)) {
startActivity(new Intent(this, StaffActivity.class));
  } else {
Toast.makeText(this, "incorrect staffs password", Toast.LENGTH_SHORT).show();
        }
    }
}
