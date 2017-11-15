package com.design.adopter;

public class VlCMediaPlayer implements AdvancedMediaPlayer {

	@Override
	public void playInVLC(String fileType) {
		// TODO Auto-generated method stub
		System.out.println("playing in vlc " + fileType);
	}

	@Override
	public void playInMp4(String fileType) {
		// TODO Auto-generated method stub

		System.out.println("playing in mp4 " + fileType);
	}

}
