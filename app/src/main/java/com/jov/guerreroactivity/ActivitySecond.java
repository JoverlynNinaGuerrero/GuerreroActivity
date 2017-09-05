package com.jov.guerreroactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jov.guerreroactivity.MainActivity;
import com.jov.guerreroactivity.R;

public class ActivitySecond extends AppCompatActivity {
    TextView tv_RA;
    TextView tv_FG;
    Button btn_Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_RA = (TextView) findViewById(R.id.tvRA);
        tv_FG = (TextView) findViewById(R.id.tvFG);

        btn_Back = (Button) findViewById(R.id.btnBack);
        String ra = getIntent().getStringExtra("ra");
        String fg = getIntent().getStringExtra("fg");

        tv_RA.setText("Your RA is "+ra);
        tv_FG.setText("Your FG is "+fg);
    }
    public void goBackToMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
