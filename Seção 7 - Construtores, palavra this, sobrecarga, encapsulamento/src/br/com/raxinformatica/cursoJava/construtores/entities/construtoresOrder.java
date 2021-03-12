package br.com.raxinformatica.cursoJava.construtores.entities;

import java.util.Date;

public class construtoresOrder {
	
	private Date date;
	private construtoresEntities product;
	
	public construtoresOrder(Date date, construtoresEntities product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public construtoresEntities getProduct() {
		return product;
	}

	public void setProduct(construtoresEntities product) {
		this.product = product;
	}
	
	

}
