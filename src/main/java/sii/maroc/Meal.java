package sii.maroc;

public class Meal {

	private Ticket ticket;
	Meal(Ticket ticket){
		this.ticket=ticket;
	}
	public int servedDishes() {
		int dishes=0;

		for (String order:ticket.orderLine) {
			dishes+=Integer.parseInt(order.split(" ")[0]);
		}
		return dishes;
	}

	public int cookingDuration() {
		int duration=0;
		for (String order:ticket.orderLine) {
			int dishes=Integer.parseInt(order.split(" ")[0]);
			int initDuration=0;

			if(order.split(" ")[1].equals("Tomato")){
				 initDuration=6;

			}else if(order.split(" ")[1].equals("Pizza")){
				initDuration=10;

			}
			duration+=initDuration;
			if(dishes>1){
				for(int i=1;i<dishes;i++){
					duration+=initDuration/2;
				}
			}
		}
		return duration;
	}

}
