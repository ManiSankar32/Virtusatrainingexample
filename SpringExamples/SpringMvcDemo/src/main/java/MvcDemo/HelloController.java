package MvcDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class HelloController {
   @RequestMapping("/ShowForm")
   public String ShowForm() {
	   return "HelloWorld";
   }
   
   @RequestMapping("/processForm")
   public String processForm() {
     
      return "Hello";
   }
}