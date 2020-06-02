package controller;

import java.util.Scanner;

import action.Action;

public class MemberController {
	public void processRequest(Scanner sc, Action action) {
		//예외처리
		try {
			action.excute(sc); //발생지점
		} catch (Exception e) {
			e.printStackTrace(); //처리지점
		}
	}
}
