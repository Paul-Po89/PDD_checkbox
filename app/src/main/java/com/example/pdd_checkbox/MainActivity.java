package com.example.pdd_checkbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbarTB;
    TextView textViewTV;
    CheckBox showRulesCB;
    TextView pddTV;

    String title = "CheckBox";
    String subTitle = "Task 7";
    String rules =
            "1. Within cities, speed limits are generally 25-30 mph unless otherwise noted\n" +
            "2.The maximum speed limits for interstates and freeways range from 65-80 mph";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        showRulesCB.setOnClickListener(v -> {
            if (showRulesCB.isChecked()) {
                textViewTV.setText("Road regulations");
                pddTV.setText(rules);
            } else {
                pddTV.setText("Information");
            }
        });

    }

    private void initUI() {
        toolbarTB = findViewById(R.id.toolbarTB);
        textViewTV = findViewById(R.id.textViewTV);
        showRulesCB = findViewById(R.id.showRulesCB);
        pddTV = findViewById(R.id.pddTV);

        setSupportActionBar(toolbarTB);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setSubtitle(subTitle);
        toolbarTB.setTitleTextColor(0xFFFFFFFF);
        toolbarTB.setSubtitleTextColor(0xFFFFFFFF);
    }
}