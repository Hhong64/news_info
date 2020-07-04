package com.zzxyhq.news_info.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.zzxyhq.news_info.Login.LoginActivity;
import com.zzxyhq.news_info.MainActivity;
import com.zzxyhq.news_info.R;
import com.zzxyhq.news_info.add.AddItemActivity;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class UserInfoActivity extends AppCompatActivity {

    private ImageView mHBack;
    private ImageView mHHead;
    private ImageView mUserLine;
    private TextView mUserName;
    private TextView mUserVal;

    private ItemView mNickName;
    private ItemView mSex;
    private ItemView mSignName;
    private ItemView mPass;
    private ItemView mPhone;
    private ItemView mAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        initView();
        setData();
    }
    private void setData() {
        //设置背景磨砂效果
        Glide.with(this).load(R.drawable.head)
                .bitmapTransform(new BlurTransformation(this, 25), new CenterCrop(this))
                .into(mHBack);
        //设置圆形图像
        Glide.with(this).load(R.drawable.head)
                .bitmapTransform(new CropCircleTransformation(this))
                .into(mHHead);

        //设置用户名整个item的点击事件
        mNickName.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(UserInfoActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
        //修改用户名item的左侧图标
      /* mNickName.setLeftIcon(R.drawable.ic_phone);
        //
        mNickName.setLeftTitle("修改后的用户名");
        mNickName.setRightDesc("名字修改");
        mNickName.setShowRightArrow(false);
        mNickName.setShowBottomLine(false);

        //设置用户名整个item的点击事件
        mNickName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "我是onclick事件显示的", Toast.LENGTH_SHORT).show();
            }
        });
*/

    }

    private void initView() {
        //顶部头像控件
        mHBack = (ImageView) findViewById(R.id.h_back);
        mHHead = (ImageView) findViewById(R.id.h_head);
        mUserLine = (ImageView) findViewById(R.id.user_line);
        mUserName = (TextView) findViewById(R.id.user_name);
        mUserVal = (TextView) findViewById(R.id.user_val);
//        //下面item控件
        mNickName = (ItemView) findViewById(R.id.nickName);
//        mSex = (ItemView) findViewById(R.id.sex);
//        mSignName = (ItemView) findViewById(R.id.signName);
//        mPass = (ItemView) findViewById(R.id.pass);
//        mPhone = (ItemView) findViewById(R.id.phone);
//        mAbout = (ItemView) findViewById(R.id.about);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_iv_add:
                Intent intent = new Intent(UserInfoActivity.this, MainActivity.class);
                setResult(RESULT_OK,intent);
                break;
        }


    }


}



