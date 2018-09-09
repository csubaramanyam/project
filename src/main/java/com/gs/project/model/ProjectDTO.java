package com.gs.project.model;

import java.io.Serializable;
import java.util.Date;

public class ProjectDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer appId;
	private String appName;
	private String appType;
	private String appStatus;
	private String appNumber;
	private Date startDate;
	private Date endDate;
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
