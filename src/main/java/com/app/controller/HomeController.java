package com.app.controller;

import java.util.function.Supplier;

public class HomeController {
	
		public static void main(String[] args) {
			Supplier<String> ss=()-> {
				String otp="";
				for (int i=0; i<6; i++)
				{
					otp =otp+(int)(Math.random()*9);
				}
				return otp;
			};
			System.out.println(ss.get());
			System.out.println(ss.get());
			System.out.println(ss.get());
		}
	}

