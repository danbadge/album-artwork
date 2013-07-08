package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;

import com.loopj.android.image.SmartImageView;

public class MainActivity extends Activity implements OnClickListener {
	private GestureDetector rightToLeftListener;
	private SparseArray<String> classicAlbums = new SparseArray<String>();
	private int counter = 1;

	public MainActivity() {
		classicAlbums.put(1,"http://www.beatlesbible.com/wp/media/abbey_road.jpg");
		classicAlbums.put(2,"http://www.alexandruvita.com/blog/wp-content/uploads/2010/05/Pink-Floyd-Dark-Side-of-t.jpg");
		classicAlbums.put(3,"http://media-cache-ec3.pinimg.com/736x/8a/2a/fe/8a2afedf10058b46a20f36e947f0285a.jpg");
		classicAlbums.put(4,"http://media-cache-ak0.pinimg.com/736x/20/30/6b/20306b23c66354a9bac17435e1bae419.jpg");
		classicAlbums.put(5,"http://www.sydbarrettpinkfloyd.com/uploaded_images/wish-you-were-here-pink-floyd-737825.jpg");
		classicAlbums.put(6,"http://media-cache-ec3.pinimg.com/736x/71/ba/99/71ba99d75b08229790ea373eca8e149e.jpg");
		classicAlbums.put(7,"http://cdn.stereogum.com/files/2012/10/radiohead-the-bends.jpeg");
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final SmartImageView image = (SmartImageView) findViewById(R.id.beatles);
		String imageUrl = classicAlbums.get(counter);
		image.setImageUrl(imageUrl);

		rightToLeftListener = new GestureDetector(this, new RightToLeftSwipeListener());

		image.setOnClickListener(MainActivity.this);
		
		image.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				if (rightToLeftListener.onTouchEvent(event)) {
					if (counter == classicAlbums.size())
						counter = 1;
					else
						counter++;
					
					String newImageUrl = classicAlbums.get(counter);
					image.setImageUrl(newImageUrl);
					return true;
				}
				return false;
			}
		});
	}

	@Override
	public void onClick(View view) {
		// do nothing
	}
}