package com.statista.mock.booking.dto;


public class SalesforceOpportunity {
	
	private String id;
	private String amount;
	private String closeDate;
	private String name;
	private String leadSource;
	private String owner;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "SalesforceOpportunity [id=" + id + ", amount=" + amount + ", closeDate=" + closeDate + ", name=" + name
				+ ", leadSource=" + leadSource + ", owner=" + owner + "]";
	}
	
	

}
