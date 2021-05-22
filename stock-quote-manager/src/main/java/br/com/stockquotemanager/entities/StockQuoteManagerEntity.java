package br.com.stockquotemanager.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class StockQuoteManagerEntity {
	
	@Id
	private String id;
	private String quote;
	private Date dateQuote;
	private int quoteValue;
	
	public StockQuoteManagerEntity() {
		super();
	}
	
	public StockQuoteManagerEntity(String id, String quote, Date dateQuote, int quoteValue) {
		super();
		this.id = id;
		this.quote = quote;
		this.dateQuote = dateQuote;
		this.quoteValue = quoteValue;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public Date getDateQuote() {
		return dateQuote;
	}
	public void setDateQuote(Date dateQuote) {
		this.dateQuote = dateQuote;
	}
	public int getQuoteValue() {
		return quoteValue;
	}
	public void setQuoteValue(int quoteValue) {
		this.quoteValue = quoteValue;
	}
	
	@Override
	public String toString() {
		return "{id : " + id + ", quotes : " + dateQuote + " : " +  quoteValue + "}";
	}
}
