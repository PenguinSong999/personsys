package com.own.web.controller;


import com.github.pagehelper.PageInfo;
import com.own.bean.PageData;
import com.own.bean.StatusInf;
import com.own.bean.UserInf;
import com.own.mapper.StatusInfMapper;
import com.own.mapper.UserInfMapper;
import com.own.service.UserService;
import com.own.web.utils.ShiroMD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private UserInfMapper mapper;

    @Autowired
    private StatusInfMapper statusInfMapper;

    @RequestMapping(value = "/checkLoginname",produces = "html/text;charset=utf-8")
    @ResponseBody
    public String checkLoginname(String loginname){
        UserInf userInf = mapper.selectByloginname(loginname);
        if (userInf == null){
            return "登录名不存在";
        }
        return "";
    }

    @RequestMapping("/login")
    public String login(String loginname, String password, String user_input_verifyCode, HttpServletRequest request, Model model){
        if (!user_input_verifyCode.equalsIgnoreCase((String) request.getSession().getAttribute("checkcode"))){
           model.addAttribute("message","验证码错误") ;
           return "loginForm";
        }
        UserInf user = service.findUserByUsernameAndPassword(loginname, ShiroMD5.getMd5(password,loginname));
        if (user == null){
            model.addAttribute("message","用户名或密码不正确");
            return "loginForm";
        }
        request.getSession().setAttribute("user",user);
        return "index";
    }

    @RequestMapping("/exit")
    public String exit(HttpServletRequest request){
        request.getSession().invalidate();
        return "loginForm";
    }


    @RequestMapping("/registCode")
    public String registCode(){
        return "regist";
    }

    @RequestMapping("/register")
    public String register(UserInf userInf){
       userInf.setCreatedate(new Date());
       userInf.setPassword(ShiroMD5.getMd5(userInf.getPassword(),userInf.getLoginname()));
       mapper.insert(userInf);
       return "loginForm";
    }

    @RequestMapping(value = "/register/check_Register_loginname",produces = "html/text;charset=utf-8")
    @ResponseBody
    public String check_Register_loginname(String loginname){
        UserInf userInf = mapper.selectByloginname(loginname);
        if (userInf != null){
            return "登录名已存在";
        }
        return "";
    }

    @RequestMapping(value = "/check_Register_repassword",produces = "html/text;charset=utf-8")
    @ResponseBody
    public String check_Register_repassword(String password,String repassword){
        if (!repassword.equals(password)){
            return "两次密码不一致";
        }
        return "";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/user/list")
    public String list(){
        return "/user/list";
    }

    @RequestMapping("/user/listdata")
    @ResponseBody
    public PageData<UserInf> listData(Integer page, Integer limit,String type,String content){
        PageData<UserInf> pageData = new PageData<>();
        PageInfo<UserInf> pageInfo = null;
        if (content != null){
            pageInfo = service.findUserByCondition(page, limit, type, "%"+content+"%");
        }else {
            pageInfo = service.findUserByPage(page, limit);
        }
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }

    @RequestMapping("/user/toadd")
    public String addPage(){
       return "/user/add";
    }

    @RequestMapping("/user/add")
    public String addUser(UserInf userInf,Model model){
        userInf.setCreatedate(new Date());
        userInf.setPassword(ShiroMD5.getMd5(userInf.getPassword(),userInf.getLoginname()));
        mapper.insert(userInf);
        model.addAttribute("message","添加用户成功");
        return "user/add";
    }

    @RequestMapping("/user/deleteUser")
    public void deleteUser(Integer id){
        mapper.deleteByPrimaryKey(id);
    }

    @RequestMapping("/user/editUser")
    public String editUser(Integer id,Model model){
        UserInf userInf = mapper.selectByPrimaryKey(id);
        model.addAttribute("user",userInf);
        List<StatusInf> statusInfs = statusInfMapper.selectAll();
        model.addAttribute("status_list",statusInfs);
        return "/user/edit";
    }

    @RequestMapping("/user/update")
    public String updateUser(UserInf userInf,Model model){
        mapper.updateByPrimaryKey(userInf);
        model.addAttribute("message","编辑成功");
        UserInf user = mapper.selectByPrimaryKey(userInf.getId());
        model.addAttribute("user",user);
        return "/user/edit";
    }


//    //搜索查询
//    @RequestMapping("/user/querylist")
//    @ResponseBody
//    public PageData<UserInf> queryList(Integer page,Integer limit,String type,String content){
//        PageInfo<UserInf> pageInfo = service.findUserByCondition(page, limit, type, "%"+content+"%");
//        PageData<UserInf> pageData = new PageData<>();
//        pageData.setCount((int) pageInfo.getTotal());
//        pageData.setData(pageInfo.getList());
//        return pageData;
//    }


}
