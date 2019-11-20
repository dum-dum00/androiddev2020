package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;


import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;

public class WeatherActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Create", "This is onCreate function");

        ForecastFragment forecastFragment = new ForecastFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.container, forecastFragment).commit();
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

