package net.one97.airtel.cricketteamselector.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import net.one97.airtel.cricketteamselector.Fragment.CompleteOrderFragment;
import net.one97.airtel.cricketteamselector.Fragment.PendingOrderFragment;

/**
 * Created by sandeep2.kumar on 22-02-2016.
 */
public class OrderAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public OrderAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PendingOrderFragment tab1 = new PendingOrderFragment();
                return tab1;
            case 1:
                CompleteOrderFragment tab2 = new CompleteOrderFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}