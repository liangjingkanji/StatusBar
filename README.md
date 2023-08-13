## StatusBar

<p align="center"><img src="https://raw.githubusercontent.com/liangjingkanji/StatusBar/master/docs/img/preview.jpeg" width="400"/></p>

<p align="center"><strong>一行代码的透明状态栏</strong></p>

<p align="center">
<a href="http://liangjingkanji.github.io/StatusBar/">使用文档</a>
| <a href="https://github.com/liangjingkanji/document/blob/master/visit-pages.md">无法访问?</a>
| <a href="https://github.com/liangjingkanji/StatusBar/releases/download/2.0.5/StatusBar.apk">下载体验</a>
</p>

<p align="center"><img src="https://raw.githubusercontent.com/liangjingkanji/StatusBar/master/docs/img/code-preview.png" width="350"/></p>

<p align="center">
<a href="https://jitpack.io/#liangjingkanji/StatusBar"><img src="https://jitpack.io/v/liangjingkanji/StatusBar.svg"/></a>
<img src="https://img.shields.io/badge/language-kotlin-orange.svg"/>
<img src="https://img.shields.io/badge/license-Apache-blue"/>
<img src="https://raw.githubusercontent.com/liangjingkanji/liangjingkanji/master/img/group.svg"/>
</p>

### 特点

- [x] 学习成本低
- [x] 启用/关闭透明状态栏
- [x] 状态栏背景/文字颜色
- [x] 状态栏/导航栏高度
- [x] 为View设置指定状态栏高度的Padding/Margin
- [x] 支持Activity/Fragment/DrawerLayout


<br>

## 安装

Project 的 settings.gradle 添加仓库

```kotlin
dependencyResolutionManagement {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

Module 的 build.gradle 添加依赖框架

```groovy
implementation 'com.github.liangjingkanji:StatusBar:2.0.5'
```

<br>

## License

```
MIT License

Copyright (c) 2023 劉強東 https://github.com/liangjingkanji

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
