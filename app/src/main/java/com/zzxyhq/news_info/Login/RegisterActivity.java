package com.zzxyhq.news_info.Login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.zzxyhq.news_info.R;
import com.zzxyhq.news_info.bean.User;
import com.zzxyhq.news_info.db.DBOpenH;
import com.zzxyhq.news_info.db.DBOpenHelper;

import java.util.ArrayList;
/**
 * Created by littlecurl 2018/6/24
 */
/**
 * 此类 implements View.OnClickListener 之后，
 * 就可以把onClick事件写到onCreate()方法之外
 * 这样，onCreate()方法中的代码就不会显得很冗余
 */
public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private DBOpenH mDBOpenHelper;
    private EditText myaccount;
    private EditText mypwd;
    private EditText mypwd2;
    private String realCode;
    private Button mBtRegister;
    private EditText Phonecodes;
    private ImageView goto_login;
    private ImageView Showcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ActionBar act= getSupportActionBar();//隐藏标题
        act.hide();//隐藏标题

        initView();

        mDBOpenHelper = new DBOpenH(this);

        //将验证码用图片的形式显示出来
        Showcode.setImageBitmap(Code.getInstance().createBitmap());
        realCode = Code.getInstance().getCode().toLowerCase();
    }

    private void initView(){
        mBtRegister = findViewById(R.id.btn_register);
        myaccount = findViewById(R.id.et_account);
        mypwd = findViewById(R.id.et_pwd);
        mypwd2= findViewById(R.id.et_pwd2);
        Phonecodes = findViewById(R.id.et_phoneCodes);
        Showcode = findViewById(R.id.showCode);
        goto_login=findViewById(R.id.goto_login);

        //点击监听
        Showcode.setOnClickListener(this);
        mBtRegister.setOnClickListener(this);
        goto_login.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.goto_login:
                startActivity(new Intent(this,LoginActivity.class));
                finish();
                break;
            case R.id.showCode:    //改变随机验证码的生成
                Showcode.setImageBitmap(Code.getInstance().createBitmap());
                realCode = Code.getInstance().getCode().toLowerCase();
                break;
            case R.id.btn_register:    //注册按钮
                //获取用户输入的用户名、密码、验证码
                String username = myaccount.getText().toString().trim();
                String password = mypwd.getText().toString().trim();
                String password2=mypwd2.getText().toString().trim();
                String phoneCode = Phonecodes.getText().toString().toLowerCase();

                //注册验证
                int input=0;
                if(!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)
                        &&!TextUtils.isEmpty(password2)&& !TextUtils.isEmpty(phoneCode)){
                    if(password.equals(password2)) {
                        if (phoneCode.equals(realCode)) {
                          input=1;
                        }
                    }else{
                        Toast.makeText(this, "前后密码不一致，请重新输入！", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(this, "未完善信息，注册失败！", Toast.LENGTH_SHORT).show();
                }

                if(input==1){
                    ArrayList<User> data = mDBOpenHelper.getAllData();
                    boolean find=false;
                    for (int i = 0; i < data.size(); i++) {
                        User user = data.get(i);
                        if (username.equals(user.getName())) {
                            find = true;
                            break;
                        } else {
                            find = false;
                        }
                    }

                    if (find) {
                        Toast.makeText(this, "用户名已存在，请重新设置", Toast.LENGTH_SHORT).show();
                    } else {
                        //将用户名和密码加入到数据库中
                        mDBOpenHelper.add(username, password);

                        Intent intent2 = new Intent(this, LoginActivity.class);
                        startActivity(intent2);
                        finish();
                        Toast.makeText(this,  "验证通过，注册成功", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }
}
