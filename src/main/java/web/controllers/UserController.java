package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.model.User;
import web.services.UserService;
import web.services.UserServiceImpl;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String allUsers(Model model){
        model.addAttribute("users", userService.allUsers());
        return "users";
    }

    @RequestMapping(value = "/title", method = RequestMethod.GET)
    public ModelAndView titlePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("title");
        return modelAndView;
    };

}
