package com.sci;

public class Main {

	public static void main(String[] args) {
		Music[] music = Music.values();
		for (Music mus : music) {
			System.out.println(mus.getSong());
			mus.playSong();
		}
	}

}
