package com.iceJoy.controller;

import com.iceJoy.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by mikhail on 10.04.2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public ModelAndView home () {
        return new ModelAndView("home" , "user" , new UserDto() );
    }

}
