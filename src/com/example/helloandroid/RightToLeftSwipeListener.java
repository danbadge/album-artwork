package com.example.helloandroid;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

public class RightToLeftSwipeListener extends SimpleOnGestureListener {
	private final int DEFAULT_SWIPE_MIN_DISTANCE = 120;
    private final int DEFAULT_SWIPE_THRESHOLD_VELOCITY = 200;
	
    @Override
    public boolean onFling(MotionEvent eventOne, MotionEvent eventTwo, 
                                    float velocityX, float velocityY) {
    	return isRightToLeftSwipe(eventOne, eventTwo, velocityX);
    }
    
    private boolean isRightToLeftSwipe(MotionEvent eventOne, MotionEvent eventTwo, float velocityX) {
    	return isSwipe(eventOne.getX(), eventTwo.getX(), velocityX);
    }
    
    private boolean isSwipe(float coordinateA, float coordinateB, float velocity) {
        return isSwipeDistance(coordinateA, coordinateB)
                && isSwipeSpeed(velocity);
    }
    
    private boolean isSwipeDistance(float coordinateA, float coordinateB) {
        return (coordinateA - coordinateB) > this.DEFAULT_SWIPE_MIN_DISTANCE;
    }

    private boolean isSwipeSpeed(float velocity) {
        return Math.abs(velocity) > this.DEFAULT_SWIPE_THRESHOLD_VELOCITY;
    }
}
