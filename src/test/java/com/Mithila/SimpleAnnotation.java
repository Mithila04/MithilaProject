package com.Mithila;

import org.testng.annotations.BeforeSuite;

public class SimpleAnnotation {
	@BeforeSuite
	private void propertySetting() {
		System.out.println();
	}

}
