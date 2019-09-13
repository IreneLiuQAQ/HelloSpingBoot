package ink.irene.demo.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
public class Controller {
    @RequestMapping("/hello")
    public String hello() {
        return "Shui Qingyuan";
    }
}
