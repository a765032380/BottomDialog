# BottomDialog
底部对话框，可自由设置布局

#### 1、新建Builder对象
    BottomDialog.Builder builder = new BottomDialog.Builder(MainActivity.this);
#### 2、设置布局文件
    builder.setContentView(R.layout.layout_bottom_demo);
#### 3、获取BottomDialog对象
    bottomDialog = builder.create();
#### 4、显示BottomDialog
    bottomDialog.show();
#### 5、获取布局View对象,用于设置布局内的控件事件
    View bottomView = bottomDialog.getContentView();
    bottomView.setOnClickListener(new View.OnClickListener() {
               @Override
              public void onClick(View v) {
                         bottomDialog.dismiss();
               }
              }); 
