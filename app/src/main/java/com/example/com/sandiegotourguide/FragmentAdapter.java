package com.example.com.sandiegotourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OutdoorsFragment();
        } else if (position == 1) {
            return new FamiliesFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.outdoors);
        } else if (position == 1) {
            return mContext.getString(R.string.families);
        } else if (position == 2) {
            return mContext.getString(R.string.museums);
        } else {
            return mContext.getString(R.string.shopping);
        }
    }
}
