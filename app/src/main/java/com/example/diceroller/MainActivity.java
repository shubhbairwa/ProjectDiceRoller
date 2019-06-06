package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDicey;
    private Random myRandomNumber=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    imageViewDicey =findViewById(R.id.imageView);
    imageViewDicey.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            rollOurDice();
        }
    });

    }

    public void rollOurDice(){
        int myRanNumber=myRandomNumber.nextInt(6)+1;
        switch(myRanNumber){
            case 1:
                imageViewDicey.setImageResource(R.drawable.dice1);
break;
            case 2:
                imageViewDicey.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicey.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicey.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicey.setImageResource(R.drawable.dice5);
break;
            case 6:
                imageViewDicey.setImageResource(R.drawable.dice6);
break;
        }
    }
}
