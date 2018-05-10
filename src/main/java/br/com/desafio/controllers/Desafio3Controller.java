
package br.com.desafio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Desafio3Controller
{
  
   @RequestMapping("/desafio/desafio3")
   public String graficos()
   {
      return "home/graficos";
   }
      
}
