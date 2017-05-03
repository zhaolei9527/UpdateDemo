package com.example.administrator.updatedemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Context mContext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        UpDateDialog upDateDialog = new UpDateDialog();
        upDateDialog.UpDateDialog(mContext, "重要更新", "修复了一些已知bug");

    }


}
