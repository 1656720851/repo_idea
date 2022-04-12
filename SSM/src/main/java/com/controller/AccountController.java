package com.controller;

import com.bean.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2022/3/10 - 下午 6:09
 * mvc
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        /*
        //创建一个数组
        ArrayList<Account> list = new ArrayList<>();
        //创建两个账户  为浏览器展示
        Account account = new Account();
        account.setId(1);
        account.setName("张三");
        account.setMoney(2000d);

        Account account2 = new Account();
        account2.setId(2);
        account2.setName("李四");
        account2.setMoney(4000d);

        list.add(account);
        list.add(account2);
        */
        //连接数据库了
        List<Account> list = accountService.findAll();

        //模型给浏览器   第一个数据是list.jsp的
        model.addAttribute("list", list);

        return "list";
    }

    //添加
    @RequestMapping("/save")
    public String save(Account account) {
        accountService.save(account);
        return "redirect:/findAll";
    }

    //查询账户id
    @RequestMapping("/findById")
    public String findById(Integer id, Model model) {
        //展示模型
        Account account = accountService.findById(id);
        model.addAttribute("account", account);
        return "update";
    }

    //修改账户
    @RequestMapping("/update")
    public String update(Account account) {
        accountService.update(account);
        return "redirect:/findAll";
    }

    //删除账号
    @RequestMapping("/deleteBatch")
    public String deleteBatch(Integer[] ids) {
        accountService.deleteBatch(ids);
        return "redirect:/findAll";
    }
}
