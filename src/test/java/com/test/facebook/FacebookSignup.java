package com.test.facebook;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.facebook.BaseTest;
import com.pages.facebook.FacebookLoginPage;
import com.pages.facebook.FacebookSignupPage;

public class FacebookSignup extends BaseTest {
	@Test
	public void signup() throws IOException {
		FacebookLoginPage fbl=new FacebookLoginPage(driver);
		fbl.createNewAccountMethod();
		FacebookSignupPage fbs=new FacebookSignupPage(driver);
		fbs.SignupMethod();
	}
}
