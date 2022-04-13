package site.metacoding.project5.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/")
    public String list() {
        return "list";
    }
}
