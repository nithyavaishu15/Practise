package com.abc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//		System.out.println("enter the title ");
		//		Scanner scan=new Scanner(System.in);
		//		String etitle=scan.next();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		String url="https://dev-app.procareconnect.com";
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
}