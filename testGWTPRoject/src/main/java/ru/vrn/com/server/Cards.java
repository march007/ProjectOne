package ru.vrn.com.server;


public class Cards {
	String path;
	String name_card;
	String color;
	short card_score;	
	
	public String getName_card() {
		return name_card;
	}

	public String getColor() {
		return color;
	}

	public void setName_card(String name_card) {
		this.name_card = name_card;
	}

	public void setColor(String color) {
		this.color = color;
	}


	short priority;
	
	public Cards(String name_card, String color, short card_score, short priority) {
		this.name_card = name_card;
		this.color = color;
		this.card_score = card_score;
		this.priority = priority;
		System.out.println("Card.Card()");
	}
	
	public Cards(String path, short card_score, short priority) {
		this.path =path;
		this.card_score = card_score;
		this.priority = priority;
	}

	public String getPath() {
		
		StringBuilder path = new StringBuilder();
		path.append(name_card);
		path.append(color);
		
		return path.toString();
	}

	public void setPath(String path) {
		this.path = path;
	}

	public short getCard_score() {
		return card_score;
	}

	public void setCard_score(short card_score) {
		this.card_score = card_score;
	}

	public short getPriority() {
		return priority;
	}

	public void setPriority(short priority) {
		this.priority = priority;
	}
	
	
}
