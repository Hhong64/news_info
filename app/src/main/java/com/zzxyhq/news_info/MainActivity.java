package com.zzxyhq.news_info;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.zzxyhq.news_info.History.HistoryActivity;
import com.zzxyhq.news_info.Login.LoginActivity;
import com.zzxyhq.news_info.add.AddItemActivity;
import com.zzxyhq.news_info.bean.TypeBean;
import com.zzxyhq.news_info.db.DBManager;
import com.zzxyhq.news_info.detail.UserInfoActivity;
import com.zzxyhq.news_info.frag.NewsInfoAdapter;
import com.zzxyhq.news_info.frag.NewsInfoFragment;
import com.zzxyhq.news_info.frag.VideoAdapter;
import com.zzxyhq.news_info.view.PagerSlidingTabStrip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewPager mainVp;
    PagerSlidingTabStrip tabStrip;
    ImageView addIv;
    ImageView login;
    List<Fragment> fragmentList;  //viewpager所显示的内容
    List<TypeBean>selectTypeList;  //所选中的类型的集合
    private NewsInfoAdapter adapter;
    private VideoAdapter vdadapter;
    FloatingActionButton fab;
    String user=" ";

    private static final int REQUEST_CODE_GO_TO_Login = 100;
    private static final int REQUEST_CODE_GO_TO_Detail= 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar act= getSupportActionBar();//隐藏标题
        act.hide();//隐藏标题

        setContentView(R.layout.activity_main);
        mainVp = findViewById(R.id.main_vp);
        tabStrip = findViewById(R.id.main_tabstrip);
        addIv = findViewById(R.id.main_iv_add);
        login =findViewById(R.id.main_login);

        addIv.setOnClickListener(this);  //添加点击事件的监听
        login.setOnClickListener(this);
        fragmentList = new ArrayList<>();
        selectTypeList = new ArrayList<>();
        initPager();   //初始化页面
//        创建适配器对象
        adapter = new NewsInfoAdapter(getSupportFragmentManager(), this, fragmentList, selectTypeList);
//        设置适配器
        mainVp.setAdapter(adapter);
//      关联TabStrip和ViewPager
        tabStrip.setViewPager(mainVp);


    }
    private void initPager() {
        /* 初始化页面的函数*/
        List<TypeBean> typeList = DBManager.getSelectedTypeList();
        selectTypeList.addAll(typeList);
        for (int i = 0; i < selectTypeList.size(); i++) {
            TypeBean typeBean = selectTypeList.get(i); //得到每一个栏目的信息对象
            NewsInfoFragment infoFragment = new NewsInfoFragment();
//            向fragment当中传递数据
            Bundle bundle = new Bundle();
            bundle.putSerializable("type",typeBean);
            infoFragment.setArguments(bundle);
            fragmentList.add(infoFragment);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_iv_add:
                Intent intent = new Intent(MainActivity.this, AddItemActivity.class);
                startActivity(intent);
                break;
        }
        if(user.equals(" ")){
            switch (v.getId()){
                case R.id.main_login:
                Intent intent2 = new Intent(MainActivity.this, LoginActivity.class);
                startActivityForResult(intent2,REQUEST_CODE_GO_TO_Login);
//                Log.d(user,"user的值为"+user);
                break;
            }
        }
        else{
          //  Log.d(user,"Ruser的值为"+user);
            switch(v.getId()){
                case R.id.main_login:
                    Intent intent3= new Intent(MainActivity.this, UserInfoActivity.class);
                    startActivityForResult(intent3,REQUEST_CODE_GO_TO_Detail);
                    //intent3.putExtra("user",user);
               //     startActivity(intent3);
               break;
            }
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case REQUEST_CODE_GO_TO_Login:
                //判断注册是否成功  如果注册成功
                if(resultCode==RESULT_OK){
                    //则获取data中的账号和密码  动态设置到EditText中
                    String username=data.getStringExtra("username");
                    String password=data.getStringExtra("password");
                    user = username;
                }
                break;
        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        fragmentList.clear();
        selectTypeList.clear();

        initPager();  //重新加载viewpager的显示页
        adapter.notifyDataSetChanged();
        tabStrip.notifyDataSetChanged();
    }

    public void video_onclick(View view) {
        Intent intent = new Intent(this,VideoActivity.class);
        startActivity(intent);
    }

    public void his_onclick(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }
}
