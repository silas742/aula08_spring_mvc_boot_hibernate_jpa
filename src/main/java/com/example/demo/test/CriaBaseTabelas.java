package com.example.demo.test;

import javax.persistence.Persistence;

public class CriaBaseTabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("silasPU");

	}

}
