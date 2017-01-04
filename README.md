# FactoryAnnotation
factory design for simple factory method implement

> project structure
1. :app
2. :javac
    1. :annotation
    2. :processor
3. apt
4. google autoservice
5. javax.utils
6. note
7. future

## :app
> simple demo
```java
        String name = new FruitFactory().create("orange").name();
        TextView _name = (TextView) findViewById(R.id.name_tv);
        _name.setText(String.format(Locale.getDefault(), "fruit name: %s", name));
```

## :annotation
> compile annotation, developer by it may be make
 factory item

## :processor
> javac start up jvm instance to run processor,
scan be :annotation class type handle&analyse
generate code

## apt
> gradle plugin to load processor

## autoservice
> by autoservice to create META-INF/services/javax.annotation.processing.Processor
by `@AutoService(Processor.class)` annotation, make it easy!

## utils
```java
    private Types typeUtils; // type handle
    private Elements elementUtils; // element handle for example PackageElement and so on
    private Filer filer;// create file
    private Messager messager; // log
```

## note
> in order to beautiful annotation and processor inbox,
developer separate compile or provider, google very like
, for example support-v4 and so on, processor run a jvm instance,
so all java code may be lucky run or so haha. design base rules
data structure,data verify,data handler,generate code,handle exception or
error,avoid duplicate source.java

## future
> base annotation processor may be handle so many env,
a dev should depth learn&study it. future more and more env......