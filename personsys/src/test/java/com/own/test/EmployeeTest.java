package com.own.test;

import com.own.bean.EmployeeInf;
import com.own.bean.EmployeeInfExample;
import com.own.bean.UserInf;
import com.own.mapper.EmployeeInfMapper;
import com.own.mapper.UserInfMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeTest {

    @Autowired
    private EmployeeInfMapper mapper;

    @Autowired
    private UserInfMapper userInfmapper;

    @Test
    public void testSelect(){
        List<EmployeeInf> employeeInfs = mapper.selectAll();
        EmployeeInf employeeInf = employeeInfs.get(0);
        System.out.println(employeeInf);
    }

    @Test
    public void testcount(){
      /*  EmployeeInfExample example = new EmployeeInfExample();
        EmployeeInfExample.Criteria criteria = example.createCriteria();
        criteria.andSexIdEqualTo(2);
        long boynum = mapper.countByExample(example);
        System.out.println(boynum);*/

//      userInfmapper.updateByLoginname("penguin","999");
        List<UserInf> loginname = userInfmapper.selectByCondition("loginname", "%a%");
        for (UserInf userInf:loginname){
            System.out.println(userInf);
        }
    }




}
