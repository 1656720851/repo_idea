package com.service;

import com.bean.Account;

import java.util.List;

/**
 * @Date 2022/3/10 - 下午 4:27
 *      spring测试
 */

public interface AccountService {

    //查询
    public List<Account> findAll();

    //添加
    public void save(Account account);

    //查询账户id
    public Account findById(Integer id);

    //修改账户
    public void update(Account account);

    //删除账号
    public void deleteBatch(Integer[] ids);
}
