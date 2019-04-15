package com.androdev.custommessenger;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

public class SettingsPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_pager);

        ViewPager settingsPager = (ViewPager) findViewById(R.id.settings_pager);
        settingsPager.setAdapter(new SettingsPagerAdapter(getSupportFragmentManager()));
        PagerTitleStrip setPagerTitleStrip = (PagerTitleStrip) findViewById(R.id.set_pager_title_strip);
        setPagerTitleStrip.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);
        setPagerTitleStrip.setNonPrimaryAlpha((float) 0.3);
    }

    private class SettingsPagerAdapter extends FragmentPagerAdapter{

        public SettingsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            switch (i){
                case 0: return new PrivacySecurityFragment();
                case 1: return new DataStorageFragment();
                case 2: return new NotificationSoundsFragment();
                case 3: return new CustomizationFragment();
                case 4: return new HelpFragment();
                default: return new PrivacySecurityFragment();
            }

        }

        @Override
        public int getCount() {
            return 5;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0 : return "Privacy and Security";
                case 1 : return "Data and Storage";
                case 2 : return "Notifications and Sounds";
                case 3 : return "Customization";
                case 4 : return "Help";
                default: return "Privacy and Security";
            }

        }

    }

    public class CustomFontPagerTitleStrip extends PagerTitleStrip {

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "product_sans_bold.ttf");

        public CustomFontPagerTitleStrip(Context context) {
            super(context);
        }
        public CustomFontPagerTitleStrip(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
        protected void onLayout(boolean changed, int l, int t, int r, int b) {
            super.onLayout(changed, l, t, r, b);
            for (int i=0; i<this.getChildCount(); i++) {
                if (this.getChildAt(i) instanceof TextView) {
                    ((TextView)this.getChildAt(i)).setTypeface(tf);
                }
            }
        }
    }

}
