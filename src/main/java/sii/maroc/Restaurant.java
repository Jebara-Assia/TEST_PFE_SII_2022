package sii.maroc;

public class Restaurant {
	private int mozarela;
	private int tomatos;
	private String oil;
	private String pepper;
	private int flour;
	private String salt;
	private String water;

	public Restaurant(String string, String string2, String string3, String string4) {
		mozarela=Integer.parseInt(string.split(" ")[0]);
		tomatos=Integer.parseInt(string2.split(" ")[0]);
		oil=string3.split(" ")[0];
		pepper=string4.split(" ")[0];
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		flour=Integer.parseInt(string.split(" ")[0].split("")[0])*1000;
		mozarela=Integer.parseInt(string4.split(" ")[0]);
		tomatos=Integer.parseInt(string2.split(" ")[0]);
		salt=string3;
		oil=string5;
		water=string6;
	}

	public Ticket order(String string) {
		Ticket ticket = new Ticket();
		ticket.orderLine.add(string);
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		Meal meal = new Meal(ticket);

		return meal;
	}


	
}

