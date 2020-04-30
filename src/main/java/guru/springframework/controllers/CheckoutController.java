package guru.springframework.controllers;

import guru.springframework.commands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CheckoutController {
    @RequestMapping("checkout")
    public String getCheckout(Model model) {
        model.addAttribute("checkoutCommand", new CheckoutCommand());
        return "checkoutform";
    }

    @RequestMapping(value="checkout", method = RequestMethod.POST)
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "checkoutform";
        }

        return "checkoutcomplete";
    }
}
