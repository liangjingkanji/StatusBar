

要求图片的一部分作为状态栏的背景
<br>

<img src="https://i.imgur.com/DwfyPMy.png" width="50%"/>

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_immerse_image)

    immersive()
}
```


如果这里你使用的是ActionBar, 则应该给ActionBar设置透明背景

<img src="https://i.imgur.com/u3hhuch.jpg" width="50%"/>

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_immerse_image)

    immersive()
    setActionBarTransparent() // 给ActionBar设置透明背景
}
```

如果使用的Toolbar则应该作为参数传入

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_immerse_image)

    immersive(toolbar)
}
```
