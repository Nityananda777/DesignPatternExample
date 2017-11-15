package com.design.adopter;

public class AdopterMediator implements MediaPlayer {
	AdvancedMediaPlayer advancedMediaPlayer;

	public AdopterMediator(String name) {
		if (name.equals("vlc")) {
			this.advancedMediaPlayer = new VlCMediaPlayer();
		} else if (name.equals("MP4")) {
			this.advancedMediaPlayer = new MP4MediaPlayer();
		}
	}

	@Override
	public void play(String fileType, String fileName) {
		// TODO Auto-generated method stub
		this.advancedMediaPlayer.playInMp4(fileType);
	}

}
