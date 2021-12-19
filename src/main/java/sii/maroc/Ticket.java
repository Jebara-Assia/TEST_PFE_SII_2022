package sii.maroc;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	List<String> orderLine = new ArrayList<String>();
	public Ticket and(String string) {
		this.orderLine.add(string);
		return this;
	}

}