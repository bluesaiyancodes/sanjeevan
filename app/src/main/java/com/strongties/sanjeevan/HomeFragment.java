package com.strongties.sanjeevan;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class HomeFragment extends Fragment {

    ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;
    TextView textView1, textView2, textView3, textView4, textView5;
    Boolean imageView1_spinned = false, imageView2_spinned = false, imageView3_spinned = false, imageView4_spinned = false, imageView5_spinned = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_home, container, false);

        final Context context= getContext();
        imageView1 = root.findViewById(R.id.home_image1);
        textView1 = root.findViewById(R.id.text_home_image1);
        imageView2 = root.findViewById(R.id.home_image2);
        textView2 = root.findViewById(R.id.text_home_image2);
        imageView3 = root.findViewById(R.id.home_image3);
        textView3 = root.findViewById(R.id.text_home_image3);
        imageView4 = root.findViewById(R.id.home_image4);
        textView4 = root.findViewById(R.id.text_home_image4);
        imageView5 = root.findViewById(R.id.home_image5);
        textView5 = root.findViewById(R.id.text_home_image5);

        imageView6 = root.findViewById(R.id.home_image6);

        final Random random = new Random();

        @SuppressLint("HandlerLeak") final Handler handler = new Handler() {
            @SuppressLint("HandlerLeak")
            @Override
            public void handleMessage(Message msg) {
                int randomNumber = random.nextInt(5)+1;
                String string = Integer.toString(randomNumber);
              //  Toast.makeText(getContext(), "Number: " + string, Toast.LENGTH_SHORT).show();
                switch (randomNumber){
                    case 1:
                        imageView1.performClick();
                        break;
                    case 2:
                        imageView2.performClick();
                        break;
                    case 3:
                        imageView3.performClick();
                        break;
                    case 4:
                        imageView4.performClick();
                        break;
                    case 5:
                        imageView5.performClick();
                        break;
                }

            }
        };

        Runnable runnable = new Runnable() {
            public void run() {
                int count = 0;
                while (count < 1){
                    synchronized (this) {
                        try {
                          //  int randomNumber = random.nextInt(0) + 1;
                            wait(1000);
                            count++;
                            handler.sendEmptyMessage(0);
                        } catch (Exception e) {}
                    }
                }
            }
        };
        Thread mythread = new Thread(runnable);
        mythread.start();




        // For image 1
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator anim = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flipping);
                anim.setTarget(imageView1);
                anim.setDuration(600);
                ObjectAnimator anim2 = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flippingtext);
                anim2.setTarget(textView1);
                anim2.setDuration(600);

                anim.start();
                anim2.start();
                imageView1_spinned = !imageView1_spinned;
                if (imageView1_spinned == true){
                    imageView1.setAlpha((float) 0.1);
                    textView1.setText(getString(R.string.home_text_1));
                }else{
                    imageView1.setAlpha((float) 1);
                    textView1.setText(getString(R.string.home_image_blank));
                }
            }
        });

        // For image 2
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator anim = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flipping);
                anim.setTarget(imageView2);
                anim.setDuration(600);
                ObjectAnimator anim2 = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flippingtext);
                anim2.setTarget(textView2);
                anim2.setDuration(600);

                anim.start();
                anim2.start();
                imageView2_spinned = !imageView2_spinned;
                if (imageView2_spinned == true){
                    imageView2.setAlpha((float) 0.1);
                    textView2.setText(getString(R.string.home_text_2));
                }else{
                    imageView2.setAlpha((float) 1);
                    textView2.setText(getString(R.string.home_image_blank));
                }
            }
        });

        // For image 3
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator anim = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flipping);
                anim.setTarget(imageView3);
                anim.setDuration(600);
                ObjectAnimator anim2 = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flippingtext);
                anim2.setTarget(textView3);
                anim2.setDuration(600);

                anim.start();
                anim2.start();
                imageView3_spinned = !imageView3_spinned;
                if (imageView3_spinned == true){
                    imageView3.setAlpha((float) 0.1);
                    textView3.setText(getString(R.string.home_text_3));
                }else{
                    imageView3.setAlpha((float) 1);
                    textView3.setText(getString(R.string.home_image_blank));
                }
            }
        });

        // For image 4
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator anim = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flipping);
                anim.setTarget(imageView4);
                anim.setDuration(600);
                ObjectAnimator anim2 = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flippingtext);
                anim2.setTarget(textView4);
                anim2.setDuration(600);

                anim.start();
                anim2.start();
                imageView4_spinned = !imageView4_spinned;
                if (imageView4_spinned == true){
                    imageView4.setAlpha((float) 0.1);
                    textView4.setText(getString(R.string.home_text_4));
                }else{
                    imageView4.setAlpha((float) 1);
                    textView4.setText(getString(R.string.home_image_blank));
                }
            }
        });

        // For image 5
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator anim = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flipping);
                anim.setTarget(imageView5);
                anim.setDuration(600);
                ObjectAnimator anim2 = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flippingtext);
                anim2.setTarget(textView5);
                anim2.setDuration(600);

                anim.start();
                anim2.start();
                imageView5_spinned = !imageView5_spinned;
                if (imageView5_spinned == true){
                    imageView5.setAlpha((float) 0.1);
                    textView5.setText(getString(R.string.home_text_5));
                }else{
                    imageView5.setAlpha((float) 1);
                    textView5.setText(getString(R.string.home_image_blank));
                }
            }
        });

        // For image 6
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator anim = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flipping);
                anim.setTarget(imageView6);
                anim.setDuration(600);
                anim.start();
            }
        });


        return root;
    }

    private class task implements Runnable {
        @Override
        public void run(){
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
         //   initiate();
        }
    }

    private void initiate() {
        imageView1.performClick();
    }
}
