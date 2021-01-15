# WeakJava

wjc - a mini Java compiler for ziprisc1

wjc the WeakJava compiler.

Compiles WeakJava code into zas assembly code.

the output (stdout) should be put into a `.zas` file.

```
$ wjc < hello.wj > hello.zas
$ zas hello.zas > hello.zex
$ zrisc hello.zex
hello
```
