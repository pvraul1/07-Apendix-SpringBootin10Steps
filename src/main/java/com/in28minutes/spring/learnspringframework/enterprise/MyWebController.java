package com.in28minutes.spring.learnspringframework.enterprise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

	@Autowired
	private BusinessService businessService;

	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}

}

@Component
class BusinessService {
	@Autowired
	private DataService dataService;

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		
		Optional<Integer> value = data.stream().reduce(Integer::sum);
		if (value.isPresent()) {
			return value.get();
		}

		return 0l;
	}
}

@Component
class DataService {
	public List<Integer> getData() {
		return Arrays.asList(10, 20, 30, 40);
	}
}
