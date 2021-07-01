package com.virtusa.app.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.virtusa.app.dto.CrimeReportdto;
import com.virtusa.app.service.CrimeReportService;

@Controller
public class CrimeReportController {
	@Autowired(required = true)
	private CrimeReportService service;

	@GetMapping("/crhome")
	public String showHome(@ModelAttribute("creport") CrimeReportdto creport, ModelMap map) {
		return "crhome";
	}

	@PostMapping("/submitcrimereport")
	public String placeComplaint(@ModelAttribute("creport") CrimeReportdto creport, ModelMap map) {
		com.virtusa.app.entity.CrimeReport cr = new com.virtusa.app.entity.CrimeReport();
		String msg = null;
		BeanUtils.copyProperties(creport, cr);
		msg = service.saveCrimeReport(cr);
		map.addAttribute("status", msg);
		return "crhome";
	}
	@PutMapping("/updatecrimereport")
	public String updateCrimeReport(@ModelAttribute("creport") CrimeReportdto creport, ModelMap map) {
		com.virtusa.app.entity.CrimeReport cr = new com.virtusa.app.entity.CrimeReport();
		String msg = null;
		BeanUtils.copyProperties(creport, cr);
		msg = service.saveCrimeReport(cr);
		map.addAttribute("status", msg);
		return"crhome";
	}

}
