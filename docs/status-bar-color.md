=== "亮色模式"
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dark_status_bar)
        immersive(Color.YELLOW)
    }
    ```
    <img src="https://i.imgur.com/OV4EJIS.png" width="250"/>

=== "暗色模式"
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dark_status_bar)
        immersive(Color.YELLOW, true)
    }
    ```
    <img src="https://i.imgur.com/zzGUGWV.png" width="250"/>


`immersive`这个函数还可以传入View进去, 就会自动使用View的背景色作为状态栏颜色.

```kotlin
class MainActivity : BaseMenuActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.inflateMenu(R.menu.menu_main)
        toolbar.setOnMenuItemClickListener { onOptionsItemSelected(it) }
        immersive(toolbar)
        // or dark status bar
        // immersive(toolbar, true)
    }
}
```
<br>

> 使用`immersive`不传入颜色值或者View就会使用透明状态栏, 状态栏会盖在视图上. 注意透明状态栏会导致键盘遮挡输入框, 这是所有透明状态栏的通病