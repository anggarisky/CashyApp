package com.example.anggarisky.cashyapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeAct extends AppCompatActivity {

    TextView textView2, ivItemOneTitle, ivItemOneSubTitle, ivItemTwoTitle,
            ivItemTwoSubTitle, ivItemThreeTitle, ivItemThreeSubTitle;

    Button btnBuy;

    LinearLayout ivItemOne, ivItemTwo, ivItemThree;

    ImageView ivIlls;
    Animation smalltobig, stb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);
        stb2 = AnimationUtils.loadAnimation(this, R.anim.stb2);

        textView2 = (TextView) findViewById(R.id.textView2);
        ivItemOneTitle = (TextView) findViewById(R.id.ivItemOneTitle);
        ivItemOneSubTitle = (TextView) findViewById(R.id.ivItemOneSubTitle);
        ivItemTwoTitle = (TextView) findViewById(R.id.ivItemTwoTitle);
        ivItemTwoSubTitle = (TextView) findViewById(R.id.ivItemTwoSubTitle);
        ivItemThreeTitle = (TextView) findViewById(R.id.ivItemThreeTitle);
        ivItemThreeSubTitle = (TextView) findViewById(R.id.ivItemThreeSubTitle);

        ivItemOne = (LinearLayout) findViewById(R.id.ivItemOne);
        ivItemTwo = (LinearLayout) findViewById(R.id.ivItemTwo);
        ivItemThree = (LinearLayout) findViewById(R.id.ivItemThree);

        btnBuy = (Button) findViewById(R.id.btnBuy);

        ivIlls = (ImageView) findViewById(R.id.ivIlls);

        Typeface mlight = Typeface.createFromAsset(getAssets(), "fonts/MontserratLight.ttf");
        Typeface mmedium = Typeface.createFromAsset(getAssets(), "fonts/MontserratMedium.ttf");
        Typeface mregular = Typeface.createFromAsset(getAssets(), "fonts/MontserratRegular.ttf");


        textView2.setTypeface(mlight);
        ivItemOneTitle.setTypeface(mregular);
        ivItemTwoTitle.setTypeface(mregular);
        ivItemThreeTitle.setTypeface(mregular);
        ivItemOneSubTitle.setTypeface(mlight);
        ivItemOneSubTitle.setTypeface(mlight);
        ivItemTwoSubTitle.setTypeface(mlight);
        ivItemThreeSubTitle.setTypeface(mlight);
        btnBuy.setTypeface(mmedium);

        textView2.setTranslationY(400);

        btnBuy.setTranslationY(400);

        ivItemOne.setTranslationX(800);
        ivItemTwo.setTranslationX(800);
        ivItemThree.setTranslationX(800);


        btnBuy.setAlpha(0);

        textView2.setAlpha(0);

        ivItemOne.setAlpha(0);
        ivItemTwo.setAlpha(0);
        ivItemThree.setAlpha(0);

        btnBuy.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();

        textView2.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();

        ivItemOne.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(200).start();
        ivItemTwo.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(400).start();
        ivItemThree.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(600).start();

        ivIlls.startAnimation(stb2);



    }
}
