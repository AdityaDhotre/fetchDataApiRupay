package org.npci.edd.postDataToDB.postRupayData.model;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class McprBinDataDetails {

    @Id
    private String mcprBinDataDetailsId;
    private String binNo;
    private BigDecimal phyContactCardCummTotal;
    private BigDecimal phyContactCardIncrem;
    private BigDecimal phyContactLessCardTotal;
    private BigDecimal phyContactLessCardIncrem;
    private BigDecimal virtualCardCummTotal;
    private BigDecimal virtualCardIncrem;
    private BigDecimal ecommTxnOnusCount;
    private String ecommTxnOnusAmt;
    private BigDecimal dposContactCardCount;
    private String dposContactCardAmt;
    private BigDecimal dposClesscOnlRetOnusCount;
    private String dposClesscOnlRetOnusAmt;
    private BigDecimal dposClesscOnlTrsitOnusCount;
    private String dposClesscOnlTrsitOnusAmt;
    private BigDecimal dposClesscOfflRetOnusCount;
    private String dposClesscOfflRetOnusAmt;
    private BigDecimal dposClesscOfflTrsitOnusCount;
    private String dposClesscOfflTrsitOnusAmt;
    private BigDecimal domisticAtmCardPresentCount;
    private String domisticAtmCardPresentAmt;
    private BigDecimal totalCumulativeCards;
    private BigDecimal totalIncrementalCards;
    private String monthEnding;
    private String monthEndingInNum;
	public String getMcprBinDataDetailsId() {
		return mcprBinDataDetailsId;
	}
	public void setMcprBinDataDetailsId(String mcprBinDataDetailsId) {
		this.mcprBinDataDetailsId = mcprBinDataDetailsId;
	}
	public String getBinNo() {
		return binNo;
	}
	public void setBinNo(String binNo) {
		this.binNo = binNo;
	}
	public BigDecimal getPhyContactCardCummTotal() {
		return phyContactCardCummTotal;
	}
	public void setPhyContactCardCummTotal(BigDecimal phyContactCardCummTotal) {
		this.phyContactCardCummTotal = phyContactCardCummTotal;
	}
	public BigDecimal getPhyContactCardIncrem() {
		return phyContactCardIncrem;
	}
	public void setPhyContactCardIncrem(BigDecimal phyContactCardIncrem) {
		this.phyContactCardIncrem = phyContactCardIncrem;
	}
	public BigDecimal getPhyContactLessCardTotal() {
		return phyContactLessCardTotal;
	}
	public void setPhyContactLessCardTotal(BigDecimal phyContactLessCardTotal) {
		this.phyContactLessCardTotal = phyContactLessCardTotal;
	}
	public BigDecimal getPhyContactLessCardIncrem() {
		return phyContactLessCardIncrem;
	}
	public void setPhyContactLessCardIncrem(BigDecimal phyContactLessCardIncrem) {
		this.phyContactLessCardIncrem = phyContactLessCardIncrem;
	}
	public BigDecimal getVirtualCardCummTotal() {
		return virtualCardCummTotal;
	}
	public void setVirtualCardCummTotal(BigDecimal virtualCardCummTotal) {
		this.virtualCardCummTotal = virtualCardCummTotal;
	}
	public BigDecimal getVirtualCardIncrem() {
		return virtualCardIncrem;
	}
	public void setVirtualCardIncrem(BigDecimal virtualCardIncrem) {
		this.virtualCardIncrem = virtualCardIncrem;
	}
	public BigDecimal getEcommTxnOnusCount() {
		return ecommTxnOnusCount;
	}
	public void setEcommTxnOnusCount(BigDecimal ecommTxnOnusCount) {
		this.ecommTxnOnusCount = ecommTxnOnusCount;
	}
	public String getEcommTxnOnusAmt() {
		return ecommTxnOnusAmt;
	}
	public void setEcommTxnOnusAmt(String ecommTxnOnusAmt) {
		this.ecommTxnOnusAmt = ecommTxnOnusAmt;
	}
	public BigDecimal getDposContactCardCount() {
		return dposContactCardCount;
	}
	public void setDposContactCardCount(BigDecimal dposContactCardCount) {
		this.dposContactCardCount = dposContactCardCount;
	}
	public String getDposContactCardAmt() {
		return dposContactCardAmt;
	}
	public void setDposContactCardAmt(String dposContactCardAmt) {
		this.dposContactCardAmt = dposContactCardAmt;
	}
	public BigDecimal getDposClesscOnlRetOnusCount() {
		return dposClesscOnlRetOnusCount;
	}
	public void setDposClesscOnlRetOnusCount(BigDecimal dposClesscOnlRetOnusCount) {
		this.dposClesscOnlRetOnusCount = dposClesscOnlRetOnusCount;
	}
	public String getDposClesscOnlRetOnusAmt() {
		return dposClesscOnlRetOnusAmt;
	}
	public void setDposClesscOnlRetOnusAmt(String dposClesscOnlRetOnusAmt) {
		this.dposClesscOnlRetOnusAmt = dposClesscOnlRetOnusAmt;
	}
	public BigDecimal getDposClesscOnlTrsitOnusCount() {
		return dposClesscOnlTrsitOnusCount;
	}
	public void setDposClesscOnlTrsitOnusCount(BigDecimal dposClesscOnlTrsitOnusCount) {
		this.dposClesscOnlTrsitOnusCount = dposClesscOnlTrsitOnusCount;
	}
	public String getDposClesscOnlTrsitOnusAmt() {
		return dposClesscOnlTrsitOnusAmt;
	}
	public void setDposClesscOnlTrsitOnusAmt(String dposClesscOnlTrsitOnusAmt) {
		this.dposClesscOnlTrsitOnusAmt = dposClesscOnlTrsitOnusAmt;
	}
	public BigDecimal getDposClesscOfflRetOnusCount() {
		return dposClesscOfflRetOnusCount;
	}
	public void setDposClesscOfflRetOnusCount(BigDecimal dposClesscOfflRetOnusCount) {
		this.dposClesscOfflRetOnusCount = dposClesscOfflRetOnusCount;
	}
	public String getDposClesscOfflRetOnusAmt() {
		return dposClesscOfflRetOnusAmt;
	}
	public void setDposClesscOfflRetOnusAmt(String dposClesscOfflRetOnusAmt) {
		this.dposClesscOfflRetOnusAmt = dposClesscOfflRetOnusAmt;
	}
	public BigDecimal getDposClesscOfflTrsitOnusCount() {
		return dposClesscOfflTrsitOnusCount;
	}
	public void setDposClesscOfflTrsitOnusCount(BigDecimal dposClesscOfflTrsitOnusCount) {
		this.dposClesscOfflTrsitOnusCount = dposClesscOfflTrsitOnusCount;
	}
	public String getDposClesscOfflTrsitOnusAmt() {
		return dposClesscOfflTrsitOnusAmt;
	}
	public void setDposClesscOfflTrsitOnusAmt(String dposClesscOfflTrsitOnusAmt) {
		this.dposClesscOfflTrsitOnusAmt = dposClesscOfflTrsitOnusAmt;
	}
	public BigDecimal getDomisticAtmCardPresentCount() {
		return domisticAtmCardPresentCount;
	}
	public void setDomisticAtmCardPresentCount(BigDecimal domisticAtmCardPresentCount) {
		this.domisticAtmCardPresentCount = domisticAtmCardPresentCount;
	}
	public String getDomisticAtmCardPresentAmt() {
		return domisticAtmCardPresentAmt;
	}
	public void setDomisticAtmCardPresentAmt(String domisticAtmCardPresentAmt) {
		this.domisticAtmCardPresentAmt = domisticAtmCardPresentAmt;
	}
	public BigDecimal getTotalCumulativeCards() {
		return totalCumulativeCards;
	}
	public void setTotalCumulativeCards(BigDecimal totalCumulativeCards) {
		this.totalCumulativeCards = totalCumulativeCards;
	}
	public BigDecimal getTotalIncrementalCards() {
		return totalIncrementalCards;
	}
	public void setTotalIncrementalCards(BigDecimal totalIncrementalCards) {
		this.totalIncrementalCards = totalIncrementalCards;
	}
	public String getMonthEnding() {
		return monthEnding;
	}
	public void setMonthEnding(String monthEnding) {
		this.monthEnding = monthEnding;
	}
	public String getMonthEndingInNum() {
		return monthEndingInNum;
	}
	public void setMonthEndingInNum(String monthEndingInNum) {
		this.monthEndingInNum = monthEndingInNum;
	}
	public McprBinDataDetails(String mcprBinDataDetailsId, String binNo, BigDecimal phyContactCardCummTotal,
			BigDecimal phyContactCardIncrem, BigDecimal phyContactLessCardTotal, BigDecimal phyContactLessCardIncrem,
			BigDecimal virtualCardCummTotal, BigDecimal virtualCardIncrem, BigDecimal ecommTxnOnusCount,
			String ecommTxnOnusAmt, BigDecimal dposContactCardCount, String dposContactCardAmt,
			BigDecimal dposClesscOnlRetOnusCount, String dposClesscOnlRetOnusAmt,
			BigDecimal dposClesscOnlTrsitOnusCount, String dposClesscOnlTrsitOnusAmt,
			BigDecimal dposClesscOfflRetOnusCount, String dposClesscOfflRetOnusAmt,
			BigDecimal dposClesscOfflTrsitOnusCount, String dposClesscOfflTrsitOnusAmt,
			BigDecimal domisticAtmCardPresentCount, String domisticAtmCardPresentAmt, BigDecimal totalCumulativeCards,
			BigDecimal totalIncrementalCards, String monthEnding, String monthEndingInNum) {
		super();
		this.mcprBinDataDetailsId = mcprBinDataDetailsId;
		this.binNo = binNo;
		this.phyContactCardCummTotal = phyContactCardCummTotal;
		this.phyContactCardIncrem = phyContactCardIncrem;
		this.phyContactLessCardTotal = phyContactLessCardTotal;
		this.phyContactLessCardIncrem = phyContactLessCardIncrem;
		this.virtualCardCummTotal = virtualCardCummTotal;
		this.virtualCardIncrem = virtualCardIncrem;
		this.ecommTxnOnusCount = ecommTxnOnusCount;
		this.ecommTxnOnusAmt = ecommTxnOnusAmt;
		this.dposContactCardCount = dposContactCardCount;
		this.dposContactCardAmt = dposContactCardAmt;
		this.dposClesscOnlRetOnusCount = dposClesscOnlRetOnusCount;
		this.dposClesscOnlRetOnusAmt = dposClesscOnlRetOnusAmt;
		this.dposClesscOnlTrsitOnusCount = dposClesscOnlTrsitOnusCount;
		this.dposClesscOnlTrsitOnusAmt = dposClesscOnlTrsitOnusAmt;
		this.dposClesscOfflRetOnusCount = dposClesscOfflRetOnusCount;
		this.dposClesscOfflRetOnusAmt = dposClesscOfflRetOnusAmt;
		this.dposClesscOfflTrsitOnusCount = dposClesscOfflTrsitOnusCount;
		this.dposClesscOfflTrsitOnusAmt = dposClesscOfflTrsitOnusAmt;
		this.domisticAtmCardPresentCount = domisticAtmCardPresentCount;
		this.domisticAtmCardPresentAmt = domisticAtmCardPresentAmt;
		this.totalCumulativeCards = totalCumulativeCards;
		this.totalIncrementalCards = totalIncrementalCards;
		this.monthEnding = monthEnding;
		this.monthEndingInNum = monthEndingInNum;
	}
	public McprBinDataDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
