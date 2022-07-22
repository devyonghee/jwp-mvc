package next.controller;

import core.annotation.web.Controller;
import core.annotation.web.RequestMapping;
import core.mvc.view.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ForwardController {

    @RequestMapping("/users/form")
    public ModelAndView redirectUsersForm(HttpServletRequest req, HttpServletResponse resp) {
        return ModelAndView.from("/user/form.jsp");
    }

    @RequestMapping("/users/loginForm")
    public ModelAndView redirectLoginForm(HttpServletRequest req, HttpServletResponse resp) {
        return ModelAndView.from("/user/login.jsp");
    }
}