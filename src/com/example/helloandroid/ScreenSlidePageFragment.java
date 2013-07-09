package com.example.helloandroid;

import com.loopj.android.image.SmartImageView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ScreenSlidePageFragment extends Fragment {
	private static final String PAGE = "page";
	private int pageNumber;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);
        
        SmartImageView image = (SmartImageView) rootView.findViewById(R.id.image);
		String imageUrl = ClassicAlbumImages.get(pageNumber);
		image.setImageUrl(imageUrl);
        
        return rootView;
    }
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(PAGE);
    }

	public Fragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
	}
}
