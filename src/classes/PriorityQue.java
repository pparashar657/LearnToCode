package classes;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQue {

	public static void main(String[] args) {
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
//		
//		pq.add(10);
//		pq.add(2);
//		pq.add(31);
//		pq.add(14);
//		
//		System.out.println(pq.peek());
//		
//		pq.remove();
//		
//		System.out.println(pq.peek());
		
		
		PriorityQueue<Vehicle> pq = new PriorityQueue<Vehicle>(new Comparator<Vehicle>() {

			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				return (int) (o2.price - o1.price);
			}
		});
		
		Vehicle v1 = new Vehicle(10, "Black", 1);
		Vehicle v2 = new Vehicle(100, "Blue", 2);
		Vehicle v3 = new Vehicle(1, "Brown", 4);
		
		pq.add(v1);
		pq.add(v2);
		pq.add(v3);
		
		pq.peek().printVehicle();
		
		pq.remove();
		
		pq.peek().printVehicle();
		
		
		
	}

}
