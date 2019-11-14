package com.yi;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Auther: 小飞
 * @Date: 2019/11/3 18:12
 * @Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;
    //before 注解会在每一个测试用例前运行
    @Before
    public void setup(){
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void whenQuerySuccess() throws Exception {
        //模拟请求
        mvc.perform(MockMvcRequestBuilders.get("/user")
                .param("username","jojo")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));//返回的是一个集合，并且集合的长度为3
    }

    @Test
    public void whenGenInfoSuccess() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/user/1")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("tom"));
    }
}
