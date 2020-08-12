简单的创建透明状态栏只需要一行代码, 完美兼容


1. 这里的状态栏颜色指的状态栏背景色
1. 状态栏的文字颜色默认是白色(即亮色模式), 可以设置成黑色(暗色模式)


=== "亮色模式"
    <img src="https://i.imgur.com/n4lPbRt.png" width="50%"/>
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        immersive(toolbar)
    }
    ```

=== "暗色模式"
    <img src="https://i.imgur.com/5JSSXXn.png" width="50%"/>
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        immersiveDark(toolbar)
    }
    ```

<br>

## 函数
```kotlin
fun Activity.immersive(
    view: View? = null, // 给指定的视图设置一个paddingTop避免被状态栏覆盖
    @ColorInt color: Int = DEFAULT_COLOR, // 状态栏背景颜色
    @FloatRange(from = 0.0, to = 1.0) alpha: Float = DEFAULT_ALPHA // 背景颜色的透明度 0 - 1
)

fun Activity.immersiveDark(
    view: View? = null,
    darkMode: Boolean = true, // 状态栏的文字颜色是否显示黑色
    @ColorInt color: Int = DEFAULT_COLOR,
    @FloatRange(from = 0.0, to = 1.0) alpha: Float = DEFAULT_ALPHA
)

fun Activity.darkMode(darkMode: Boolean = true)
// 可以通过此函数单独设置暗色模式或者恢复为亮色模式
```

<br>

!!! tip
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