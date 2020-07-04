package com.zzxyhq.news_info.History;

import android.os.Bundle;

import com.zzxyhq.news_info.R;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import com.zzxyhq.news_info.bean.HistoryDescBean;

public class HistoryDescActivity extends BaseActivity implements View.OnClickListener {

    private ImageView backIv , shareIv ,picIv;
    private TextView titleTv;
    private TextView contentTv;
    private String hisId;
    private HistoryDescBean.ResultBean resultBean;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_desc);
        backIv = (ImageView) findViewById(R.id.desc_back_iv);
        shareIv = (ImageView) findViewById(R.id.desc_share_iv);
        picIv = (ImageView) findViewById(R.id.desc_iv_pic);
        titleTv = (TextView) findViewById(R.id.desc_tv_title);
        contentTv = (TextView) findViewById(R.id.desc_tv_content);
        backIv.setOnClickListener(this);
        shareIv.setOnClickListener(this);

        hisId = getIntent().getStringExtra("hisId");
        String historyDescUrl = ContentUrl.getHistoryDescUrl("1.0", hisId);
        loadData(historyDescUrl);
    }

    @Override
    public void onSuccess(String result) {
        HistoryDescBean bean = new Gson().fromJson(result, HistoryDescBean.class);
        resultBean = bean.getResult().get(0);
        titleTv.setText(resultBean.getTitle());
        contentTv.setText(resultBean.getContent());
        String picUrl = resultBean.getPic();
        if(TextUtils.isEmpty(picUrl)){
            picIv.setVisibility(View.GONE);
        }else {
            picIv.setVisibility(View.VISIBLE);
            Picasso.with(this).load(picUrl).into(picIv);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.desc_back_iv:
                finish();
                break;
            case R.id.desc_share_iv:
                String text = "我发现一款好用的软件——聚合新闻，快来一起探索这个App吧！";
                if(resultBean!=null){
                    text = "想要了解"+resultBean.getTitle()+"详情吗？快来下载聚合新闻App吧！";
                }
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(intent,"历史上的今天"));
                break;
        }
    }
}
