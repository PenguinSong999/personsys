package com.own.web.controller;

import com.own.web.utils.CheckCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@Controller
public class CheckCodeController {

    @RequestMapping("/checkCode")
    public void checkCode(String num, HttpServletResponse response, HttpServletRequest request) throws IOException {
       char[] chars = {'1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m',
               'n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M',
               'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Random rd = new Random();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 5; i++){
            int index = rd.nextInt(63);
            str.append(chars[index]);
        }
        request.getSession().setAttribute("checkcode",str.toString());
        CheckCodeUtil.generateCode(str.toString(),response.getOutputStream());
    }
}
