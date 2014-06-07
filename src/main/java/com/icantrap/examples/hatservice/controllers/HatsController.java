package com.icantrap.examples.hatservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HatsController {
  @RequestMapping(method = GET, value = "/")
  public String index() {
    return "index";
  }

  @RequestMapping(method = GET, value = "/private")
  public void private_() {
  }
}
