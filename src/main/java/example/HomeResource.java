package example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return ("<h1>welcom.</h1>");
    }

    @GetMapping("/user")
    public String uesr(){
        return ("<h1>welcom User</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>welcom Admin</h1>");
    }
}
