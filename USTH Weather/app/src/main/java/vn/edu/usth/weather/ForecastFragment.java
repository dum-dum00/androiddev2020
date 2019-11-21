package vn.edu.usth.weather;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {


    public ForecastFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_forecast, container, false);


        LinearLayout lLayout = new LinearLayout(getActivity());
        lLayout.setBackgroundColor(0xFF11DDCC);
        lLayout.setOrientation(LinearLayout.VERTICAL);
        lLayout.setGravity(Gravity.CENTER);
        lLayout.addView(addTextView());
        lLayout.addView(addImageView());

        return lLayout;
    }

    private TextView addTextView() {
        TextView txtView = new TextView(getActivity());
        txtView.setText("Thursday");
        txtView.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams txtViewP = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        txtView.setLayoutParams(txtViewP);
        return txtView;

    }

    private ImageView addImageView() {
        ImageView imgView = new ImageView(getActivity());
        imgView.setImageResource(R.drawable.weather_icon);
        imgView.setScaleType(ImageView.ScaleType.CENTER);

        LinearLayout.LayoutParams imgViewP = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        imgView.setLayoutParams(imgViewP);
        return imgView;
    }
}