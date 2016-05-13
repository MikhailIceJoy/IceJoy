package com.iceJoy.controller;

import com.iceJoy.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by mikhail on 18.04.2016.
 */
@Controller
@RequestMapping (value = "/user")
public class UserController {

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public ModelAndView getNameAndPassword( UserDto userDto ) {
        return new ModelAndView("userProfile" , "user" , userDto );
    }

}
