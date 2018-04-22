package com.github.citrus_hack_2018.handshaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern);
        Button patternBack = (Button) findViewById(R.id.btPatternBack);
        patternBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toPatternPage = new Intent(PatternActivity.this, ContactsActivity.class);
                startActivity(toPatternPage);
            }
        });
    }
}
