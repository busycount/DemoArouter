# DemoArouter

## core library

build.gradle
```
dependencies {
    api ('com.alibaba:arouter-api:1.4.1'){
        exclude group:'com.android.support'
    }
}
```


## business library

build.gradle
```
android {
    defaultConfig {
        javaCompileOptions {
            annotationProcessorOptions {
                arguments = [ AROUTER_MODULE_NAME : project.getName() ]
            }
        }
    }
}

dependencies {
    compileOnly project(':core')
    annotationProcessor 'com.alibaba:arouter-compiler:1.2.2'
}
```

## Application

```java
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {   // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this);
    }
}
```

## Use

- Activity

```
@Route(path = "/l1/t1")
public class T1Activity extends AppCompatActivity {
    @Autowired
    int id;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t1);
        ARouter.getInstance().inject(this);
    }
}
```

- navigation

```
ARouter.getInstance()
        .build("/l1/t1")
        .withInt("id", 11)
        .withString("name", "jack")
        .navigation();
```
