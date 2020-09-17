package edu.iet.springMvcDemo.bean;

public class Product {
	private final int prodId;
	private String prodName;
	private String company;
	private String url;
	private double price;
	private static int count=1000;
	public Product(){
		super();
		this.prodId = count++;
	}
	public Product(String prodName, String company, String url, double price) {
		super();
		this.prodId = count++;
		this.prodName = prodName;
		this.company = company;
		this.url = url;
		this.price = price;
	}
	public Product(int prodId, String prodName, String company, String url, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.company = company;
		this.url = url;
		this.price = price;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", company=" + company + ", url=" + url
				+ ", price=" + price + "]";
	}
	
}
