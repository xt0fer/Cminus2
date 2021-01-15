# Cminus2

cm2 - a mini C compiler for ziprisc1

or maybe this needs to be WeakJava (.wj) and wjc (compiler)
cm2 the Cminus2 compiler.

Compiles Cminus2 code into zas assembly code.

the output (stdout) should be put into a `.zas` file.

```
$ cm2 < hello.cm2 > hello.zas
$ zas hello.zas > hello.zex
$ zrisc hello.zex
hello
```

Or something like that.
