package com.CrimeManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.CrimeManagement.repository.Crime;
import com.CrimeManagement.repository.CrimeDao;



@RequestMapping("/Crime")
@Controller
public class CrimeController {
   
	@Autowired
	CrimeDao dao;
	
	@RequestMapping("/")    
    public String showform(Model m){    
         
        return "register";   
    }    
	
	@RequestMapping(value="/Save",method=RequestMethod.POST)  
	public String Save(@ModelAttribute("Crime") Crime crime )  
	{  
	   dao.Save(crime);  
	    return "viewCrime";  
	}  
	
	@RequestMapping("/viewCrime")    
    public String viewemp(Model m){    
        List<Crime> list=dao.getCrimes();    
        m.addAttribute("list",list);  
        return "viewCrime";    
    }  
	


   
    

}

