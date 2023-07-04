


package com.example.news100.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.news100.NewsGroup.F_business;
import com.example.news100.NewsGroup.F_entertainment;
import com.example.news100.NewsGroup.F_Trending;
import com.example.news100.NewsGroup.F_sports;
import com.example.news100.NewsGroup.F_technology;

public class Adapterone extends FragmentPagerAdapter {
    public Adapterone(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {

            return new F_business();

        } else if (position == 1) {

            return new F_entertainment();


        } else if (position == 2) {

            return new F_Trending();

        } else if (position == 3) {

            return new F_technology();

        } else if (position == 4) {

            return new F_sports();

        } else return new F_business();
    }

    @Override
    public int getCount() {
        return 5;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {

            return "Business";

        } else if (position == 1) {
            return "Trending";
        } else if (position == 2) {
            return "entertainment";
        } else if (position == 3) {
            return "technology";
        } else if (position == 4) {
            return "sports";
        } else return "health";
    }


}












