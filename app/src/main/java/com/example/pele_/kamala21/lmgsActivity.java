package com.example.pele_.kamala21;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class lmgsActivity extends Activity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rmpm_game_screen);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.htpReturnButton:
                break;
            default:
                break;
        }
    }
}
