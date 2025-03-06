package com.ohgiraffers.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/*")
public class ResolverController {
    @GetMapping("string")
    public String stringReturning(Model model) {
        model.addAttribute("forwardMessage", "문자열로 뷰 이름 반환함");
        return "result";
    }

    @GetMapping("string-redirect")
    public String stringRedirect(Model model) {
        model.addAttribute("message1", "문자열로 뷰 이름 반환하며 리다이렉트");
        return "redirect:/";
    }

    @GetMapping("modelandview")
    public ModelAndView modelAndViewTest(ModelAndView mv) {
        mv.addObject("forwardMessage","ModelAndView를 이용한 forward");
        mv.setViewName("result");

        return mv;
    }

    @GetMapping("modelandview-redirect")
    public ModelAndView modelAndViewRedirectTest(ModelAndView mv) {
        mv.addObject("message2","ModelAndView를 이용한 redirect");
        mv.setViewName("redirect:/");
        return mv;
    }

    @GetMapping("modelandview-redirect-attr")
    public ModelAndView modelAndViewRedirectFlashAttribute(ModelAndView mv,
                                                           RedirectAttributes rttr) {
        rttr.addFlashAttribute("flashMessage2","ModelAndView를 이용한 redirect attr");
        mv.setViewName("redirect:/");
        return mv;
    }
}
