package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/world.c")
    @ResponseBody
    public String world(){
        return "hello world!";
    }

    @RequestMapping("/china.c")
    public String china(){
        return "detail";
    }
}
