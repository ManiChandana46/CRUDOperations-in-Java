package com.lti.model;

public class Product {

	private int index;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	private int price;
	private String imageURL;
	private String imageName;
	
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	
}
