package market;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WelcomeController {
    @RequestMapping(path="/")
    public ResponseEntity<String> Welcome() {
        return new ResponseEntity<String>("Welcome", HttpStatus.CREATED);
    }
}
