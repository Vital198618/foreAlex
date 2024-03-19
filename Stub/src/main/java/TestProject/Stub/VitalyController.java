package TestProject.Stub;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

@RestController

public class VitalyController {

    @PostMapping("/hi")
    public String l1(@RequestBody String request) {
        String response;
        response = request;
        return response;
    }

    @PostMapping("/hi/1")
    public String l2(@RequestBody ansverJson ansverJson) {
        return ansverJson.sity;

    }
    @GetMapping("/hi/2")
    public String l(){
        return "Заглушка гет";
    }

}


