package com.sci;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] actors = new String[3][2];
		actors[0][0] = "Keanu";
		actors[0][1] = "Reeves";
		actors[1][0] = "Tom";
		actors[1][1] = "Hanks";
		actors[2][0] = "Johny";
		actors[2][1] = "Deep";

		System.out.println("Row Length : " + actors.length);
		System.out.println("First Row Column Length : " + actors[0].length);
		System.out.println("Second Row Column Length : " + actors[1].length);
		System.out.println("Third Row Column Length : " + actors[2].length);

		for (int i = 0; i < actors.length; i++) {
			for (int j = 0; j < actors[i].length; j++) {
				System.out.print(actors[i][j] + " ");
			}
			System.out.println();
		}
	}

}
