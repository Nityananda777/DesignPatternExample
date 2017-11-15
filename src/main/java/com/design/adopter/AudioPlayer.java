package com.design.adopter;

public class AudioPlayer implements MediaPlayer {
	AdopterMediator adopterMediator;

	@Override
	public void play(String fileType, String fileName) {
		// TODO Auto-generated method stub
		if (fileType.equals("mp3")) {
			System.out.println("Playing MP3 file only");
		} else if (fileType.equals("vlc")) {
			adopterMediator = new AdopterMediator(fileType);
			adopterMediator.play(fileType, fileName);
		}
	}
}