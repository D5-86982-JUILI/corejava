package com.sunbeam.ques1;

public class Invoice {
	String pno;
	String pdesc;
	int quantityPurchased;
	double price;
	
	
	public Invoice() {

	}


	public Invoice(String pno, String pdesc, int quantityPurchased, double price) {
		this.pno = pno;
		this.pdesc = pdesc;
		this.quantityPurchased = quantityPurchased;
		this.price = price;
	}


	public String getPno() {
		return pno;
	}


	public void setPno(String pno) {
		this.pno = pno;
	}


	public String getPdesc() {
		return pdesc;
	}


	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}


	public int getQuantityPurchased() {
		return quantityPurchased;
	}


	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getInvoiceAmount() {
		return quantityPurchased*price;
	}
	
	
	

}
