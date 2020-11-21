package DemoOne;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    
    //need contorller method to show the initial form
    
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    
    //need a controller method to process the form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
    
    @RequestMapping("/processFormTwo")
    public String letsShoutDude(@RequestParam("studentName") String theName, Model model){
         
        //convert the data to all uppercase
        theName = theName.toUpperCase();
        
        //create the message
        String result = "Hello "+theName;
        
        //add the message to the model
        model.addAttribute("message",result);
        
        return "helloworld";
    }
}
