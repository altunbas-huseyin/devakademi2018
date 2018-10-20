package com.DevAkademi.UserStatistic.clickAddMost;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.DevAkademi.UserStatistic.user.User;
/**
 * Get the users which has clicked adds restrict with some fields
 * or get the users which has clicked specific adds type most.
 * E.g: by marial status
 * @author mehmetozanguven
 *
 */
public class UsersClickAddByField {
	
	public List<User> getUserListbyEmlakCategory(List<User> userList) {
		List<User> userClickEmlakCategoryMost = new ArrayList<>();
		Comparator<User> byEmlakCategory = (u1, u2) -> {
			int numberOfEmlakClickU1 = 0;
			int numberOfEmlakClickU2 = 0;
			if (u1.getClickAdds().containsKey("Emlak"))
				numberOfEmlakClickU1 = u1.getClickAdds().get("Emlak");
			if (u2.getClickAdds().containsKey("Emlak"))
				numberOfEmlakClickU2 = u2.getClickAdds().get("Emlak");
			return Integer.compare(numberOfEmlakClickU1, numberOfEmlakClickU2);
		};
		userList.stream().sorted(byEmlakCategory).forEach(u -> userClickEmlakCategoryMost.add(u));
		
		return userClickEmlakCategoryMost;
	}
	
	public List<User> getUserListbyMarialStatus(List<User> userList, String typeOfMarialStatus){
		List<User> userListByMarialStatus = new ArrayList<>();
		userListByMarialStatus =userList.stream().filter(
							(u) -> u.getViewer_marital_status().equals(typeOfMarialStatus)
							).collect(Collectors.toList());
		
		return userListByMarialStatus;
	}
	
	
}
