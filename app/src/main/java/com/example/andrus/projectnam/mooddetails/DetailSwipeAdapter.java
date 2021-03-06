package com.example.andrus.projectnam.mooddetails;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class DetailSwipeAdapter extends FragmentStatePagerAdapter {
    DetailSwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return OfferDetailFragment.newInstance();
            default:
                return OfferDetailFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
