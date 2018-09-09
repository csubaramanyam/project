package com.gs.project.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "APP_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appId;

	@Column(name = "APP_NAME")
	private String appName;

	@Column(name = "APP_TYPE")
	private String appType;

	@Column(name = "APP_STATUS")
	private String appStatus;

	@Column(name = "APP_NUMBER")
	private String appNumber;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "COMMENTS")
	private String comments;

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getAppNumber() {
		return appNumber;
	}

	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Project [appId=" + appId + ", appName=" + appName + ", appType=" + appType + ", appStatus=" + appStatus
				+ ", appNumber=" + appNumber + ", startDate=" + startDate + ", endDate=" + endDate + ", comments="
				+ comments + "]";
	}

}
