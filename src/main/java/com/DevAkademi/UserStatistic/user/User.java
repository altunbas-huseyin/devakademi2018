package com.DevAkademi.UserStatistic.user;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;


public class User {
	
	private Long viewer_user_id;
	
	private String viewer_education;
	private String viewer_job;
	private String viewer_marital_status;
	private String viewer_birt_year;
	private String viewer_gender;
	private Map<String, Integer> clickAdds;
	
	public User() {
		clickAdds = new HashMap<>();
	}
	
	
	public void addClickAddsItem(String categority) {
		if (clickAdds.containsKey(categority)) {
			Integer currentClick = clickAdds.get(categority);
			currentClick++;
			clickAdds.put(categority, currentClick);
		}
		else {
			clickAdds.put(categority, 1);
		}
	}


	public Long getViewer_user_id() {
		return viewer_user_id;
	}


	public void setViewer_user_id(Long viewer_user_id) {
		if (viewer_user_id != null)
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
		if(viewer_birt_year != null)
			this.viewer_birt_year = viewer_birt_year;
	}


	public String getViewer_gender() {
		return viewer_gender;
	}


	public void setViewer_gender(String viewer_gender) {
		if(viewer_gender != null)
			this.viewer_gender = viewer_gender;
	}


	public Map<String, Integer> getClickAdds() {
		return clickAdds;
	}


	public void setClickAdds(Map<String, Integer> clickAdds) {
		this.clickAdds = clickAdds;
	}


	@Override
	public String toString() {
		return "\nUser [viewer_user_id=" + viewer_user_id + ", viewer_education=" + viewer_education + ", viewer_job="
				+ viewer_job + ", viewer_marital_status=" + viewer_marital_status + ", viewer_birt_year="
				+ viewer_birt_year + ", viewer_gender=" + viewer_gender + ", clickAdds=" + clickAdds + "]\n";
	}
	
	
	
	
	
	

}
