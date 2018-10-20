package com.DevAkademi.UserStatistic;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.DevAkademi.UserStatistic.clickAddMost.UsersClickAddByField;
import com.DevAkademi.UserStatistic.user.User;

public class PrintStatistic {
	private UsersClickAddByField usersClickAdMost;

	public PrintStatistic() {
		this.usersClickAdMost = new UsersClickAddByField();
	}

	public List<User> getUserListThatClickEmlakCategoryMost(int howManyPeople, List<User> userList) {
		List<User> emlakUserList = usersClickAdMost.getUserListbyEmlakCategory(userList);
		List<User> userListRestrictWithNumber = new ArrayList<>();

		int index = 0;

		ListIterator<User> reverseOrder = emlakUserList.listIterator(emlakUserList.size());
		while (reverseOrder.hasPrevious()) {
			if (index < howManyPeople) {
				userListRestrictWithNumber.add((User) reverseOrder.previous());
				index++;
			} else {
				break;
			}
		}
		return userListRestrictWithNumber;
	}

	public void printGenderNumThatClickEmlakCategoryMost(List<User> userList) {

		int maleNumber = 0, femaleNumber = 0, unknown = 0;

		for (User each : userList) {

			if (each.getViewer_gender().equals("E"))
				maleNumber++;
			else if (each.getViewer_gender().equals("K"))
				femaleNumber++;
			else
				unknown++;

		}
		int totalNumber = maleNumber + femaleNumber + unknown;
		System.out.println("Number of users which click the emlak category most has gender type E: " + maleNumber
				+ " and percentage is % " + ((maleNumber * 100) / totalNumber));
		System.out.println("Number of users which click the emlak category most has gender type K: " + femaleNumber
				+ " and percentage is % " + ((femaleNumber * 100) / totalNumber));
		System.out.println("Number of users which click the emlak category most has gender type unknown: " + unknown
				+ " and percentage is % " + ((unknown * 100) / totalNumber));
	}

	public void printEducationTypeThatClickEmlakCategoryMost(List<User> userList) {
		int lise = 0, universite = 0, yuksekLisans = 0, unknown = 0;

		for (User each : userList) {

			if (each.getViewer_education().equals("Lise"))
				lise++;
			else if (each.getViewer_education().equals("Yüksek Lisans / Doktora"))
				yuksekLisans++;
			else if (each.getViewer_education().equals("Üniversite"))
				universite++;
			else
				unknown++;
		}
		int totalNumber = lise + universite + yuksekLisans + unknown;

		System.out.println("Number of users which click the emlak category most has education type Lise: " + lise
				+ " and percentage is % " + ((lise * 100) / totalNumber));
		System.out.println("Number of users which click the emlak category most has education type Üniversite: "
				+ universite + " and percentage is % " + ((universite * 100) / totalNumber));
		System.out.println(
				"Number of users which click the emlak category most has education type Yüksek Lisans / Doktora: "
						+ lise + " and percentage is % " + ((yuksekLisans * 100) / totalNumber));
		System.out.println("Number of users which click the emlak category most has education type unknown: " + lise
				+ " and percentage is % " + ((unknown * 100) / totalNumber));
	}
	
	
	public List<User> getUserListByMaritalStatus(int howManyPeople, List<User> userList, String typeOfMarialStatus){
		int index = 0;
		List<User> userListbyMarialStatusRestrictWithNumber = new ArrayList<>();
		List<User> userListbyMarialStatus = usersClickAdMost.getUserListbyMarialStatus(userList, typeOfMarialStatus);
		
		for (User  each : userListbyMarialStatus) {
			if (index < howManyPeople) {
				userListbyMarialStatusRestrictWithNumber.add(each);
				index++;
			}
			else {
				break;
			}
		}
		return userListbyMarialStatusRestrictWithNumber;
	}
}
