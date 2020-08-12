## StatusBar

<p align="center"><img src="https://i.imgur.com/o18sw7W.jpg" alt="1600" width="50%"/></p>

<p align="center"><strong>一行代码的透明状态栏</strong></p><br>

<p align="center">
<a href="https://jitpack.io/#liangjingkanji/StatusBar"><img src="https://jitpack.io/v/liangjingkanji/StatusBar.svg"/></a>
<img src="https://img.shields.io/badge/language-kotlin-orange.svg"/>
<img src="https://img.shields.io/badge/license-Apache-blue"/>
<a href="https://jq.qq.com/?_wv=1027&k=vWsXSNBJ"><img src="https://img.shields.io/badge/QQ群-752854893-blue"/></a>
</p>
<p align="center"><a href="http://liangjingkanji.github.io/StatusBar/">使用文档</a></p>

### 特点

- [x] 透明状态栏
- [x] 状态栏背景颜色
- [x] 状态栏文字颜色(亮|暗色模式)
- [x] 支持Activity/Fragment/DrawerLayout
- [x] 
- [x] Kotlin特性






<br>

在项目根目录的 build.gradle 添加仓库

```groovy
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

在 module 的 build.gradle 添加依赖

```groovy
implementation 'com.github.liangjingkanji:StatusBar:1.0.4'
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
