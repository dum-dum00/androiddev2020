package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;


import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.widget.TableLayout;

public class WeatherActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Create", "This is onCreate function");

        PagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Start", "This is onStart function");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop", "This is onStop function");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy", "This is onDestroy function");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Pause", "This is onPause function");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Resume", "This is onResume function");

    }
}

