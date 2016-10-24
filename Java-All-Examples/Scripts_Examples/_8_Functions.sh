#!/bin/bash
# Basic function

print_something(){
echo Hello I am function
}

print_something
print_something

# Passing arguments to a function

print_something_arg(){
    print_something
    echo hello $1
    return 10 
}

print_something_arg Server
print_something_arg Jupiter
echo The previous function has a return value of $?

# Setting a return value to a function

lines_in_file(){
    cat $1 | wc -l
}

lines_in_file $1
num_lines=$(lines_in_file $1)
echo The file $1 has $num_lines lines in it.
echo The files $1 has $(lines_in_file $1) lines in it.

# Experimenting with variable scope

var_change (){
    local var1='local 1'
    var1='changed again'
    var2='local 2'
    echo var1 : $var1
}

var1='global 1'
var2='global 2'

echo -e 'Before function call:\n' var1 is $var1 , var2 is $var2

var_change

echo -e 'After function call:\n' var1 is $var1, var2 is $var2

# Create a wrapper around the command ls

ls (){
    command ls -lh
 #   ls -lh
 #   command ls
}

ls
