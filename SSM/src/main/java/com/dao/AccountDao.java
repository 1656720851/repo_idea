package com.dao;

import com.bean.Account;

import java.util.List;

/**
 * @Date 2022/3/10 - 下午 2:17
 *      mybatis 测试
 */
public interface AccountDao {

    //获取Account全部
    public List<Account> findAll();

    //添加账户
    public void save(Account account);

    //查看账户id
    public Account findById(Integer id);

    //修改账户
    public void update(Account account);

    //删除账号
    public void deleteBatch(Integer[] ids);
}
