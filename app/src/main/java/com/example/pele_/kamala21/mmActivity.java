package com.example.pele_.kamala21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mmActivity extends AppCompatActivity implements  View.OnClickListener{
Button exitButton;
Button rulesButton;
Button playSingleButton;
Button optionsButton;
Button playLocalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rmpm_main_menu);

        exitButton = (Button)findViewById(R.id.mmExitButton);
        exitButton.setOnClickListener(this);
        rulesButton = (Button)findViewById(R.id.mmRulesButton);
        rulesButton.setOnClickListener(this);
        playSingleButton = (Button)findViewById(R.id.mmSingleButton);
        playSingleButton.setOnClickListener(this);
        optionsButton = (Button)findViewById(R.id.mmOptionsButton);
        optionsButton.setOnClickListener(this);
        playLocalButton = (Button)findViewById(R.id.mmLocalButton);
        playLocalButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.mmExitButton:
                System.exit(0);
                break;
            case R.id.mmRulesButton:
                Intent htpIntent = new Intent(this, htpActivity.class);
                startActivity(htpIntent);
                finish();
                break;
            case R.id.mmSingleButton:
                Intent spmIntent = new Intent(this, spmActivity.class);
                startActivity(spmIntent);
                finish();
                break;
            case R.id.mmOptionsButton:
                Intent osIntent = new Intent(this, osActivity.class);
                startActivity(osIntent);
                finish();
                break;
            case R.id.mmLocalButton:
                Intent lmmIntent = new Intent(this, lmmActivity.class);
                startActivity(lmmIntent);
                finish();
                break;
            default:
                break;
        }
    }
}
