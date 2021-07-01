package com.virtusa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.app.entity.CrimeReport;

@Repository
public interface CrimeReportRepository extends JpaRepository<CrimeReport, String> {
	public CrimeReport findByCrimeno(String no);

}
