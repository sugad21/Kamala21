package com.example.pele_.kamala21;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class spgsActivity extends Activity implements View.OnClickListener, ValueEventListener {
    RmPmGameState instance;
    ImageButton card0;
    ImageButton card1;
    ImageButton card2;
    ImageButton card3;
    ImageButton card4;
    ImageButton card5;
    ImageButton card6;
    ImageButton card7;
    ImageButton card8;
    ImageButton card9;
    ImageButton card10;
    ImageButton card11;
    ImageButton card12;
    Button playButton;
    Button passButton;
    TextView currentPlayerText;
    TextView numCards1;
    TextView numCards2;
    TextView numCards3;
    TextView numCards4;
    TextView numCards5;
    FrameLayout firstPlayer;
    FrameLayout secondPlayer;
    FrameLayout thirdPlayer;
    FrameLayout fourthPlayer;
    FrameLayout fifthPlayer;
    ImageView currentSet0;
    ImageView currentSet1;
    ImageView currentSet2;
    ImageView currentSet3;
    ImageView currentSet4;
    ImageView currentSet5;
    ImageView currentSet6;
    ImageView currentSet7;
    ImageView currentSet8;
    ImageView currentSet9;

    FirebaseDatabase database;
    DatabaseReference gameStateRef;

    int count;
    int playerIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rmpm_game_screen);

        playerIndex = 0;
        count = 0;
        card0 = (ImageButton) findViewById(R.id.card0);
        card0.setOnClickListener(this);
        card1 = (ImageButton) findViewById(R.id.card1);
        card1.setOnClickListener(this);
        card2 = (ImageButton) findViewById(R.id.card2);
        card2.setOnClickListener(this);
        card3 = (ImageButton) findViewById(R.id.card3);
        card3.setOnClickListener(this);
        card4 = (ImageButton) findViewById(R.id.card4);
        card4.setOnClickListener(this);
        card5 = (ImageButton) findViewById(R.id.card5);
        card5.setOnClickListener(this);
        card6 = (ImageButton) findViewById(R.id.card6);
        card6.setOnClickListener(this);
        card7 = (ImageButton) findViewById(R.id.card7);
        card7.setOnClickListener(this);
        card8 = (ImageButton) findViewById(R.id.card8);
        card8.setOnClickListener(this);
        card9 = (ImageButton) findViewById(R.id.card9);
        card9.setOnClickListener(this);
        card10 = (ImageButton) findViewById(R.id.card10);
        card10.setOnClickListener(this);
        card11 = (ImageButton) findViewById(R.id.card11);
        card11.setOnClickListener(this);
        card12 = (ImageButton) findViewById(R.id.card12);
        card12.setOnClickListener(this);
        playButton = (Button) findViewById(R.id.playSetButton);
        playButton.setOnClickListener(this);
        passButton = (Button) findViewById(R.id.passTurnButton);
        passButton.setOnClickListener(this);
        currentPlayerText = (TextView) findViewById(R.id.currentPlayerText);
        numCards1 = (TextView) findViewById(R.id.numCardsP1);
        numCards2 = (TextView) findViewById(R.id.numCardsP2);
        numCards3 = (TextView) findViewById(R.id.numCardsP3);
        numCards4 = (TextView) findViewById(R.id.numCardsP4);
        numCards5 = (TextView) findViewById(R.id.numCardsP5);
        firstPlayer = (FrameLayout)findViewById(R.id.firstPlayer);
        secondPlayer = (FrameLayout)findViewById(R.id.secondPlayer);
        thirdPlayer = (FrameLayout)findViewById(R.id.thirdPlayer);
        fourthPlayer = (FrameLayout)findViewById(R.id.fourthPlayer);
        fifthPlayer = (FrameLayout)findViewById(R.id.fifthPlayer);
        currentSet0 = (ImageView) findViewById(R.id.currentSet0);
        currentSet1 = (ImageView) findViewById(R.id.currentSet1);
        currentSet2 = (ImageView) findViewById(R.id.currentSet2);
        currentSet3 = (ImageView) findViewById(R.id.currentSet3);
        currentSet4 = (ImageView) findViewById(R.id.currentSet4);
        currentSet5 = (ImageView) findViewById(R.id.currentSet5);
        currentSet6 = (ImageView) findViewById(R.id.currentSet6);
        currentSet7 = (ImageView) findViewById(R.id.currentSet7);
        currentSet8 = (ImageView) findViewById(R.id.currentSet8);
        currentSet9 = (ImageView) findViewById(R.id.currentSet9);
        database = FirebaseDatabase.getInstance();

        gameStateRef = database.getReference().child("GameState");

        gameStateRef.addValueEventListener(this);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        instance = dataSnapshot.getValue(RmPmGameState.class);
        updateScreen();
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card0:
                /*if(card0.getColorFilter() == null){
                    if(instance.selectCard(0)){
                        card0.setColorFilter(R.color.neon_green);
                    }
                } else {
                    if(instance.deselectCard(0)){
                        card0.setColorFilter(null);
                    }
                }*/
                break;
            case R.id.card1:

                break;
            case R.id.card2:

                break;
            case R.id.card3:

                break;
            case R.id.card4:

                break;
            case R.id.card5:

                break;
            case R.id.card6:

                break;
            case R.id.card7:

                break;
            case R.id.card8:

                break;
            case R.id.card9:

                break;
            case R.id.card10:

                break;
            case R.id.card11:

                break;
            case R.id.card12:

                break;
            case R.id.playSetButton:

                break;
            case R.id.passTurnButton:

                break;
            default:
                break;
        }
    }

    public void updateCards() {
        card0.setColorFilter(null);
        card1.setColorFilter(null);
        card2.setColorFilter(null);
        card3.setColorFilter(null);
        card4.setColorFilter(null);
        card5.setColorFilter(null);
        card6.setColorFilter(null);
        card7.setColorFilter(null);
        card9.setColorFilter(null);
        card8.setColorFilter(null);
        card10.setColorFilter(null);
        card11.setColorFilter(null);
        card12.setColorFilter(null);
        int i = instance.getPlayers().get(playerIndex).getHand().size();
        RmPmGameState instance1 = new RmPmGameState();
        if (i > 0) {
            card0.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(0).getDrawable());
            Log.i("firstcard", Integer.toString(instance.getPlayers().get(playerIndex).getHand().get(0).getDrawable()));
            Log.i("firstcard", Integer.toString(instance1.getPlayers().get(playerIndex).getHand().get(0).getDrawable()));
            if (i > 1) {
                card1.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(1).getDrawable());
                if (i > 2) {
                    card2.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(2).getDrawable());
                    if (i > 3) {
                        card3.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(3).getDrawable());
                        if (i > 4) {
                            card4.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(4).getDrawable());
                            if (i > 5) {
                                card5.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(5).getDrawable());
                                if (i > 6) {
                                    card6.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(6).getDrawable());
                                    if (i > 7) {
                                        card7.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(7).getDrawable());
                                        if (i > 8) {
                                            card8.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(8).getDrawable());
                                            if (i > 9) {
                                                card9.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(9).getDrawable());
                                                if (i > 10) {
                                                    card10.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(10).getDrawable());
                                                    if (i > 11) {
                                                        card11.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(11).getDrawable());
                                                        if (i > 12) {
                                                            card12.setImageResource(instance.getPlayers().get(playerIndex).getHand().get(12).getDrawable());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(i < 13){
        card12.setVisibility(View.INVISIBLE);
        if (i < 12) {
            card11.setVisibility(View.INVISIBLE);
            if (i < 11) {
                card10.setVisibility(View.INVISIBLE);
                if (i < 10) {
                    card9.setVisibility(View.INVISIBLE);
                    if (i < 9) {
                        card8.setVisibility(View.INVISIBLE);
                        if (i < 8) {
                            card7.setVisibility(View.INVISIBLE);
                            if (i < 7) {
                                card6.setVisibility(View.INVISIBLE);
                                if (i < 6) {
                                    card5.setVisibility(View.INVISIBLE);
                                    if (i < 5) {
                                        card4.setVisibility(View.INVISIBLE);
                                        if (i < 4) {
                                            card3.setVisibility(View.INVISIBLE);
                                            if (i < 3) {
                                                card2.setVisibility(View.INVISIBLE);
                                                if (i < 2) {
                                                    card1.setVisibility(View.INVISIBLE);
                                                    if (i < 1) {
                                                        card0.setVisibility(View.INVISIBLE);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

    public void updateCurrentSet() {

    }

    public void updateOpponents(){
        if (instance.getPlayers().size() < 6) {
            fifthPlayer.setVisibility(View.INVISIBLE);
            if (instance.getPlayers().size() < 5) {
                fourthPlayer.setVisibility(View.INVISIBLE);
                if (instance.getPlayers().size() < 4) {
                    thirdPlayer.setVisibility(View.INVISIBLE);
                    if (instance.getPlayers().size() < 3) {
                        secondPlayer.setVisibility(View.INVISIBLE);
                    }
                }
            }
        }
    }

    public void updateTurn() {
        String output = "Current Player: P" + Integer.toString(instance.getCurrentPlayer() + 1);
        currentPlayerText.setText(output);
    }

    public void updateScreen() {
        updateOpponents();
        updateCards();
        updateCurrentSet();
        updateTurn();
    }
}
