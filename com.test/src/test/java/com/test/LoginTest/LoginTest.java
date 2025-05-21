package com.test.LoginTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.Base.Base;
import com.test.Login.Login;

public class LoginTest extends Base {
    Login login;

    
    
    @BeforeMethod
    public void setUp() {
        login = new Login(); 
    }

    @Test
    public void validatePageTitle() {
        String actualTitle = login.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        
        Assert.assertTrue(actualTitle.contains("Amazon"), "not contain");
    }
}
