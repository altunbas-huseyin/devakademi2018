package com.DevAkademi.UserStatistic.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.DevAkademi.UserStatistic.allData.AllData;

/**
 * Find the user that has clicked the adds.
 * Get the users via List<User> getAllUser
 * @author mehmetozanguven
 *
 */

public class UsersClickAd {
	
	private Map<Long, User> userClickToAddMap;
	private List<User> getAllUser;
	
	public UsersClickAd() {
		userClickToAddMap =  new HashMap<>();
		getAllUser = new ArrayList<>();
	}
	
	public void findUserClickOnAdd(List<AllData> allDatas) {
		for (AllData eachData : allDatas) {
			if (eachData.getEvent_type().equals("CLICK")) {
				addUserToClickMap(eachData);
			}
		}
	}
	
	public void addUserToClickMap(AllData allData) {
		if (checkUserInList(allData.getViewer_user_id())) {
			User user = userClickToAddMap.get(allData.getViewer_user_id());
			user.addClickAddsItem(allData.getEvent_category());
		}
		else {
			User newUser = new User();
			newUser.setViewer_user_id(allData.getViewer_user_id());
			newUser.setViewer_birt_year(allData.getViewer_birt_year());
			newUser.setViewer_education(allData.getViewer_education());
			newUser.setViewer_gender(allData.getViewer_gender());
			newUser.setViewer_job(allData.getViewer_job());
			newUser.setViewer_gender(allData.getViewer_gender());
			newUser.setViewer_marital_status(allData.getViewer_marital_status());
			newUser.addClickAddsItem(allData.getEvent_category());
			userClickToAddMap.put(allData.getViewer_user_id(), newUser);
		}
	}
	
	
	public boolean checkUserInList(Long viewer_user_id) {
		if (userClickToAddMap.containsKey(viewer_user_id))
			return true;
		else
			return false;
	}

	public Map<Long, User> getUserClickToAddMap() {
		return userClickToAddMap;
	}

	public List<User> getGetAllUser() {
		Iterator it = userClickToAddMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        getAllUser.add((User)pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
		return getAllUser;
	}
	
	
	
}
