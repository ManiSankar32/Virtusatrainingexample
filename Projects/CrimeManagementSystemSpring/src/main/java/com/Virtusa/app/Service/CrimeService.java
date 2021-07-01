package com.Virtusa.app.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Virtusa.app.Repositories.CrimeRepository;
import com.Virtusa.app.Repositories.Crimes;


@Service
public class CrimeService {

	@Autowired
	private CrimeRepository repository;
	
	public String saveCrime(Crimes crm) {
		Crimes c = repository.save(crm);
		Optional opt = Optional.of(crm);
		if (opt.isPresent()) {
			return "Crime  successfully submited";
		} else {
			return "Crime  not successfully submited";
		}
	}

	public List<Crimes> getListOfCrimes() {
		List<Crimes> crimelist = new ArrayList<Crimes>();
		crimelist = repository.findAll();
		return crimelist;
	}
	


//public Object getCrimeNo(int No) {
//	Crimes com =  repository.findByCrimeid(No);
//	Optional optionalcomplaint = Optional.of(com);
//	if (optionalcomplaint.isPresent()) {
//		return com;
//	} else {
//		return "user data not found our records";
//	}
//}

public String updateComplaint(Crimes com) {
	Crimes comp1 = repository.save(com);
	Optional complaint1 = Optional.of(comp1);
	if (complaint1.isPresent()) {
		return "user data updated successfully";
	} else {
		return "user data not  updated successfully";
	}

}


}
