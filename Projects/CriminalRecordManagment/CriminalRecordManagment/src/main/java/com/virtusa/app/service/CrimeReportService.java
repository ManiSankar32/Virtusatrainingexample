package com.virtusa.app.service;

import java.util.List;

public interface CrimeReportService {
	public String saveCrimeReport(com.virtusa.app.entity.CrimeReport creport);

	public List<com.virtusa.app.entity.CrimeReport> getListOfCrimeReport();

	public Object getCrimeReportNo(String No);

	public String updateCrimeReport(com.virtusa.app.entity.CrimeReport creport);

}
