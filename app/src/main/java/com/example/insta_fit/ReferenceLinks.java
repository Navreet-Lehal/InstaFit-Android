package com.example.insta_fit;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReferenceLinks extends AppCompatActivity {

    TextView link1;
    TextView link2;
    TextView link3;
    TextView link4;
    TextView link5;
    TextView link6;
    TextView link7;
    String tmpStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_links);

        link1 = findViewById(R.id.link1);
        link2 = findViewById(R.id.link2);
        link3 = findViewById(R.id.link3);
        link4 = findViewById(R.id.link4);
        link5 = findViewById(R.id.link5);
        link6 = findViewById(R.id.link6);
        link7 = findViewById(R.id.link7);

        tmpStr = "20 superfoods to help with weight loss:\nhttps://www.healthline.com/nutrition/20-most-weight-loss-friendly-foods";
        link1.setText(tmpStr);
        tmpStr = "Healthy exercises for men:\nhttps://www.menshealth.com/fitness/a19516747/the-best-exercises-for-men/";
        link2.setText(tmpStr);
        tmpStr = "Healthy exercises for women:\nhttps://www.womenshealthmag.com/fitness/a20052492/best-workout-for-women-0/";
        link3.setText(tmpStr);
        tmpStr = "Yoga exercises for kids:\nhttps://www.momjunction.com/articles/easy-and-effective-yoga-poses-for-your-kids_00377906//";
        link4.setText(tmpStr);
        tmpStr = "Yoga exercises for Seniors:\nhttps://www.doyogawithme.com/content/yoga-seniors/";
        link5.setText(tmpStr);
        tmpStr = "Aerobic and Anaerobic Exercises:\nhttps://www.healthline.com/health/fitness-exercise/aerobic-vs-anaerobic";
        link6.setText(tmpStr);
        tmpStr = "Weight loss exercise at home:\nhttps://www.shape.com/fitness/workouts/weight-loss-exercise-at-home";
        link7.setText(tmpStr);

        Linkify.addLinks(link1, Linkify.ALL);
        Linkify.addLinks(link2, Linkify.ALL);
        Linkify.addLinks(link3, Linkify.ALL);
        Linkify.addLinks(link4, Linkify.ALL);
        Linkify.addLinks(link5, Linkify.ALL);
        Linkify.addLinks(link6, Linkify.ALL);
        Linkify.addLinks(link7, Linkify.ALL);
    }

    public void backButton(View view){
        finish();
    }
}
