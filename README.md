## StatusBar

<p align="center"><img src="https://i.imgur.com/o18sw7W.jpg" alt="1600" width="50%"/></p>

<p align="center"><strong>一行代码的透明状态栏</strong></p>

<p align="center"><a href="http://liangjingkanji.github.io/StatusBar/">使用文档</a> | <a href="https://coding-pages-bucket-3558162-8706000-16648-587726-1252757332.cos-website.ap-shanghai.myqcloud.com/">备用访问</a></p>

<p align="center"><img src="https://i.imgur.com/bAaaokr.png" width="400"/></p>

<p align="center">
<a href="https://jitpack.io/#liangjingkanji/StatusBar"><img src="https://jitpack.io/v/liangjingkanji/StatusBar.svg"/></a>
<img src="https://img.shields.io/badge/language-kotlin-orange.svg"/>
<img src="https://img.shields.io/badge/license-Apache-blue"/>
<img src="https://raw.githubusercontent.com/liangjingkanji/liangjingkanji/master/img/group.svg"/>
</p>

### 特点

- 透明状态栏
- 状态栏背景颜色
- 状态栏文字颜色(亮|暗色模式)
- 支持Activity/Fragment/DrawerLayout
- Kotlin特性
- 一行代码实现
- 文档详细, Demo简单


<br>

## 安装

添加远程仓库根据创建项目的 Android Studio 版本有所不同

Android Studio Arctic Fox以下创建的项目 在项目根目录的 build.gradle 添加仓库

```groovy
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

Android Studio Arctic Fox以上创建的项目 在项目根目录的 settings.gradle 添加仓库

```kotlin
dependencyResolutionManagement {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

然后在 module 的 build.gradle 添加依赖框架

```groovy
implementation 'com.github.liangjingkanji:StatusBar:2.0.4'
```

<br>

## License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
