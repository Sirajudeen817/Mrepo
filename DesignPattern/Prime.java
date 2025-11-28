package com.DesignPattern;

public class Prime extends Video {

	public Prime(ProcessingQuality quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.print("Playing video in Prime");
		quality.processVideo();
		
	}

}

