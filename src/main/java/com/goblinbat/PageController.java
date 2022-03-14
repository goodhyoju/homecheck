package com.goblinbat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * packageName : com.goblinbat
 * fileName : PageController
 * author : Jang Hyo Ju
 * date : 2022/03/14
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/03/14 11:09 AM Jang Hyo Ju 최초 생성
 */

@Controller
public class PageController {

    @RequestMapping(value = { "/", "/index" }, method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
}
