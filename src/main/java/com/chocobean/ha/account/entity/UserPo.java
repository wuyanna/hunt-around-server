package com.chocobean.ha.account.entity;

/**
 * 
 * @author chris.liu
 * 
 */
public class UserPo {
	private int id;
	private String account;
	private String pwd;
	private String clientUUID;
	private String pids;
	private long registerDate;
	private int countryCode;
	private String firstName;
	private String lastName;
	private int gender;
	private String timeZone;
	private String macAddress;
	private String iphoneUUID;
	private String appUUID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getClientUUID() {
		return clientUUID;
	}

	public void setClientUUID(String clientUUID) {
		this.clientUUID = clientUUID;
	}

	public String getPids() {
		return pids;
	}

	public void setPids(String pids) {
		this.pids = pids;
	}

	public long getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(long registerDate) {
		this.registerDate = registerDate;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getIphoneUUID() {
		return iphoneUUID;
	}

	public void setIphoneUUID(String iphoneUUID) {
		this.iphoneUUID = iphoneUUID;
	}

	public String getAppUUID() {
		return appUUID;
	}

	public void setAppUUID(String appUUID) {
		this.appUUID = appUUID;
	}
}
