=== "亮色模式"
    ```kotlin
    immersive(Color.YELLOW)
    ```
    <img src="https://i.loli.net/2021/08/14/6eQ9r3icyzpP72T.png" width="250"/>

=== "暗色模式"
    ```kotlin
    immersive(Color.YELLOW, true)
    ```
    <img src="https://i.loli.net/2021/08/14/y8NRfwGjEKl2Th7.png" width="250"/>


!!! note "使用View"
    `immersive`这个函数还可以传入View进去, 就会自动使用View的背景色作为状态栏颜色
    ```kotlin
    immersive(toolbar)
    ```