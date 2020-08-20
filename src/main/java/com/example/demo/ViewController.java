package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView view() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "村田　翔太朗");
        modelAndView.addObject("team", "紅のパンダ");
        modelAndView.addObject("birthday", "1月31日");
        modelAndView.addObject("hobby", "麻雀");
        modelAndView.setViewName("view");
        return modelAndView;
    }
}