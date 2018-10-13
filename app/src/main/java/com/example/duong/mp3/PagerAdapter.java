package com.example.duong.mp3;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm){
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch(position){
            case 0:{
                frag=new song();
                break;
            }
            case 1:{
                frag=new Album();
                break;
            }
        }
        return frag;
    }
    @Override
    public int getCount(){
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch(position){
            case 0:{
                title="List Song";
                break;
            }
            case 1:{
                title="List Album";
                break;
            }
        }
        return title;
    }
}
