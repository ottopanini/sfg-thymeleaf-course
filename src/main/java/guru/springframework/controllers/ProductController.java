package guru.springframework.controllers;

import guru.springframework.domain.Product;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping("/product")
    public String getProduct(){
        return "redirect:/index";
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public String getProductById(@PathVariable int id, Model model) {
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);
        return "product";
    }
}
