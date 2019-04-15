package com.baz.sekill;

import com.baz.sekill.mapper.SkBillMapper;
import com.baz.sekill.model.SkBill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SekillApplicationTests {

    @Resource
    private SkBillMapper skBillMapper;

    @Test
    public void contextLoads() {
        SkBill skBill = new SkBill();
        skBill.setUser_id(1);
        skBill.setGoods_id(1);
        skBill.setPay_status(1);
        skBill.setUpdate_time(new Date());
        skBill.setCreat_time(new Date());
        skBillMapper.insert(skBill);
    }

}
