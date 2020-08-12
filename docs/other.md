<img src="https://i.imgur.com/qekgQqJ.png" width="100%"/>


```kotlin
fun AppCompatActivity.setActionBarBackground(@ColorInt color: Int)
fun AppCompatActivity.setActionBarBackgroundRes(@ColorRes color: Int)
// 设置ActionBar背景颜色

fun AppCompatActivity.setActionBarTransparent()
// 设置ActionBar透明背景

fun Context.getStatusBarHeight(): Int

fun View.statusPadding()
// 和immersive函数的第一个参数功能等效, 即给某个视图添加一个paddingTop等于状态栏高度
```