package com.insurance.insuranceCompany.model;

public class Disease {
	private Long discId;
    private String discName;
    private String discIcdCode;
    private String discDesc;
    private String discStatus;
	public Long getDiscId() {
		return discId;
	}
	public void setDiscId(Long discId) {
		this.discId = discId;
	}
	public String getDiscName() {
		return discName;
	}
	public void setDiscName(String discName) {
		this.discName = discName;
	}
	public String getDiscIcdCode() {
		return discIcdCode;
	}
	public void setDiscIcdCode(String discIcdCode) {
		this.discIcdCode = discIcdCode;
	}
	public String getDiscDesc() {
		return discDesc;
	}
	public void setDiscDesc(String discDesc) {
		this.discDesc = discDesc;
	}
	public String getDiscStatus() {
		return discStatus;
	}
	public void setDiscStatus(String discStatus) {
		this.discStatus = discStatus;
	}
	@Override
	public String toString() {
		return "Disease [discId=" + discId + ", discName=" + discName + ", discIcdCode=" + discIcdCode + ", discDesc="
				+ discDesc + ", discStatus=" + discStatus + "]";
	}

    
    

}
