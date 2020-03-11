package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RatingBar rating_b;
    private static TextView text_v;
    private  static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listenerForRatingBAR();
        onButtonClickListener();
    }
    public void listenerForRatingBAR(){
        rating_b =(RatingBar) findViewById(R.id.ratingBar2);
        text_v=(TextView) findViewById(R.id.textView2);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                              text_v.setText(String.valueOf(rating));
                    }
                }
        );


    }

    public void onButtonClickListener(){
        rating_b =(RatingBar) findViewById(R.id.ratingBar2);
        btn=(Button) findViewById(R.id.button2);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,String.valueOf(rating_b.getRating()),
                                Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }
}
