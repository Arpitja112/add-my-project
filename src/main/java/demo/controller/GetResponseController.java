package demo.controller;

 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

 

@Controller
public class GetResponseController {
    
    // http://localhost:7676/getResponse
    
    @RequestMapping("/getResponse")
    @ResponseBody
    public String getResponse() {
        return "Response is here....";
    }
}
