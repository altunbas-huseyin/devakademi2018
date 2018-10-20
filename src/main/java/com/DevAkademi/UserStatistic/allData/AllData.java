package com.DevAkademi.UserStatistic.allData;


public class AllData {
	
	
	private Long id;
	private Long viewer_user_id;
	private String viewer_education;
	private String viewer_job;
	private String viewer_marital_status;
	private String viewer_birt_year;
	private String viewer_gender;
	private Long ad_id;
	private String ad_title;
	private String ad_call_to_action;
	private String ad_description;
	private String ad_bid_price_kurus;
	private String ad_daily_budget_kurus;
	
	private String event_category;
	private String event_type;
	private String event_date;
	private String viewer_user_city;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		if (id != null)
			this.id = id;
	}
	public Long getViewer_user_id() {
		return viewer_user_id;
	}
	public void setViewer_user_id(Long viewer_user_id) {
		if(viewer_user_id != null)
			this.viewer_user_id = viewer_user_id;
	}
	public String getViewer_education() {
		return viewer_education;
	}
	public void setViewer_education(String viewer_education) {
		if (viewer_education != null)
			this.viewer_education = viewer_education;
	}
	public String getViewer_job() {
		return viewer_job;
	}
	public void setViewer_job(String viewer_job) {
		if (viewer_job != null)
			this.viewer_job = viewer_job;
	}
	public String getViewer_marital_status() {
		return viewer_marital_status;
	}
	public void setViewer_marital_status(String viewer_marital_status) {
		if (viewer_marital_status != null)
			this.viewer_marital_status = viewer_marital_status;
	}
	public String getViewer_birt_year() {
		return viewer_birt_year;
	}
	public void setViewer_birt_year(String viewer_birt_year) {
		if (viewer_birt_year != null)
			this.viewer_birt_year = viewer_birt_year;
	}
	public String getViewer_gender() {
		return viewer_gender;
	}
	public void setViewer_gender(String viewer_gender) {
		if (viewer_gender != null)
			this.viewer_gender = viewer_gender;
	}
	public Long getAd_id() {
		return ad_id;
	}
	public void setAd_id(Long ad_id) {
		if (ad_id != null)
			this.ad_id = ad_id;
	}
	public String getAd_title() {
		return ad_title;
	}
	public void setAd_title(String ad_title) {
		if (ad_title != null)
			this.ad_title = ad_title;
	}
	public String getAd_call_to_action() {
		return ad_call_to_action;
	}
	public void setAd_call_to_action(String ad_call_to_action) {
		if (ad_call_to_action != null)
			this.ad_call_to_action = ad_call_to_action;
	}
	public String getAd_description() {
		return ad_description;
	}
	public void setAd_description(String ad_description) {
		if (ad_description != null)
			this.ad_description = ad_description;
	}
	public String getAd_bid_price_kurus() {
		return ad_bid_price_kurus;
	}
	public void setAd_bid_price_kurus(String ad_bid_price_kurus) {
		if (ad_bid_price_kurus != null)
			this.ad_bid_price_kurus = ad_bid_price_kurus;
	}
	public String getAd_daily_budget_kurus() {
		return ad_daily_budget_kurus;
	}
	public void setAd_daily_budget_kurus(String ad_daily_budget_kurus) {
		if (ad_daily_budget_kurus != null)
			this.ad_daily_budget_kurus = ad_daily_budget_kurus;
		else {
			this.ad_daily_budget_kurus = "";
		}
	}
	public String getEvent_category() {
		return event_category;
	}
	public void setEvent_category(String event_category) {
		if (event_category != null)
			this.event_category = event_category;
		else
			this.event_category = "";
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		if (event_type != null)
			this.event_type = event_type;
		else {
			this.event_type = "";
		}
	}
	public String getEvent_date() {
		return event_date;
	}
	public void setEvent_date(String event_date) {
		if (event_date != null)
			this.event_date = event_date;
		else{
			this.event_date = "";
		}
	}
	public String getViewer_user_city() {
		return viewer_user_city;
	}
	public void setViewer_user_city(String viewer_user_city) {
		if (viewer_user_city != null)
			this.viewer_user_city = viewer_user_city;
		else {
			this.viewer_user_city = "";
		}
	}
	
	
	
}
