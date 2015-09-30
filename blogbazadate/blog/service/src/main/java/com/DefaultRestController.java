package com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.*;

import javax.sound.midi.ControllerEventListener;

/**
 * Created with IntelliJ IDEA.
 * User: Raluca
 * Date: 10.09.2015
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DefaultRestController {

    @RequestMapping("/")
    public String handlesRequest(){
        return "index.jsp";
            }
}
