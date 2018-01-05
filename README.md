# BottomDialog
这是一个Android底部弹出框容器，可自由设置布局
## 效果
![](https://raw.githubusercontent.com/Ccapton/BottomDialog/master/bddemo.gif) 
![](https://raw.githubusercontent.com/Ccapton/BottomDialog/master/bddemo2.gif) 

## gradle引入
build.gradle(Project)
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
build.gradle(Module:app)
```
dependencies {
	        compile 'com.github.Ccapton:BottomDialog:1.0.0'
   }
```
## 使用方法
#### 1、新建Builder对象
    BottomDialog.Builder builder = new BottomDialog.Builder(MainActivity.this);
#### 2、设置布局文件
    builder.setContentView(R.layout.layout_bottom_demo);
#### 3、获取BottomDialog对象
    BottomDialog bottomDialog = builder.create();
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
