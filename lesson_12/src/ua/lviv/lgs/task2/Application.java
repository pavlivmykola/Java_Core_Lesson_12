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

		System.out.println("¬вед≥ть назву м≥с€ц€");
	
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
			String message = "“акого м≥с€ц€ немаЇ";
			throw new WrongInputConsoleParametersException(message);
		}  else {
			System.out.println("“акий м≥с€ць ≥снуЇ");
			flag = true;
			monthes = monthList.get(index);
			season = monthes.season;
			days = monthes.days;
		}
		
		/** select the monthes from enum Monthes with season equals season.name() */
		
		System.out.println("ћ≥с€ц≥ з порою року " + season.name());
		for (int i=0; i<monthList.size(); i++){
			if (monthList.get(i).season==season) {
				System.out.println(monthList.get(i).name());
			}
		}
		
		
		/** select the monthes from enum Monthes with days equals days */
		System.out.println("ћ≥с€ц≥ з однаковою к≥льк≥стю дн≥в " + days);
		for (int i=0; i<monthList.size(); i++){
			if (monthList.get(i).days==days) {
				System.out.println(monthList.get(i).name());
			}
		}

		
		/** select the monthes from enum Monthes with days less then days */
		System.out.println("ћ≥с€ц≥ з меншою к≥льк≥стю дн≥в " + days);
		for (int i=0; i<monthList.size(); i++){
			if (monthList.get(i).days < days) {
				System.out.println(monthList.get(i).name());
			}
		}

	
		/** select the monthes from enum Monthes with days greater than days */
		System.out.println("ћ≥с€ц≥ з меншою б≥льшою дн≥в " + days);
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
		System.out.println("Ќаступна пора року " + seasonList.get(ordinal));
		
		
		/** select the previous season */
		ordinal = season.ordinal() - 1;
		if (ordinal < 0) {
			ordinal = seasonList.size() - 1;
		};		
		System.out.println("ѕопередн€ пора року " + seasonList.get(ordinal));
		System.out.println("ћ≥с€ц≥ з парною к≥льк≥стю дн≥в ");
		for (int i=0; i<monthList.size(); i++) {
			if (monthList.get(i).days % 2 == 0) {
				System.out.println(monthList.get(i).name());
			}
		}
		
		/** select the monthes with the pair days */
		System.out.println("ћ≥с€ц≥ з непарною к≥льк≥стю дн≥в ");
		for (int i=0; i<monthList.size(); i++) {
			if (monthList.get(i).days % 2 == 1) {
				System.out.println(monthList.get(i).name());
			}
		}
		
		/** check the days in the month is pair or not */
		System.out.println((days % 2 == 0) ? "¬ведений м≥с€ць маЇ парну к≥льк≥сть дн≥в"
				: "¬ведений м≥с€ць маЇ непарну к≥льк≥сть дн≥в");

	}

}
