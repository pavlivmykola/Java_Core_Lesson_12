package ua.lviv.lgs.task1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Random random = new Random();
		String [] material = {"шкіра","алькантара"};
		int x = random.nextInt(10)+2;
		List<Auto> list = new ArrayList<Auto>();

		for (int i=0;i<x;i++) {
			list.add( new Auto(random.nextInt(100),random.nextInt(28)+1990, new Helm(random.nextInt(10)+20,material[random.nextInt(2)]), new Motor(random.nextInt(4)+4)));
			
		}

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,new Comparator<Auto>() {
			@Override
			public int compare(Auto a0, Auto a1) {
				return a1.getHoursePower()-a0.getHoursePower();
			}
		});
		System.out.println(list);

	}

}
