```kotlin
fun Activity.setStatusBarColor(
    @ColorInt color: Int,
    darkMode: Boolean? = null,
    @FloatRange(from = 0.0, to = 1.0) alpha: Float = 1F
)
// 仅设置状态栏的颜色

fun Activity.setStatusBarColorRes(
    @ColorRes colorRes: Int,
    darkMode: Boolean? = null,
    @FloatRange(from = 0.0, to = 1.0) alpha: Float = 1F
)
// 仅设置状态栏的颜色(颜色资源)
```

<br>

!!! tip
    `setStatusBarColor`和`immersive`的区别是不会导致状态栏覆盖布局内容, 仅仅是设置状态栏的背景/文字颜色


=== "亮色模式"
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dark_status_bar)
        setStatusBarColor(Color.YELLOW)
    }
    ```
    <img src="https://i.imgur.com/OV4EJIS.png" width="50%"/>

=== "暗色模式"
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dark_status_bar)
        setStatusBarColor(Color.YELLOW, true)
    }
    ```
    <img src="https://i.imgur.com/zzGUGWV.png" width="50%"/>

