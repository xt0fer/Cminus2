# Cminus2

cm2 the Cminus2 compiler.

Compiles Cminus2 code into zas assembly code.

the output (stdout) should be put into a `.zas` file.

The output file should have three sections to it:

- a `.TX` segment where all the instructions go.
- a `.DD` segment for any static data
- a `.ST` segment for the base of the main stack

the stack grows downward in the address space.


### Exercises with code base.

#### Add more control structures

- for loop
- repeat...until loop
- switch statement

#### Add more data types

- a floating point type
- a list
- a dictionary/map
- a struct/record type

#### Add interfaces

- a composable set of functions tied to a user type

