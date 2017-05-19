package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by lsy on 2017/5/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        int insertSuccessKilled = successKilledDao.insertSuccessKilled(1001, 13592333997l);
        System.out.println(insertSuccessKilled);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {

        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(1000,13592333997l);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }

}