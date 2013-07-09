package com.example.helloandroid;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
	private int totalNumberOfPages;

	public ScreenSlidePagerAdapter(FragmentManager fragmentManager, int totalNumberOfPages) {
		super(fragmentManager);
		this.totalNumberOfPages = totalNumberOfPages;
	}

	@Override
	public Fragment getItem(int position) {
		return new ScreenSlidePageFragment().create(position);
	}

	@Override
	public int getCount() {
		return totalNumberOfPages;
	}
}
