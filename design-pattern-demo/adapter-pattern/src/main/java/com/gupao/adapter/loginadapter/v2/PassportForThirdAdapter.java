package com.gupao.adapter.loginadapter.v2;


import com.gupao.adapter.loginadapter.ResultMsg;
import com.gupao.adapter.loginadapter.v1.service.SiginService;
import com.gupao.adapter.loginadapter.v2.adapters.*;

/**
 * 结合策略模式、工厂模式、适配器模式
 *  on 2019/3/16.
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {

    public ResultMsg loginForQQ(String id) {
//        return processLogin(id,RegistForQQAdapter.class);
        return processLogin(id,LoginForQQAdapter.class);
    }

    public ResultMsg loginForWechat(String id) {
        return processLogin(id,LoginForWechatAdapter.class);
    }

    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone,LoginForTelAdapter.class);
    }

    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,passport);
        return super.login(username,passport);
    }
    //这里用到了简单工厂模式及策略模式
    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try{
            //适配器不一定要实现接口
            LoginAdapter adapter = clazz.newInstance();

            //判断传过来的适配器是否能处理指定的逻辑
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    //类图的快捷键  Ctrl + Alt + Shift + U
}
