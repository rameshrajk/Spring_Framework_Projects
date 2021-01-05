package com.raj.spring.springcore.sec8ass;

public class MyDAO {


	private String url;
	private String userName;
	private String password;

	MyDAO(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDAO [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
}

