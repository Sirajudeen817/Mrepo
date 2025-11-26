package com.DesignPattern;

public class Youtube extends Video {

	public Youtube(ProcessingQuality quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.print("Playing video in Youtube with ");
		quality.processVideo();
	}

}
