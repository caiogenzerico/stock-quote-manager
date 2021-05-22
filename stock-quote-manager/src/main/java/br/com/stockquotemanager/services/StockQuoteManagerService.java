package br.com.stockquotemanager.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stockquotemanager.entities.StockQuoteManagerEntity;
import br.com.stockquotemanager.repository.StockQuoteManagerRepository;

@Service
public class StockQuoteManagerService {

	@Autowired
	private StockQuoteManagerRepository StockQuoteRepository;
	
	
	public List<StockQuoteManagerEntity> getAllQuotes(){
		List<StockQuoteManagerEntity> stockQuote = new ArrayList<>();
		 StockQuoteRepository.findAll().forEach(stockQuote::add);
		 return stockQuote;
	}
	
	public Optional<StockQuoteManagerEntity> getId(String id) {
		return StockQuoteRepository.findById(id);
	}
	
	public void addQuote(StockQuoteManagerEntity stockEntity) {
		StockQuoteRepository.save(stockEntity);
	}

	public void updateQuote(StockQuoteManagerEntity stockEntity, String id) {
		StockQuoteRepository.save(stockEntity);
		
	}

	public void deleteQuote(String id) {
		StockQuoteRepository.deleteById(id);
	}


}
