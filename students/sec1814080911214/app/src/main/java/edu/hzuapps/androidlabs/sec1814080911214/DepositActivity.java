package edu.hzuapps.androidlabs.sec1814080911214;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class DepositActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Activity thisActivity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        Button btnOpen1 = (Button) findViewById(R.id.main_btn);
        btnOpen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thisActivity, sec1814080911214Activity.class);
                thisActivity.startActivity(intent);
                thisActivity.finish();
            }
        });
    }
}
