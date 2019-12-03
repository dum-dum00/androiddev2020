package vn.edu.usth.weather;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomeFragmentPagerAdapter extends FragmentPagerAdapter{

    private final int PAGE_COUNT = 3;
    private String titles[] = new String[]{"Hanoi", "London", "Paris"};

    public HomeFragmentPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @NonNull
    @Override
    public Fragment getItem(int current_page) {
        switch (current_page) {
            case 0:
                ;
                WeatherAndForcastFragment fragment1 = new WeatherAndForcastFragment();
                return fragment1;
            case 1:
                ;
                WeatherAndForcastFragment fragment2 = new WeatherAndForcastFragment();
                return fragment2;
            case 2:
                ;
                WeatherAndForcastFragment fragment3 = new WeatherAndForcastFragment();
                return fragment3;

            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int page) {
        return titles[page];
    }
}
