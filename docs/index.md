一行代码创建透明状态栏

1. 状态栏颜色指的状态栏背景色
1. 状态栏文字颜色白色(即亮色模式), 可以设成黑色(暗色模式)

=== "亮色模式"
    <img src="https://raw.githubusercontent.com/liangjingkanji/StatusBar/master/docs/img/md/light-status.png" width="50%"/>
    ```kotlin
    immersive(toolbar)
    ```

=== "暗色模式"
    <img src="https://i.loli.net/2021/08/14/zaQ4D5qluFyCnbX.png" width="50%"/>
    ```kotlin
    immersive(toolbar, true) // 第二个参数即指定状态栏文字颜色为暗色模式
    ```

| 函数 | 描述 |
|-|-|
| Activity.`statusBarColor` | 指定状态栏颜色 |
| Activity.`immersive` | 指定透明状态栏或状态栏颜色 |
| Activity.`immersiveExit` | 退出沉浸式状态栏并恢复默认状态栏 |
| Activity.`darkMode` | 指定状态栏文字颜色为暗色模式 |
| View.`statusPadding` | 为View指定上内间距(为状态栏高度) |
| Activity.`setActionBarBackground` | 指定ActionBar背景颜色, 如果存在 |