package com.example.rbrazuk.espressojawn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btSubmit;
    EditText etEmail;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSubmit = (Button) findViewById(R.id.bt_submit);
        etEmail = (EditText) findViewById(R.id.et_email);
        etPassword = (EditText) findViewById(R.id.et_password);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ValidationUtils.validateEmail(etEmail.getText().toString()) && ValidationUtils.validatePassword(etPassword.getText().toString())) {
                    Intent intent = new Intent(MainActivity.this,ListActivity.class);
                    startActivity(intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Invalid email or password",Toast.LENGTH_LONG);
                    toast.show();
                }


            }
        });
    }
}
