

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class helloControl {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello ,spring boot! welcome to  20190902 !";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(helloControl.class, args);
        //运行之后在浏览器中访问：http://localhost:8080/hello
    }

}
