package br.com.stockquotemanager.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stockquotemanager.entities.StockQuoteManagerEntity;

@Repository
public interface StockQuoteManagerRepository extends JpaRepository<StockQuoteManagerEntity, String> {

	public List<StockQuoteManagerEntity> getAllQuotesById(String id); 
	 
}
