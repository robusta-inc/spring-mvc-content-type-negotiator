package com.robusta.app.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/brands")
public class SampleController {
    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody Shop sample(@PathVariable String name) {
        return new Shop(name);
    }

    public static class Shop {
        private final String name;

        public Shop(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
