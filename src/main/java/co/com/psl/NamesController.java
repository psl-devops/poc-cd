package co.com.psl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NamesController {
    @RequestMapping("/team4")
    public String index() {
        String ans = "<marquee>Felipe Macias Herrera</marquee><br>";
        ans += "<marquee direction=\"up\">Juan Jose Suarez</marquee><br>";
        ans += "<marquee>Juan Manuel Ciro</marquee><br>";
        return ans;
    }
}


