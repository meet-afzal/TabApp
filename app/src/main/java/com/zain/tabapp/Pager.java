package com.zain.tabapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by DELL on 2/13/2018.
 */

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                Tab1Fragement tab1Fragement = new Tab1Fragement();
                return tab1Fragement;
            case 1 :
                Tab2Fragement tab2Fragement = new Tab2Fragement();
                return tab2Fragement;
            case 2 :
                Tab3Fragement tab3Fragement = new Tab3Fragement();
                return tab3Fragement;
            case 3 :
                Tab4Fragement tab4Fragement = new Tab4Fragement();
                return tab4Fragement;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
