# WeakJava

cm2 - a mini C compiler for ziprisc1

or maybe this needs to be WeakJava (.wj) and wjc (compiler)
cm2 the WeakJava compiler.

Compiles WeakJava code into zas assembly code.

the output (stdout) should be put into a `.zas` file.

```
$ cm2 < hello.cm2 > hello.zas
$ zas hello.zas > hello.zex
$ zrisc hello.zex
hello
```

Or something like that.
