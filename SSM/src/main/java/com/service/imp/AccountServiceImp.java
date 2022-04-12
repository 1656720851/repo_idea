package com.service.imp;

import com.bean.Account;
import com.dao.AccountDao;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Date 2022/3/10 - 下午 4:29
 */
@Service
@Transactional
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountDao accountDao;

    //查询
    @Override
    public List<Account> findAll() {
/*
        System.out.println("asdada");
        return null;*/

        return accountDao.findAll();
    }

    //添加
    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    //查询账户id
    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    //修改
    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    //删除账号
    @Override
    public void deleteBatch(Integer[] ids) {
        accountDao.deleteBatch(ids);
    }
}
