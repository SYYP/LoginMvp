package yipengyu.login.com.loginmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import yipengyu.login.com.loginmvp.presenter.LoginPresenter;
import yipengyu.login.com.loginmvp.presenter.LoginPresenterImp;
import yipengyu.login.com.loginmvp.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView, View.OnClickListener{

    private EditText editText;
    private Button btn;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得资源id
        editText = (EditText) findViewById(R.id.edtext);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        loginPresenter=new LoginPresenterImp(this);
    }

    @Override
    protected void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
    loginPresenter.surename(editText.getText().toString());
    }

    @Override
    public void isName() {
        Toast.makeText(this,"login success",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void notname() {
        Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT).show();
    }
}
