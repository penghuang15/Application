package com.bjwxhl.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by CaiBing.Zhang on 2015/11/30.
 */
public class LoginActivity extends AppCompatActivity{

    private EditText nameEt,pwdEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        nameEt = (EditText)findViewById(R.id.username_id);
        pwdEt = (EditText)findViewById(R.id.pwd_id);

    }

    public void login(View view){
        String name = nameEt.getText().toString();
        String pwd = pwdEt.getText().toString();

//        if(name.equals("")){
//
//        }
//
//        if("".equals(name)){
//
//        }

        if(name.trim().length()<=0){
            nameEt.setError("用户名不能为空");
            return ;
        }
        if(pwd.trim().length()<=0){
            pwdEt.setError("密码不能为空");
            return ;
        }
    }
}
