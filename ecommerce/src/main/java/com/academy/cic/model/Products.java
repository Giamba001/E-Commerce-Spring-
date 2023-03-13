package com.academy.cic.model;
	
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import io.micrometer.core.lang.NonNull;

@Entity
public class Products {
	
	@Id
	@NonNull
	private String productcode;
	@NonNull
	private String productname;
	@NonNull
	private String productline;
	@NonNull
	private String productscale;
	@NonNull
	private String productvendor;
	@NonNull
	private String productdescription;
	@NonNull
	private String quantityinstock;
	@NonNull
	private BigDecimal buyprice;
	@NonNull
	private BigDecimal msrp;
	
	public Products() {
		
	}
	
	public Products(String productcode, String productname, String productline, String productscale,
			String productvendor, String productdescription, String quantityinstock, BigDecimal buyprice,
			BigDecimal msrp) {
		super();
		this.productcode = productcode;
		this.productname = productname;
		this.productline = productline;
		this.productscale = productscale;
		this.productvendor = productvendor;
		this.productdescription = productdescription;
		this.quantityinstock = quantityinstock;
		this.buyprice = buyprice;
		this.msrp = msrp;
	}
	
	public String getProductcode() {
		return productcode;
	}
	
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	
	public String getProductname() {
		return productname;
	}
	
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public String getProductline() {
		return productline;
	}
	
	public void setProductline(String productline) {
		this.productline = productline;
	}
	
	public String getProductscale() {
		return productscale;
	}
	
	public void setProductscale(String productscale) {
		this.productscale = productscale;
	}
	
	public String getProductvendor() {
		return productvendor;
	}
	
	public void setProductvendor(String productvendor) {
		this.productvendor = productvendor;
	}
	
	public String getProductdescription() {
		return productdescription;
	}
	
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	
	public String getQuantityinstock() {
		return quantityinstock;
	}
	
	public void setQuantityinstock(String quantityinstock) {
		this.quantityinstock = quantityinstock;
	}
	
	public BigDecimal getBuyprice() {
		return buyprice;
	}
	
	public void setBuyprice(BigDecimal buyprice) {
		this.buyprice = buyprice;
	}
	
	public BigDecimal getMsrp() {
		return msrp;
	}
	
	public void setMsrp(BigDecimal msrp) {
		this.msrp = msrp;
	}
	
	@Override
	public String toString() {
		return "Products [productcode=" + productcode + ", productname=" + productname + ", productline=" + productline
				+ ", productscale=" + productscale + ", productvendor=" + productvendor + ", productdescription="
				+ productdescription + ", quantityinstock=" + quantityinstock + ", buyprice=" + buyprice + ", msrp="
				+ msrp + "]";
	}
}

