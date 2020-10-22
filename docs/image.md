

要求图片的一部分作为状态栏的背景
<br>

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_immerse_image)

    immersive()
}
```

<img src="https://i.imgur.com/DwfyPMy.png" width="250"/>

## ActionBar

如果这里你使用的是ActionBar, 则应该给ActionBar设置透明背景

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_immerse_image)

    immersive()
    setActionBarTransparent() // 给ActionBar设置透明背景
}
```

<img src="https://i.imgur.com/u3hhuch.jpg" width="250"/>

## Toolbar

如果使用的Toolbar可以为Toolbar设置一个状态栏上间距, 防止Toolbar被状态栏遮挡

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_immerse_image)

    immersive()
    toolbar.statusPadding() // 设置一个PaddingTop等于状态栏高度, 避免工具栏被状态栏遮挡
}
```
<br>

> 这里我说的是Toolbar, 实际上可以是任何视图
