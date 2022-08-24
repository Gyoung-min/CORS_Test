package test.cors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GettingController {

    @GetMapping("hello")
    public String hell(){
        return "안녕하세요";
    }
}
