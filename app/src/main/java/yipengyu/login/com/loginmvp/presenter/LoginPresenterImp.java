package yipengyu.login.com.loginmvp.presenter;

import yipengyu.login.com.loginmvp.Modle.LoginModle;
import yipengyu.login.com.loginmvp.Modle.LoginNodleImp;
import yipengyu.login.com.loginmvp.view.LoginView;
import yipengyu.login.com.loginmvp.view.SuccessLogin;

/**
 * date : ${Date}
 * author:衣鹏宇(ypu)
 */

public class LoginPresenterImp  implements LoginPresenter,SuccessLogin {
    private LoginModle loginModle;
    private LoginView loginView;

    public LoginPresenterImp( LoginView loginView) {
        this.loginModle = new LoginNodleImp();
        this.loginView = loginView;
    }

    @Override
    public void surename(String name) {
//     if(loginView!=null){
//         loginView.isName();
//
//     }
//        loginView.notname();
         loginModle.login(name,this);
    }

    @Override
    public void onDestroy() {
        loginView=null;

    }

    @Override
    public void success() {
      loginView.isName();

    }

    @Override
    public void fail() {
    loginView.notname();
    }
}
