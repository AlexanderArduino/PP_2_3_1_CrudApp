package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.model.User;

@Controller
public class UserController {

    private static User user;
    {
        user = new User();
        user.setId(1L);
        user.setName("Vasya");
        user.setSurname("Ivanov");
        user.setAge(30);
        user.setEmail("VasyaIvanov@mail.ru");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allUsers() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/title", method = RequestMethod.GET)
    public ModelAndView titlePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("title");
        return modelAndView;
    };

}
