package com.lti.beans;

public class AdminLoginDTO {
	
	private int adminId;
	private String adminPassword;
	
	public AdminLoginDTO() {
		super();
	}

	public AdminLoginDTO(int adminId, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminPassword = adminPassword;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "AdminLoginDTO [adminId=" + adminId + ", adminPassword=" + adminPassword + "]";
	}
	
	
	
	

}
