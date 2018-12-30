package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ua.lviv.lgs.task1.Auto;
import ua.lviv.lgs.task2.WrongInputConsoleParametersException;
/** 
 * The {@code String} class represents string
 * @author Mykola Pavliv
 * @since JDK 1.8
 * @version 1.0
 */
public class Application {

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Seasons season = null;
		Monthes monthes = null;
		int days = 0;

		System.out.println("������ ����� �����");
	
		/** input string month from emun monthes */
		Scanner sc = new Scanner(System.in);
		String month = sc.next().toUpperCase();
		
		/** cheking if the input month is write */
		List<Monthes> monthList = new ArrayList<Monthes>();
		List monthNameList = new ArrayList();
		List seasonList = new ArrayList();
		
		for (Seasons s : Seasons.values()) {
			seasonList.add(s);
		} 
		for (Monthes ma : Monthes.values()) {
			monthList.add(ma);
		} 
		for (Monthes ma : Monthes.values()) {
			monthNameList.add(ma.name());
		} 
		
		
              
    
		

		boolean flag = false;
		int index = monthNameList.indexOf(month);
		if (index<0) {
			String message = "������ ����� ����";
			throw new WrongInputConsoleParametersException(message);
		}  else {
			System.out.println("����� ����� ����");
			flag = true;
			monthes = monthList.get(index);
			season = monthes.season;
			days = monthes.days;
		}
		
		/** select the monthes from enum Monthes with season equals season.name() */
		
		System.out.println("̳���� � ����� ���� " + season.name());
		for (int i=0; i<monthList.size(); i++){
			if (monthList.get(i).season==season) {
				System.out.println(monthList.get(i).name());
			}
		}
		
		
		/** select the monthes from enum Monthes with days equals days */
		System.out.println("̳���� � ��������� ������� ��� " + days);
		for (int i=0; i<monthList.size(); i++){
			if (monthList.get(i).days==days) {
				System.out.println(monthList.get(i).name());
			}
		}

		
		/** select the monthes from enum Monthes with days less then days */
		System.out.println("̳���� � ������ ������� ��� " + days);
		for (int i=0; i<monthList.size(); i++){
			if (monthList.get(i).days < days) {
				System.out.println(monthList.get(i).name());
			}
		}

	
		/** select the monthes from enum Monthes with days greater than days */
		System.out.println("̳���� � ������ ������ ��� " + days);
		for (int i=0; i<monthList.size(); i++){
			if (monthList.get(i).days > days) {
				System.out.println(monthList.get(i).name());
			}
		}

		

		/** select the next season */
		int ordinal = 1 + season.ordinal();
		if (ordinal == seasonList.size()) {
			ordinal = 0;
		}
		;
		System.out.println("�������� ���� ���� " + seasonList.get(ordinal));
		
		
		/** select the previous season */
		ordinal = season.ordinal() - 1;
		if (ordinal < 0) {
			ordinal = seasonList.size() - 1;
		};		
		System.out.println("��������� ���� ���� " + seasonList.get(ordinal));
		System.out.println("̳���� � ������ ������� ��� ");
		for (int i=0; i<monthList.size(); i++) {
			if (monthList.get(i).days % 2 == 0) {
				System.out.println(monthList.get(i).name());
			}
		}
		
		/** select the monthes with the pair days */
		System.out.println("̳���� � �������� ������� ��� ");
		for (int i=0; i<monthList.size(); i++) {
			if (monthList.get(i).days % 2 == 1) {
				System.out.println(monthList.get(i).name());
			}
		}
		
		/** check the days in the month is pair or not */
		System.out.println((days % 2 == 0) ? "�������� ����� �� ����� ������� ���"
				: "�������� ����� �� ������� ������� ���");

	}

}
