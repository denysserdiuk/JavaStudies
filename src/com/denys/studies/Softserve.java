package com.denys.studies;

import java.util.ArrayList;

public class Softserve {

	public static void main(String[] args) {
		
		System.out.println(howMuchILoveYou(50));

	}
	
	public static String howMuchILoveYou(int nb_petals) {
	    
	    String[] petals = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
	    
	    return petals[(nb_petals-1) % 6];
	  
	}
}	    
