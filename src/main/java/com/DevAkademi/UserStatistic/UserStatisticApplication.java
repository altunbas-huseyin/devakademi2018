package com.DevAkademi.UserStatistic;

import java.io.IOException;
import java.util.List;

import com.DevAkademi.UserStatistic.allData.ReadJsonFile;
import com.DevAkademi.UserStatistic.user.User;
import com.DevAkademi.UserStatistic.user.UsersClickAd;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class UserStatisticApplication {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// read json file
		ReadJsonFile r = new ReadJsonFile();
		// map to the class
		r.jsonMapper();

		UsersClickAd clickAd = new UsersClickAd();
		// find the user that has clicked the adds
		clickAd.findUserClickOnAdd(r.getAllDatas());
		
		PrintStatistic printStatistic = new PrintStatistic();
		// find the 10 users that has clicked the emlak add. (by ascending order)
		List<User> emlakUserList = printStatistic.getUserListThatClickEmlakCategoryMost(10, clickAd.getGetAllUser());
		// print the statistic about these user list (emlakUserList)
		 printStatistic.printGenderNumThatClickEmlakCategoryMost(emlakUserList);
		 printStatistic.printEducationTypeThatClickEmlakCategoryMost(emlakUserList);
		
		// find the 30 users which has marital status is Bekar
		List<User> userListWithMaritalStatusSingle = printStatistic.getUserListByMaritalStatus(30, clickAd.getGetAllUser(), "Bekar");
		// then among these list (userListWithMarialStatusSingle) find the 5 users that has clicked the emlak category (by ascending order)
		List<User> emlakUserListAmongMaritalStatusSingle = printStatistic.getUserListThatClickEmlakCategoryMost(5, userListWithMaritalStatusSingle);
		
		System.out.println(emlakUserListAmongMaritalStatusSingle);
		
		// then among these list (emlakUserListAmongMarialStatusSingle) find the percentage about each gender type 
		printStatistic.printGenderNumThatClickEmlakCategoryMost(emlakUserListAmongMaritalStatusSingle);
		
		
		
	}
}
