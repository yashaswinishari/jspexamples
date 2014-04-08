package com.kogent.jspex;

public class RegForm implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uname,pass,repass,email,fn,ln,address;

	public String getUserName() {
		return uname;
	}

	public void setUserName(String s) {
		uname = s;
	}

	public String getPassword() {
		return pass;
	}

	public void setPassword(String s) {
		pass = s;
	}

	public String getRepassword() {
		return repass;
	}

	public void setRepassword(String s) {
		repass = s;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String s) {
		email = s;
	}

	public String getFirstName() {
		return fn;
	}

	public void setFirstName(String s) {
		fn = s;
	}

	public String getLastName() {
		return ln;
	}

	public void setLastName(String s) {
		ln = s;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String s) {
		address = s;
	}
	

}
