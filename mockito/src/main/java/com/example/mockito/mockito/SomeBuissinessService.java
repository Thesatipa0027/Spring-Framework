package com.example.mockito.mockito;

public class SomeBuissinessService {
	
	public DataService dataService;
	
	public SomeBuissinessService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findTheGreatestAmongAll() {
		int[] retrieve = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for(int i:retrieve) {
			if(i>greatest)
				greatest=i;
		}
		return greatest;
	}
}

