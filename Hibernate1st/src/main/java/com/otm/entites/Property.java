package com.otm.entites;

import java.util.List;

public class Property {
	private int id;
	private String propetyName;
	private String landMark;
	private String address;
	private List<Approval> listApproval;
	
	public List<Approval> getListApproval() {
		return listApproval;
	}
	public void setListApproval(List<Approval> listApproval) {
		this.listApproval = listApproval;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPropetyName() {
		return propetyName;
	}
	public void setPropetyName(String propetyName) {
		this.propetyName = propetyName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", propetyName=" + propetyName + ", landMark=" + landMark + ", address=" + address
				+ "]";
	}
	

}
