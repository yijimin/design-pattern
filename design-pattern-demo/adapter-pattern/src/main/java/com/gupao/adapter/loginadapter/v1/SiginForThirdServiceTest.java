package com.gupao.adapter.loginadapter.v1;


import com.gupao.adapter.loginadapter.v1.service.SinginForThirdService;

/**
 *  on 2019/3/16.
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
