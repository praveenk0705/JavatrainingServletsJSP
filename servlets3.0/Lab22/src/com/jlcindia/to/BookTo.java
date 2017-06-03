package com.jlcindia.to;

public class BookTo {
private int bid;
private String bname;
private String author;
private double cost;
private String cat;
private String pub;
private String isbn;

public BookTo(){}
public BookTo(int bid, String bname, String author, double cost, String cat,
		String pub, String isbn) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.author = author;
	this.cost = cost;
	this.cat = cat;
	this.pub = pub;
	this.isbn = isbn;
}

public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public String getCat() {
	return cat;
}
public void setCat(String cat) {
	this.cat = cat;
}
public String getPub() {
	return pub;
}
public void setPub(String pub) {
	this.pub = pub;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}

}
