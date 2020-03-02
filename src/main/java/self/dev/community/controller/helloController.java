package self.dev.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.Map;

@Controller
public class helloController {

    @RequestMapping("/hello")
    //@ResponseBody
    public String hello( Map<String, Object> map){
        map.put("hello", "你好");
        return "hello";
    }
}
