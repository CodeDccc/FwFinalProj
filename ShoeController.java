package com.SpringFWProject.FWProject;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ShoeController {
	
	@GetMapping("/shoe")
    public String shoeForm(Model model){
        model.addAttribute("shoe", new Shoe());
        return "shoe";
    }

    @PostMapping("/shoe")
    public String shoeSubmit(@ModelAttribute Shoe shoe) {
        return "winner";
    }
}