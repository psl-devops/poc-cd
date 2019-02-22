package co.com.psl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller3 {

    @RequestMapping("/3")
    public String index() {
        return "Manuela, Ronald, Andrés, Juan David";
    }
}