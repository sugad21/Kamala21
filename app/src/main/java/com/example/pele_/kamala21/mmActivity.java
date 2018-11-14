package com.example.pele_.kamala21;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class mmActivity extends AppCompatActivity implements View.OnClickListener {
    Button exitButton;
    Button rulesButton;
    Button playSingleButton;
    Button optionsButton;
    Button startLocalButton;
    Button joinButton;
    FirebaseDatabase database;
    DatabaseReference lobbyRef;
    DatabaseReference numPlayersRef;
    int playerIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rmpm_main_menu);

        exitButton = (Button) findViewById(R.id.mmExitButton);
        exitButton.setOnClickListener(this);
        rulesButton = (Button) findViewById(R.id.mmRulesButton);
        rulesButton.setOnClickListener(this);
        playSingleButton = (Button) findViewById(R.id.mmSingleButton);
        playSingleButton.setOnClickListener(this);
        optionsButton = (Button) findViewById(R.id.mmOptionsButton);
        optionsButton.setOnClickListener(this);
        startLocalButton = (Button) findViewById(R.id.mmLocalButton);
        startLocalButton.setOnClickListener(this);
        joinButton = (Button) findViewById(R.id.mmJoinButton);
        joinButton.setOnClickListener(this);
        database = FirebaseDatabase.getInstance();
        lobbyRef = database.getReference().child("localMultiPlayerLobby");
        lobbyRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.child("numHumans").getValue(Integer.class) instanceof Integer){
                    playerIndex = dataSnapshot.child("numHumans").getValue(Integer.class) + 1;
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    //buttons given access to layouts
    /*
    External Citations:
    Date: 11-10-18
    Problem: Using intent
    Resource: https://stackoverflow.com/questions/4186021/how-to-start-new-activity-on-button-click
    Solution: Now I remember how to use it, bc we learned it in class, but I forgot
     */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
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
            case R.id.mmJoinButton:
                Intent lmgsJoinIntent = new Intent(this, lmwActivity.class);
                lmgsJoinIntent.putExtra("playerIndex", playerIndex);
                startActivity(lmgsJoinIntent);
                finish();
            default:
                break;
        }
    }
}
