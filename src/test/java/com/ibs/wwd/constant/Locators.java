package com.ibs.wwd.constant;

public interface Locators {

	// Personal Information
	String BY_XPATH_CUSTOMERID = "//*[starts-with(@id, 'cust')]";
	String BY_XPATH_FULLNAME = "//*[contains(@name, 'lln')]";
	String BY_ID_DOB = "dob";
	String BY_ID_GENDER = "female";
	
	// Contact & Address
	String BY_ID_PHONENUMBER = "phone";
	String BY_CSSSELECTOR_EMAILADDRESS = "#email";
	String BY_ID_ADDRESS = "address";
	
	// Service Details
	String BY_ID_PLAN = "plan";
	String BY_ID_SIMCARDNUMBER = "simNumber";
	String BY_NAME_DEVICEIMEI = "deviceIMEI";
	String BY_XPATH_ACTIVATIONDATE = "//*[@id='activationDate']";
	String BY_ID_CHECKBOXPORTNUMBER = "porting";
	String BY_XPATH_PREVIOUSCARRIER = "//*[@id = 'prevCarrier']";
	
	// Terms & Submit
	String BY_ID_AGREECONDITIONCHECKBOX = "terms";
	String BY_CSSSELECTOR_BUTTONSUBMIT = "#submitBtn";
	
	// Documents
	String BY_XPATH_IDPROOF = "/html/body/form/fieldset[4]/input[1]";
	String BY_ID_SIGNATURE = "signature";
}
