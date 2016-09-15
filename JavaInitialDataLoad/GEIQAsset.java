package geiq.ciat.aviation.mx;

import java.math.BigDecimal;
import java.util.Date;

public class GEIQAsset {
	private Integer id;
	private Integer type;
	private Integer statusId;
	private Date lastUpdatedStatusAt;
	private Date startDate;
	private Date endDate;
	private Integer contractLength;
	private Integer currentMonth;
	private Integer lessor;
	private Integer costCenter;	
	private BigDecimal initialCost;
	private BigDecimal residualCost;
	private BigDecimal periodicalPayment; 
	private Integer currency;
	private Integer paymentFrecuency; 
	private Integer fixedAssetOrExpense;
	private Integer amendmentNumber;
	private String attachedAmendment;
	private String asstPicture;
	private Integer location;
	private String otherLocation;
	private Integer category;
	private Integer brand;
	private Integer model;
	private String mainAssetDescription;
	private Integer mainAssetSerialNumber;
	private Integer hasChildAssets;
	private Integer childAssetId;
	private String workflowURL;
	private Integer futurePlans;
	private Integer qrTagId;
	private Date returnedDate;
	private String returnedProof;
	private Date createdDate;
	private Date updatedDate;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Date getLastUpdatedStatusAt() {
		return lastUpdatedStatusAt;
	}
	public void setLastUpdatedStatusAt(Date lastUpdatedStatusAt) {
		this.lastUpdatedStatusAt = lastUpdatedStatusAt;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getContractLength() {
		return contractLength;
	}
	public void setContractLength(Integer contractLength) {
		this.contractLength = contractLength;
	}
	public Integer getCurrentMonth() {
		return currentMonth;
	}
	public void setCurrentMonth(Integer currentMonth) {
		this.currentMonth = currentMonth;
	}
	public Integer getLessor() {
		return lessor;
	}
	public void setLessor(Integer lessor) {
		this.lessor = lessor;
	}
	public Integer getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(Integer costCenter) {
		this.costCenter = costCenter;
	}
	public BigDecimal getInitialCost() {
		return initialCost;
	}
	public void setInitialCost(BigDecimal initialCost) {
		this.initialCost = initialCost;
	}
	public BigDecimal getResidualCost() {
		return residualCost;
	}
	public void setResidualCost(BigDecimal residualCost) {
		this.residualCost = residualCost;
	}
	public BigDecimal getPeriodicalPayment() {
		return periodicalPayment;
	}
	public void setPeriodicalPayment(BigDecimal periodicalPayment) {
		this.periodicalPayment = periodicalPayment;
	}
	public Integer getCurrency() {
		return currency;
	}
	public void setCurrency(Integer currency) {
		this.currency = currency;
	}
	public Integer getPaymentFrecuency() {
		return paymentFrecuency;
	}
	public void setPaymentFrecuency(Integer paymentFrecuency) {
		this.paymentFrecuency = paymentFrecuency;
	}
	public Integer getFixedAssetOrExpense() {
		return fixedAssetOrExpense;
	}
	public void setFixedAssetOrExpense(Integer fixedAssetOrExpense) {
		this.fixedAssetOrExpense = fixedAssetOrExpense;
	}
	public Integer getAmendmentNumber() {
		return amendmentNumber;
	}
	public void setAmendmentNumber(Integer amendmentNumber) {
		this.amendmentNumber = amendmentNumber;
	}
	public String getAttachedAmendment() {
		return attachedAmendment;
	}
	public void setAttachedAmendment(String attachedAmendment) {
		this.attachedAmendment = attachedAmendment;
	}
	public String getAsstPicture() {
		return asstPicture;
	}
	public void setAsstPicture(String asstPicture) {
		this.asstPicture = asstPicture;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public String getOtherLocation() {
		return otherLocation;
	}
	public void setOtherLocation(String otherLocation) {
		this.otherLocation = otherLocation;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Integer getBrand() {
		return brand;
	}
	public void setBrand(Integer brand) {
		this.brand = brand;
	}
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}
	public String getMainAssetDescription() {
		return mainAssetDescription;
	}
	public void setMainAssetDescription(String mainAssetDescription) {
		this.mainAssetDescription = mainAssetDescription;
	}
	public Integer getMainAssetSerialNumber() {
		return mainAssetSerialNumber;
	}
	public void setMainAssetSerialNumber(Integer mainAssetSerialNumber) {
		this.mainAssetSerialNumber = mainAssetSerialNumber;
	}
	public Integer getHasChildAssets() {
		return hasChildAssets;
	}
	public void setHasChildAssets(Integer hasChildAssets) {
		this.hasChildAssets = hasChildAssets;
	}
	public Integer getChildAssetId() {
		return childAssetId;
	}
	public void setChildAssetId(Integer childAssetId) {
		this.childAssetId = childAssetId;
	}
	public String getWorkflowURL() {
		return workflowURL;
	}
	public void setWorkflowURL(String workflowURL) {
		this.workflowURL = workflowURL;
	}
	public Integer getFuturePlans() {
		return futurePlans;
	}
	public void setFuturePlans(Integer futurePlans) {
		this.futurePlans = futurePlans;
	}
	public Integer getQrTagId() {
		return qrTagId;
	}
	public void setQrTagId(Integer qrTagId) {
		this.qrTagId = qrTagId;
	}
	public Date getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}
	public String getReturnedProof() {
		return returnedProof;
	}
	public void setReturnedProof(String returnedProof) {
		this.returnedProof = returnedProof;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
