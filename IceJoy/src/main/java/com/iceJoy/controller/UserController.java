package com.iceJoy.controller;

import com.iceJoy.dto.UserDto;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 18.04.2016.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getNameAndPassword(
        @RequestParam(value = "error", required = false) String error,
        @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", true);
            model.addObject("errorText", "Неверный логин или пароль");
        }
        model.setViewName("login");
        model.addObject("user", new UserDto());
        return model;
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView doProfile() {
        ModelAndView model = new ModelAndView();
        User springUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDto user = new UserDto();
        user.setName(springUser.getUsername());
        user.setRoles(springUser.getAuthorities());
        model.addObject("user", user);
        model.setViewName("profile");
        return model;
    }

}
