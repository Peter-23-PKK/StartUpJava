package com.sci;

public enum Music implements MyInterface {

	Rock("Lay Phyu") {
		@Override
		public void playSong() {
			System.out.println("Playing : a song");

		}

		public String getSong() {
			return super.getSong();
		}
	},
	POP("Hello") {
		@Override
		public void playSong() {
			System.out.println("Playing : a song");

		}

		public String getSong() {
			return super.getSong();
		}
	},
	Rap("Rap God") {
		@Override
		public void playSong() {
			System.out.println("Playing : a song");
		}

		public String getSong() {
			return super.getSong();
		}
	};

	private String song;

	Music(String song) {
		System.out.println("Music Constructor");
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public abstract void playSong();
}

interface MyInterface {

}