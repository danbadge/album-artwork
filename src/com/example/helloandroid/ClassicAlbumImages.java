package com.example.helloandroid;

import android.util.SparseArray;

public class ClassicAlbumImages {
	private static SparseArray<String> classicAlbums = new SparseArray<String>();
	
	static {
		classicAlbums.put(0,"http://www.beatlesbible.com/wp/media/abbey_road.jpg");
		classicAlbums.put(1,"http://www.alexandruvita.com/blog/wp-content/uploads/2010/05/Pink-Floyd-Dark-Side-of-t.jpg");
		classicAlbums.put(2,"http://media-cache-ec3.pinimg.com/736x/8a/2a/fe/8a2afedf10058b46a20f36e947f0285a.jpg");
		classicAlbums.put(3,"http://media-cache-ak0.pinimg.com/736x/20/30/6b/20306b23c66354a9bac17435e1bae419.jpg");
		classicAlbums.put(4,"http://www.sydbarrettpinkfloyd.com/uploaded_images/wish-you-were-here-pink-floyd-737825.jpg");
		classicAlbums.put(5,"http://media-cache-ec3.pinimg.com/736x/71/ba/99/71ba99d75b08229790ea373eca8e149e.jpg");
		classicAlbums.put(6,"http://cdn.stereogum.com/files/2012/10/radiohead-the-bends.jpeg");	
	}
	
	public static String get(int key) {
		return classicAlbums.get(key);
	}
	
	public static int count() {
		return classicAlbums.size();
	}
}