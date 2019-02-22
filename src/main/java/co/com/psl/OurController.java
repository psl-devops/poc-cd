package co.com.psl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OurController {

    @RequestMapping("/2")
    public String index() {
        return "Hello nigas ;D";
    }

}
