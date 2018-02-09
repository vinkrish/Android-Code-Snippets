package com.propertyanimation.sriyanksiddhartha.before;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    private RelativeLayout relativeLayout;

    int ctr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        imageView = (ImageView) findViewById(R.id.imageview);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        relativeLayout = (RelativeLayout) findViewById(R.id.rlayout);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator anim;

                if(ctr %2 == 0){
                    anim = ObjectAnimator.ofObject(relativeLayout, "backgroundColor", new ArgbEvaluator(),
                            Color.GREEN, Color.RED);

                }else{

                    anim = ObjectAnimator.ofObject(relativeLayout, "backgroundColor", new ArgbEvaluator(),
                            Color.RED, Color.GREEN);
                }

                anim.setDuration(2000);
                anim.start();
                ctr++;

            }
        });

    }


    public void rotateAnimation(View view) {
        ObjectAnimator anim
                = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
        anim.setDuration(500);
        anim.start();
    }

    public void scaleAnimation(View view) {
        ObjectAnimator anim
                = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 2.0f);
        anim.setDuration(500);
        anim.start();
    }


    public void translateAnimation(View view) {
        ObjectAnimator anim
                = ObjectAnimator.ofFloat(imageView, "translationX", 0f, 80f);
        anim.setDuration(500);
        anim.start();
    }


    public void alphaAnimation(View view) {
        ObjectAnimator anim
                = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
        anim.setDuration(500);
        anim.start();
    }

    public void setAnimation(View view) {
        // Parent
        AnimatorSet rootSet = new AnimatorSet();

        // Child 1
        ObjectAnimator rotate
                = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
        rotate.setDuration(500);

        // Child 2
        AnimatorSet childSet = new AnimatorSet();

        ObjectAnimator scaleX
                = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 2.0f);
        scaleX.setDuration(300);

        ObjectAnimator scaleY
                = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 2.0f);
        scaleY.setDuration(300);


        rootSet.play(rotate).before(childSet);
        childSet.play(scaleX).with(scaleY);

        rootSet.start();
    }
}
