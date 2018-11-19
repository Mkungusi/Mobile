package net.mkungusi.rankr.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import net.mkungusi.rankr.fragments.ProfileFragment;
import net.mkungusi.rankr.fragments.RankingFragment;
import net.mkungusi.rankr.fragments.SettingsFragment;

// PagerAdapter class
public class SlidePagerAdapter extends FragmentPagerAdapter {

    private int NUM = 3;

    public SlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {

            return new RankingFragment();
        } else if (position == 1) {
            return new ProfileFragment();
        } else if (position == 2){
            return new SettingsFragment();
        } else return null;
    }

    @Override
    public int getCount() {
        return NUM;
    }

}