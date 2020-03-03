package com.example.lab04;

import android.support.v4.app.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount= numTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new tip();
            case 1: return new dist();
            case 2: return new temp();
            default: return null;
        }
    }

    @Override
    public int getCount() { return tabCount; }
}

