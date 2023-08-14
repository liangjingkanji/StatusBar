var __index = {"config":{"lang":["en"],"separator":"[\\s\\-,:!=\\[\\]()\"/]+|(?!\\b)(?=[A-Z][a-z])|\\.(?!\\d)|&[lg]t;","pipeline":["stemmer"]},"docs":[{"location":"index.html","title":"\u901a\u7528\u900f\u660e\u72b6\u6001\u680f","text":"<p>\u4e00\u884c\u4ee3\u7801\u521b\u5efa\u900f\u660e\u72b6\u6001\u680f</p> <ol> <li>\u72b6\u6001\u680f\u989c\u8272\u6307\u7684\u72b6\u6001\u680f\u80cc\u666f\u8272</li> <li>\u72b6\u6001\u680f\u6587\u5b57\u989c\u8272\u767d\u8272(\u5373\u4eae\u8272\u6a21\u5f0f), \u53ef\u4ee5\u8bbe\u6210\u9ed1\u8272(\u6697\u8272\u6a21\u5f0f)</li> </ol> \u4eae\u8272\u6a21\u5f0f\u6697\u8272\u6a21\u5f0f <p> <pre><code>immersive(toolbar)\n</code></pre></p> <p> <pre><code>immersive(toolbar, true) // \u7b2c\u4e8c\u4e2a\u53c2\u6570\u5373\u6307\u5b9a\u72b6\u6001\u680f\u6587\u5b57\u989c\u8272\u4e3a\u6697\u8272\u6a21\u5f0f\n</code></pre></p> \u51fd\u6570 \u63cf\u8ff0 Activity.<code>statusBarColor</code> \u6307\u5b9a\u72b6\u6001\u680f\u989c\u8272 Activity.<code>immersive</code> \u6307\u5b9a\u900f\u660e\u72b6\u6001\u680f\u6216\u72b6\u6001\u680f\u989c\u8272 Activity.<code>immersiveExit</code> \u9000\u51fa\u6c89\u6d78\u5f0f\u72b6\u6001\u680f\u5e76\u6062\u590d\u9ed8\u8ba4\u72b6\u6001\u680f Activity.<code>darkMode</code> \u6307\u5b9a\u72b6\u6001\u680f\u6587\u5b57\u989c\u8272\u4e3a\u6697\u8272\u6a21\u5f0f View.<code>statusPadding</code> \u4e3aView\u6307\u5b9a\u4e0a\u5185\u95f4\u8ddd(\u4e3a\u72b6\u6001\u680f\u9ad8\u5ea6) Activity.<code>setActionBarBackground</code> \u6307\u5b9aActionBar\u80cc\u666f\u989c\u8272, \u5982\u679c\u5b58\u5728"},{"location":"font.html","title":"\u72b6\u6001\u680f\u5b57\u4f53\u989c\u8272","text":"\u4eae\u8272\u6a21\u5f0f\u6697\u8272\u6a21\u5f0f <p><pre><code>immersive(Color.YELLOW)\n</code></pre> </p> <p><pre><code>immersive(Color.YELLOW, true)\n</code></pre> </p> <p>\u4f7f\u7528View</p> <p><code>immersive</code>\u8fd9\u4e2a\u51fd\u6570\u8fd8\u53ef\u4ee5\u4f20\u5165View\u8fdb\u53bb, \u5c31\u4f1a\u81ea\u52a8\u4f7f\u7528View\u7684\u80cc\u666f\u8272\u4f5c\u4e3a\u72b6\u6001\u680f\u989c\u8272 <pre><code>immersive(toolbar)\n</code></pre></p>"},{"location":"image.html","title":"\u56fe\u7247\u900f\u660e\u72b6\u6001\u680f","text":"<p>\u5c06\u56fe\u7247\u4f5c\u4e3a\u72b6\u6001\u680f\u80cc\u666f </p> <pre><code>immersive()\n</code></pre> <p></p>"},{"location":"image.html#actionbar","title":"ActionBar","text":"<p>ActionBar\u9700\u8981\u5355\u72ec\u8bbe\u7f6e\u900f\u660e\u80cc\u666f</p> <pre><code>immersive()\nsetActionBarTransparent() // \u7ed9ActionBar\u8bbe\u7f6e\u900f\u660e\u80cc\u666f\n</code></pre> <p></p>"},{"location":"image.html#toolbar","title":"Toolbar","text":"<p>\u9700\u8981\u4e3aToolbar\u8bbe\u7f6e\u72b6\u6001\u680f\u4e0a\u95f4\u8ddd, \u9632\u6b62Toolbar\u88ab\u72b6\u6001\u680f\u906e\u6321</p> <p><pre><code>immersive()\ntoolbar.statusPadding() // \u6307\u5b9aPaddingTop(\u72b6\u6001\u680f\u9ad8\u5ea6), \u907f\u514d\u5de5\u5177\u680f\u88ab\u72b6\u6001\u680f\u906e\u6321\n</code></pre> </p> <p>\u9632\u6b62\u72b6\u6001\u680f\u906e\u6321</p> <p>\u4efb\u4f55View\u53ef\u4ee5\u4f7f\u7528<code>statusPadding</code>\u65b9\u5f0f\u9632\u6b62\u906e\u6321</p>"},{"location":"other.html","title":"\u5176\u4ed6","text":"<p>\u6240\u6709\u51fd\u6570\u90fd\u5728<code>StatusBar</code>\u6587\u4ef6\u4e2d</p> <p></p> <p>\u8f85\u52a9\u51fd\u6570</p> \u51fd\u6570 \u63cf\u8ff0 Activity.setNavigationBar \u663e\u793a\u5bfc\u822a\u680f (\u7cfb\u7edf\u5f00\u542f\u53ef\u4ee5\u9690\u85cf, \u7cfb\u7edf\u672a\u5f00\u542f\u4e0d\u80fd\u5f00\u542f) Activity.setFullscreen \u663e\u793a\u5168\u5c4f Activity?.isNavigationBar \u662f\u5426\u5b58\u5728\u5bfc\u822a\u680f Context?.navigationBarHeight \u5bfc\u822a\u680f\u9ad8\u5ea6 Context?.statusBarHeight \u72b6\u6001\u680f\u9ad8\u5ea6"}]}