package com.Virtusa.app.Controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Virtusa.app.Repositories.Crimedto;
import com.Virtusa.app.Repositories.Crimes;
import com.Virtusa.app.Service.CrimeService;




@Controller
public class CrimeController {

	@Autowired
	private CrimeService service;

	@GetMapping("/register")
	public String showHome(@ModelAttribute("Crimes") Crimedto Crimes, ModelMap map) {
		return "ViewCrimes";
	}

	@PostMapping("/placeCrime")
	public String placeCrime(@ModelAttribute("Crimes") Crimedto Crimes, ModelMap map) {
		Crimes c = new Crimes();
		String msg = null;
		msg = service.saveCrime(c);
		map.addAttribute("status", msg);
		return "ViewCrimes";
	}

	@GetMapping("/getCrimes")
	public String showCrimes(ModelMap map) {
		List<Crimes> listcrimes = service.getListOfCrimes();
		map.addAttribute("listcrimes", listcrimes);
		return "ViewCrimes";
	}

	@PutMapping("/updateCrime")
	public String updateCrime(@ModelAttribute("Crimes") Crimedto Crimes, ModelMap map) {
		Crimes c = new Crimes();
		String msg = null;
	//	BeanUtils.copyProperties(Crimes, c);
		msg = service.saveCrime(c);
		map.addAttribute("status", msg);
		return "ViewCrimes";
	}


   
    

}
