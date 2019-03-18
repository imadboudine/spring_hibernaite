package com.mkyong.stock.bo;

import com.mkyong.stock.model.Stock;

public interface StockBo {
	
	
	void String findByNom() ;
	
	void String findById() ;
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	Stock findByStockCode(String stockCode);

}
