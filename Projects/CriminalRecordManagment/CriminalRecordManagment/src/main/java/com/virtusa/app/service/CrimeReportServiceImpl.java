package com.virtusa.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.virtusa.app.entity.CrimeReport;
import com.virtusa.app.entity.User;
import com.virtusa.app.repository.CrimeReportRepository;
@Service
public class CrimeReportServiceImpl implements CrimeReportService {
	@Autowired(required = true)
	private CrimeReportRepository repository;

	@Override
	public String saveCrimeReport(com.virtusa.app.entity.CrimeReport creport) {
		com.virtusa.app.entity.CrimeReport creport1 = repository.save(creport);
		Optional cr = Optional.of(creport1);
		if (cr.isPresent()) {
			return "CrimeReport  successfully submited";
		} else {
			return "CrimeReport not successfully submited";
		}
	}

	@Override
	public List<com.virtusa.app.entity.CrimeReport> getListOfCrimeReport() {
		List<CrimeReport> userslist = new ArrayList<CrimeReport>();
		userslist = repository.findAll();
		return userslist;
	}

	@Override
	public Object getCrimeReportNo(String No) {
		CrimeReport cr = repository.findByCrimeno(No);
		Optional userdata = Optional.of(cr);
		if (userdata.isPresent()) {
			return cr;
		} else {
			return "no record existed";
		}
	}

	@Override
	public String updateCrimeReport(com.virtusa.app.entity.CrimeReport creport) {
		CrimeReport creport1 = repository.save(creport);
		Optional creport2 = Optional.of(creport1);
		if (creport2.isPresent()) {
			return "user data updated successfully";
		} else {
			return "user data not  updated successfully";
		}
		
	}

}
