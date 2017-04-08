package com.example.dell.bundlepassing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by dell on 12/21/2016.
 */
public class Display  extends Activity{

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        Bundle bundle1 = getIntent().getExtras();
        textView = (TextView) findViewById(R.id.nameText);
        textView.setText(bundle1.getCharSequence("name"));
    }
}
