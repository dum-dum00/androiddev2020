package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TableLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WeatherActivity extends FragmentActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Create", "This is onCreate function");

        PagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        InputStream inputStream = getResources().openRawResource(R.raw.wiimusic);

        writeExt();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wiimusic);
        mediaPlayer.start();
    }

    private  void writeExt(){
        String fname = "wii-music.mp3";
        String fpath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/Android/data";
        File file = new File(fpath + fname);
        try {
            OutputStream outputStream;
            InputStream inputStream =getApplicationContext().getResources().openRawResource(R.raw.wiimusic);
            file.createNewFile();
            outputStream = new FileOutputStream(file);
            outputStream.write(inputStream.read());
            outputStream.close();
            inputStream.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
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
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Resume", "This is onResume function");

    }
}

