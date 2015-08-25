package info.androidhive.camerafileupload;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import java.util.List;

/**
 * Created by ser on 2015/8/12.
 */
public class MainPageAdapter extends FragmentStatePagerAdapter {

    private String tabTitles[] = new String[] { "英雄排行榜","任務清單", "照片上傳" };

    private Context context;
    List<Fragment> fragments;

    public MainPageAdapter(FragmentManager fm , List<Fragment> f,Context context) {
        super(fm);
        this.context=context;
        fragments=f;

    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public Fragment getItem(int position) {
       return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
