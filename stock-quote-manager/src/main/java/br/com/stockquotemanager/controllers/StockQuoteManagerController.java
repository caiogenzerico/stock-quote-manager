package br.com.stockquotemanager.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.stockquotemanager.entities.StockQuoteManagerEntity;
import br.com.stockquotemanager.repository.StockQuoteManagerRepository;
import br.com.stockquotemanager.services.StockQuoteManagerService;

@RestController
public class StockQuoteManagerController {
	
	
	@Autowired
	private StockQuoteManagerService stockQuoteService;
	
	@RequestMapping("/stock")
	public List<StockQuoteManagerEntity> getAllQuotes(){
		return  stockQuoteService.getAllQuotes();
		}

	@RequestMapping("/stock/{id}")
	public Optional<StockQuoteManagerEntity> getId(@PathVariable String id) {
		return stockQuoteService.getId(id);
	}

	@RequestMapping(method=RequestMethod.POST , value="/stock")
	public void addQuote(@RequestBody StockQuoteManagerEntity stockEntity ) {
		stockQuoteService.addQuote(stockEntity);
	}

	@RequestMapping(method=RequestMethod.PUT , value="/stock/{id}")
	public void udpdateQuote(@RequestBody StockQuoteManagerEntity stockEntity, @PathVariable String id) {
		stockQuoteService.updateQuote(stockEntity, id);	
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/stock/{id}")
	public void deleteQuote(@PathVariable String id) {
		 stockQuoteService.deleteQuote(id);
	}
	
}
