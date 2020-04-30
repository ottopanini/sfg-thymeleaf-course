package guru.springframework.controllers;

import guru.springframework.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping("/product")
    public String getProduct(){
        return "redirect:/index";
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public String getProductById(@RequestParam int id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "product";
    }
}
