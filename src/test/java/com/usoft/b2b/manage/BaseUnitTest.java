package com.usoft.b2b.manage;

import com.alibaba.fastjson.JSON;
import com.usoft.b2b.manage.account.AccountToken;
import com.usoft.b2b.manage.utils.JwtUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 测试基础类
 *
 * @author hejq
 * @date 2018-12-19 14:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BaseUnitTest {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void test() {
        String userName = "18328587849";
        String keyWord = "13d0794de73ee7c7833ea8948356998e";
        AccountToken accountToken = new AccountToken(JwtUtil.sign(userName, keyWord, AccountToken.EXPIRE_TIME),
                JwtUtil.sign(userName, keyWord, AccountToken.REFRESH_EXPIRE_TIME));
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        String key = userName + ",10.1.51.24";
        valueOperations.set(key, JSON.toJSONString(accountToken));
        AccountToken token = JSON.parseObject(valueOperations.get(key), AccountToken.class);
        System.out.println(token);
    }
}
