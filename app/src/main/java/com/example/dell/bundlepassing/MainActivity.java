package com.example.dell.bundlepassing;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;


//  the user name on next screen using bundle passing if the user has entered correct id and password

public class MainActivity extends Activity implements OnClickListener {

    EditText editTextName;
    EditText editTextPassword;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editText);
        editTextPassword = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);


            button.setOnClickListener(this);


    }

        // first compare the entered name and password and the data is correct then using intent it will
        // redirect to next activity carring name of user using bundle.

    @Override
    public void onClick(View v) {

        String login_name = editTextName.getText().toString();
        String cmpName = "Rozina";
        if((login_name.equals(cmpName)) && (editTextPassword.getText().toString().trim().length() > 0)  ) {

            Intent intent = new Intent(this, Display.class);
            Bundle bundle = new Bundle();
            bundle.putString("name",editTextName.getText().toString());

            intent.putExtras(bundle);
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this, "wrong username or empty password", Toast.LENGTH_SHORT).show();
        }


    }
}