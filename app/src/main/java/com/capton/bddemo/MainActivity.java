package com.capton.bddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.capton.bd.BottomDialog;

public class MainActivity extends AppCompatActivity {

    BottomDialog bottomDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 // 1、新建Builder对象
                 BottomDialog.Builder builder = new BottomDialog.Builder(MainActivity.this);
                 // 2、设置布局文件
                 builder.setContentView(R.layout.layout_bottom_demo2);
                 // 3、获取BottomDialog对象
                 bottomDialog = builder.create();
                 // 4、显示BottomDialog
                 bottomDialog.show();

                 // 5、获取布局View对象,用于设置布局内的控件事件
                 View bottomView = bottomDialog.getContentView();
                 ImageView close = bottomView.findViewById(R.id.close);
                 close.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         bottomDialog.dismiss();
                     }
                 });


                 if(((Switch)findViewById(R.id.touchOutside)).isChecked())
                     bottomDialog.setCanceledOnTouchOutside(true);
                 else
                     bottomDialog.setCanceledOnTouchOutside(false);
                 if(((Switch)findViewById(R.id.cancelAble)).isChecked())
                     bottomDialog.setCancelable(true);
                 else
                     bottomDialog.setCancelable(false);

             }
         });

    }
}
