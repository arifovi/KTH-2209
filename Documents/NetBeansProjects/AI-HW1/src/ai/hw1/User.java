/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.hw1;

/**
 *
 * @author Arif
 */
import java.io.Serializable;

import ai.hw1.Artifact.Genre;

public class User implements Serializable {
	
	private int interestCentury;
	private Artifact.Genre interestGenre;
	
	public User() {
		interestCentury = (int) (Math.random() * 500 + 1500);
		interestCentury = interestCentury - (interestCentury % 100);
		
		int randomGenreIndex = (int) (Math.random() * 2);
		interestGenre = Genre.values()[randomGenreIndex];
	}

	public int getInterestCentury() {
		return interestCentury;
	}

	public void setInterestCentury(int interestCentury) {
		this.interestCentury = interestCentury;
	}

	public Artifact.Genre getInterestGenre() {
		return interestGenre;
	}

	public void setInterestGenre(Artifact.Genre interestGenre) {
		this.interestGenre = interestGenre;
	}
	
}

