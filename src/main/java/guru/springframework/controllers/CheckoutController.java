package guru.springframework.controllers;

import guru.springframework.commands.CheckoutCommand;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

public class CheckoutController {
    @RequestMapping("checkout")
    public String getCheckout() {
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
