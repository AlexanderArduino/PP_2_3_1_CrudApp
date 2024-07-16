package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.services.UserService;

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

    //При переходе на страницу отображаем форму для ввода данных. Модель user
    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "newuser";
    }

    //Отправляем ПОСТ запрос для модели user, добавляем в базу данных через сервис,
    //производим переход на страницу users(редирект вызывает контроллер
    @PostMapping
    public String create(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:users";
    }



//    @GetMapping("/{id}")
//    public String editUserView(@RequestParam("id") Long id,
//                           Model model){
//        model.addAttribute("user", userService.getById(id));
//        return "user";
//    }

    @GetMapping("/user")
    public String editUserView(@RequestParam("id") Long id, Model model) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "user";
    }


}
