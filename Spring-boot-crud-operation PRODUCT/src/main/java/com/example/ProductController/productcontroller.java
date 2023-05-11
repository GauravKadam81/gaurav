package com.example.ProductController;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ProductService.productservice;
import com.example.ProductDomain.product;

@Controller
@RequestMapping("/product")
public class productcontroller {
	@Autowired
    private productservice userService;

    @GetMapping("/product")
    public String product() {
    	  return "form";
    }
    @PostMapping("/product")
    public String product(@ModelAttribute("user") product user) {
    	
    	product oauthUser= userService.product(user.getFruit(), user.getcategory());
    	
    	System.out.print(oauthUser);
    	if(Objects.nonNull(oauthUser))
    	{
    		return "redirect:/";
    		
    	} else {
    		return "redirect:/product";
    		
    	}
    	
    }
    @RequestMapping(value= {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
 	   return "redirect:/login";
 	}

}
