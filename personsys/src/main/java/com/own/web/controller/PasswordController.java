package com.own.web.controller;

import com.own.bean.EmployeeInf;
import com.own.bean.UserInf;
import com.own.mapper.EmployeeInfMapper;
import com.own.mapper.UserInfMapper;
import com.own.web.utils.ShiroMD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Controller
public class PasswordController {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private UserInfMapper userInfMapper;

    @RequestMapping("/repassword")
    public String repasswordPage(){
        return "repasswordPage";
    }

    @RequestMapping("/findpassword")
    public String findpasswordPage(String loginname,Model model){
        model.addAttribute("loginname",loginname);
        return "findPwd";
    }

    @RequestMapping("/sendmail")
    public String sendMail(String loginname,String email,Model model){
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();


        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, "UTF-8");

        UserInf userInf = userInfMapper.selectByEmail(email);

        if (userInf == null){
            model.addAttribute("message","邮箱不正确，无法找回");
            return "repasswordPage";
        }

        try {
            //接收人
            mimeMessageHelper.setTo(email);
            //发送人
            mimeMessageHelper.setFrom("995385367@qq.com");

            mimeMessageHelper.setSubject("找回密码文件");

            mimeMessageHelper.setText("你正在执行找回密码操作，请点击连接<a href='http://127.0.0.1:8080/findpassword?loginname="+loginname+"'>");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
        model.addAttribute("message","请去邮箱找回密码");
        return "repasswordPage";
    }


    //重新设置密码
    @RequestMapping("/setpassword")
    public String setPassword(String loginname,String password,String repassword,Model model){
        if (!password.equals(repassword)){
            model.addAttribute("message","两次输入密码不一致");
            return "findPwd";
        }
        userInfMapper.updateByLoginname(loginname, ShiroMD5.getMd5(password,loginname));
        model.addAttribute("message","密码重置成功");
        return "findPwd";
    }
}
