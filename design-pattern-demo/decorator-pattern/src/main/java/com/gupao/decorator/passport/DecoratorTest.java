package com.gupao.decorator.passport;


import com.gupao.decorator.passport.old.SigninService;
import com.gupao.decorator.passport.upgrade.ISiginForThirdService;
import com.gupao.decorator.passport.upgrade.SiginForThirdService;


/**
 *
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");

    }


}
