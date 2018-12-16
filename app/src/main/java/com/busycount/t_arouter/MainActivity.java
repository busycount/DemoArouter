package com.busycount.t_arouter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button, R.id.button2, R.id.button3, R.id.button4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                ARouter.getInstance().build("/l2/t2").navigation();
                break;
            case R.id.button2:
                ARouter.getInstance().build("/l3/t3").navigation();
                break;
            case R.id.button3:
                ARouter.getInstance()
                        .build("/l3/t3")
                        .withInt("id", 11)
                        .withString("name", "jack")
                        .navigation();
                break;
            case R.id.button4:
                break;
            default:
                break;
        }
    }
}
