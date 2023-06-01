package eu.codeacademy.mvc.eshop.controller;

import eu.codeacademy.mvc.eshop.dto.Product;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @GetMapping("/products/open")
    public String openCreateProductForm(Model model){

        model.addAttribute("product", new Product());
        return "product";
    }
    @PostMapping("/product/open")
    public String createProduct(Model model, Product product){
        return "product";
    }


}
