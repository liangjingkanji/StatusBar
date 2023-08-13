

将图片作为状态栏背景
<br>

```kotlin
immersive()
```

<img src="https://i.loli.net/2021/08/14/IGo5tnA6ENvRTfp.png" width="250"/>

## ActionBar

ActionBar需要单独设置透明背景

```kotlin
immersive()
setActionBarTransparent() // 给ActionBar设置透明背景
```

<img src="https://i.loli.net/2021/08/14/VJmtPjAEk619v2B.jpg" width="250"/>

## Toolbar

需要为Toolbar设置状态栏上间距, 防止Toolbar被状态栏遮挡

```kotlin
immersive()
toolbar.statusPadding() // 指定PaddingTop(状态栏高度), 避免工具栏被状态栏遮挡
```
<br>

!!! success "防止状态栏遮挡"
    任何View可以使用`statusPadding`方式防止遮挡
