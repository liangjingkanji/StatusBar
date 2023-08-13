简单的创建透明状态栏只需要一行代码, 完美兼容


1. 这里的状态栏颜色指的状态栏背景色
1. 状态栏的文字颜色默认是白色(即亮色模式), 可以设置成黑色(暗色模式)

=== "亮色模式"
    <img src="https://raw.githubusercontent.com/liangjingkanji/StatusBar/master/docs/img/md/light-status.png" width="50%"/>
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        immersive(toolbar)
    }
    ```

=== "暗色模式"
    <img src="https://i.loli.net/2021/08/14/zaQ4D5qluFyCnbX.png" width="50%"/>
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        immersive(toolbar, true) // 第二个参数即设置状态栏文字颜色暗色模式
    }
    ```

<br>

| 函数 | 描述 |
|-|-|
| Activity.`translucent` | 设置半透明状态栏 |
| Activity.`immersive` | 设置全透明状态栏或者状态栏颜色 |
| Activity.`immersiveRes` | 和上面函数区别是使用颜色资源值 |
| Activity.`darkMode` | 设置状态栏文字颜色为黑色 |
| View.`statusPadding` | 为View的PaddingTop增加一个状态栏高度 |
| Activity.`setActionBarBackground` | 设置ActionBar的背景颜色, 如果存在ActionBar的话 |

<br>

Toolbar即你在布局中创建的标题栏视图

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="56dp"
        android:background="@color/colorPrimary"
        android:theme="@style/Toolbar"
        app:title="ToolBar"
        app:titleTextColor="@android:color/white" />

</LinearLayout>
```