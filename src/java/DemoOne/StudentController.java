package DemoOne;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    public StudentController(){
        
    }
    
    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        
        //create new student object
        Student theStudent = new Student();
        
        //add student object to model
        theModel.addAttribute("student", theStudent);
        
        return "Student-form";
    }
    
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        
        //log the input data
        System.out.println("theStudent: "+ theStudent.getLastName()+" "+ theStudent.getFirstName());
        return "customer-confirmation";
    }
}
