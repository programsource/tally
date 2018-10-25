package com.cocoon.jay.tallybook.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * 记账界面中的上方消费类型的,viewpager adapter
 */

public class MyPagerAdapter extends PagerAdapter {
	private List<View> imageViews ;
	private String[] mTitles ;
    public MyPagerAdapter(List<View> imageViews){
    	this.imageViews = imageViews;
    }
    public MyPagerAdapter(List<View> imageViews, String[] mTitles){
    	this.imageViews = imageViews;
    	this.mTitles= mTitles;
    }
	@Override
	public int getCount() {
		return imageViews.size();
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		return mTitles[position];
	}
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(imageViews.get(position));
		return imageViews.get(position);
	}
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    	container.removeView(imageViews.get(position));
    }
	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0==arg1;
	}

}
