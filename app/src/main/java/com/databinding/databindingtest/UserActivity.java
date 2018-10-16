package com.databinding.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import user.*;

import com.databinding.databindingtest.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {

    AppCompatEditText firstName,lastName;
    Button submit;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityUserBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_user);
        firstName=findViewById(R.id.firstName);
        lastName=findViewById(R.id.lastName);

        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastName.setText("");
                binding.setUser(user);

            }
        });


    }
}
