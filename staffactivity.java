package com.example.finalfinslapp123;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class StaffActivity extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_staff);
    }

public void reserve(View view) {
startActivity(new Intent(this, Reservation.class));
    }
}
