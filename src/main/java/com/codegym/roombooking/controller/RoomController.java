package com.codegym.roombooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoomController {
    @GetMapping(value = "/")
    public ModelAndView getRooms(){
        ModelAndView modelAndView = new ModelAndView("rooms/list");
        return modelAndView;
    }
}
