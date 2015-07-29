package com.alienske.slakeapp;

import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by User on 7/29/2015.
 */
public class appIntro extends AppIntro {

    @Override
    public void init(Bundle bundle) {
        // Add your slide's fragments here
        // AppIntro will automatically generate the dots indicator and buttons.

       /* addSlide(first_fragment);
        addSlide(second_fragment);
        addSlide(third_fragment);
        addSlide(fourth_fragment);*/

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest
        addSlide(AppIntroFragment.newInstance("Peter Muturi", "The coolest guy in the Planet", R.drawable.download, R.color.bright_foreground_inverse_material_light ));
        addSlide(AppIntroFragment.newInstance("Visit him", "He lives in Kenya", R.drawable.kenya, R.color.abc_secondary_text_material_light));

               // OPTIONAL METHODS
               // Override bar/separator color
               setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button
        showSkipButton(false);
        showDoneButton(false);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed() {

    }

    @Override
    public void onDonePressed() {

    }
}
