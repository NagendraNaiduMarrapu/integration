package com.insurance.insuranceCompany.model;

public class InsurancePackages {
	
	private Long inspId;
    private String inspTitle;
    private String inspDesc;
    private String inspStatus;
    private Double inspRangeStart;
    private Double inspRangeEnd;
    private Integer inspAgeLimitStart;
    private Integer inspAgeLimitEnd;
	public Long getInspId() {
		return inspId;
	}
	public void setInspId(Long inspId) {
		this.inspId = inspId;
	}
	public String getInspTitle() {
		return inspTitle;
	}
	public void setInspTitle(String inspTitle) {
		this.inspTitle = inspTitle;
	}
	public String getInspDesc() {
		return inspDesc;
	}
	public void setInspDesc(String inspDesc) {
		this.inspDesc = inspDesc;
	}
	public String getInspStatus() {
		return inspStatus;
	}
	public void setInspStatus(String inspStatus) {
		this.inspStatus = inspStatus;
	}
	public Double getInspRangeStart() {
		return inspRangeStart;
	}
	public void setInspRangeStart(Double inspRangeStart) {
		this.inspRangeStart = inspRangeStart;
	}
	public Double getInspRangeEnd() {
		return inspRangeEnd;
	}
	public void setInspRangeEnd(Double inspRangeEnd) {
		this.inspRangeEnd = inspRangeEnd;
	}
	public Integer getInspAgeLimitStart() {
		return inspAgeLimitStart;
	}
	public void setInspAgeLimitStart(Integer inspAgeLimitStart) {
		this.inspAgeLimitStart = inspAgeLimitStart;
	}
	public Integer getInspAgeLimitEnd() {
		return inspAgeLimitEnd;
	}
	public void setInspAgeLimitEnd(Integer inspAgeLimitEnd) {
		this.inspAgeLimitEnd = inspAgeLimitEnd;
	}
	@Override
	public String toString() {
		return "InsurancePackages [inspId=" + inspId + ", inspTitle=" + inspTitle + ", inspDesc=" + inspDesc
				+ ", inspStatus=" + inspStatus + ", inspRangeStart=" + inspRangeStart + ", inspRangeEnd=" + inspRangeEnd
				+ ", inspAgeLimitStart=" + inspAgeLimitStart + ", inspAgeLimitEnd=" + inspAgeLimitEnd + "]";
	}
    
    

}
