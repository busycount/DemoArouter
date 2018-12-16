package com.busycount.mylibrary3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * T3Activity
 * <p>
 * 2018/12/16 | Count.C | Created
 */
@Route(path = "/l3/t3")
public class T3Activity extends AppCompatActivity {

    @Autowired
    int id;
    @Autowired
    String name;

    @BindView(R2.id.textView1)
    TextView textView1;
    @BindView(R2.id.textView2)
    TextView textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l3_t3);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        textView1.setText(id + "");
        textView2.setText(name);
    }
}
