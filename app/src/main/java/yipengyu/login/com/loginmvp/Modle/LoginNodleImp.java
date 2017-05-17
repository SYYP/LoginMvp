package yipengyu.login.com.loginmvp.Modle;

import android.os.Handler;
import android.text.TextUtils;

import yipengyu.login.com.loginmvp.view.SuccessLogin;

/**
 * date : ${Date}
 * author:衣鹏宇(ypu)
 */

public class LoginNodleImp implements LoginModle {
    @Override
    public void login(String name, SuccessLogin successLogin) {
        boolean isbool=false;
       if(TextUtils.isEmpty(name)){
           successLogin.fail();
           isbool=true;

       }
        if(!isbool){
            successLogin.success();

        }
    }
}
