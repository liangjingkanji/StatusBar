## StatusBar



一行代码配置透明状态栏



常用功能

1. 透明状态栏
2. 透明状态栏(暗色模式)


### 依赖

project 的 build.gradle

```groovy
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```



module 的 build.gradle

```
implementation 'com.github.liangjingkanji:StatusBar:1.0.1'
```



## 示例

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        immersiveDark(toolbar)
        // or immersive(toolbar)
    }
}
```

- 这里的toolbar即函数定义中的`view`, 因为toolbar被顶到状态栏上, 所以需要给toolbar设置一个`paddingTop`值.
- toolbar不能是`RelativeLayout`, 因为其paddingTop会导致子视图出现位置偏差.
- 无论是`DrawerLayout`和`Fragment`切换都可以控制状态栏颜色.

## 函数介绍

透明状态栏

```kotlin
fun Activity.immersive(
    view: View? = null,
    color: Int = DEFAULT_COLOR,
    @FloatRange(
        from = 0.0,
        to = 1.0
    ) alpha: Float = DEFAULT_ALPHA
)
```



透明状态栏(暗色模式)

```kotlin
fun Activity.immersiveDark(
    view: View? = null,
    darkMode: Boolean = true,
    color: Int = DEFAULT_COLOR,
    alpha: Float = DEFAULT_ALPHA
)
```



切换状态栏的文字颜色(暗色模式)

```kotlin
fun Activity.darkMode(darkMode: Boolean = true)
```



间距函数

```kotlin
fun View.statusPadding() 

fun View.clearPaddingTop() 

fun View.statusMargin()
```



辅助函数, 主要是用于获取状态栏以及导航栏信息

```kotlin
fun Context.isNavigationBar(): Boolean
// 是否存在导航栏

fun Activity.setNavigationBarHidden()
// 隐藏导航栏

fun Context.getNavigationBarHeight(): Int
// 导航栏高度

fun Context.getStatusBarHeight(): Int
// 状态栏高度
```

