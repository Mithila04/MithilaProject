package com.Mithila;

import org.testng.annotations.Test;

public class GroupingMethods {
	@Test(groups = "VEG")
	private void dosai() {
		System.out.println("dosai");
	}

	@Test(groups = "VEG")
	private void idly() {
		System.out.println("idly");
	}

	@Test(groups = "VEG")
	private void vadai() {
		System.out.println("vadai");
	}

	@Test(groups = "VEG")
	private void rava() {
		System.out.println("rava");
	}

	@Test(groups = "NONVEG")
	private void chicken() {
		System.out.println("chicken");
	}

	@Test(groups = "NONVEG")
	private void mutton() {
		System.out.println("mutton");
	}

	@Test(groups = "NONVEG")

	private void egg() {
		System.out.println("egg");
	}

	@Test(groups = "Electronic")
	private void laptop() {
		System.out.println("laptop");
	}

	@Test(groups = "Electronic")
	private void Tv() {
		System.out.println("Tv");
	}
	@Test(groups= "Electronic")
	private void Mobile() {
		System.out.println("Mobile");
	}

}


