package entities;

public class Client {
	
	public String code;
	public String name;
	public String profession;
	public String birthday;
	public String eMail;
	public String city;
	public String telephoneNum;
	
	public String  code() {
		return code;	
	}
	public String  name() {
		return name;	
	}
	public String  profession() {
		return profession;	
	}
	public String  birthday() {
		return birthday;	
	}
	public String  eMail() {
		return eMail;	
	}
	public String  city() {
		return city;	
	}
	public String  telephoneNum() {
		return telephoneNum;	
	}
	public String toString () {
		return "CODE = "+code
			+ "\nNAME = "+name
			+ "\nPROFESSION = "+profession
			+ "\nBIRTHDAY = "+birthday
			+ "\nE-MAIL = "+eMail
			+ "\nCITY = "+city
			+ "\nTELEPHONE NUMBER = "+telephoneNum;
	}
}
