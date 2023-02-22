package com.myproject.rock_paper_scissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void chosenRock(View view){
        this.selectedOption(0);
    }
    public  void chosenPaper(View view){
        this.selectedOption(1);
    }
    public  void chosenScissors(View view){
        this.selectedOption(2);
    }

    public void selectedOption(int choose){
        ImageView imageResult = findViewById(R.id.imageResult);
        ImageView imageUserChoice = findViewById(R.id.imageUserChoise);
        int[] options = {0,1,2};
        int appOption = new Random().nextInt(options.length);

        switch (choose){
            case 0:
                imageUserChoice.setImageResource(R.drawable.rock);
                break;
            case 1:
                imageUserChoice.setImageResource(R.drawable.paper);
                break;
            case 2:
                imageUserChoice.setImageResource(R.drawable.scissors);
                break;
        }

        switch (appOption){
            case 0:
                imageResult.setImageResource(R.drawable.rock);
                break;
            case 1:
                imageResult.setImageResource(R.drawable.paper);
                break;
            case 2:
                imageResult.setImageResource(R.drawable.scissors);
                break;
        }
        TextView text = findViewById(R.id.textResult);

        if(choose == 0 && appOption == 1 || choose == 1 && appOption == 2 || choose == 2 && appOption == 0){
            text.setText("Derrota! O App ganhou!");
        } else if(choose == 0 && appOption == 2 || choose == 1 && appOption == 0 || choose == 2 && appOption == 1){
            text.setText("Vitória! Você ganhou!");
        } else{
            text.setText("Empate!");
        }
    }

}