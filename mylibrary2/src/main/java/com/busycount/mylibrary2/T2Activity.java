package com.busycount.mylibrary2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * T2Activity
 * <p>
 * 2018/12/16 | Count.C | Created
 */
@Route(path = "/l2/t2")
public class T2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l2_t2);
        ButterKnife.bind(this);
    }
}
