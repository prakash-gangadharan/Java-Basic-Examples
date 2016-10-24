#!/bin/bash

echo '#############################################################'
echo -e '\t\t\t' Let
echo '#############################################################'


echo 'hello'
let a=5+4
echo a=5+4 : $a

let "a=5+4"
echo "\"a=5+4\"" : $a

let a++
echo a++ : $a

let a=4*5
echo a=4*5 : $a

let "a=4*5"
echo \""a=4*5\"" : $a

let a=$a+10
echo "a=\$a+10" : $a

let "a=$a+10"
echo "\"a=\$a+10\"" : $a

echo '###############################################################'
echo -e '\t\t\t' Expr
echo '###############################################################'

echo expr \"5+4\" 
expr "5+4"

echo expr 5+4 
expr 5+4

echo expr 5 + 4 
expr 5 + 4

echo expr 5 \* 2 
expr 5 \* 2 

echo expr 5 / 2
expr 5 / 2

echo expr 11 % 2
expr 11 % 2

a=$(expr 10 - 3)
echo $a

echo '###############################################################'
echo -e '\t\t\t' Double Parentheses
echo '###############################################################'
# Basic arithmetic operations using double parentheses

a=$((4 + 6))
echo a=\$\(\(4 \+ 6\)\)
echo $a

a=$((4+6))
echo a=\$\(\(4\+6\)\)
echo $a

b=$((a+3))
echo $b

b=$(($a+3))

echo $b

((b++))
echo $b

((b += 3))
echo $b

c=$(($b * 2))
echo $c

d=$((8%2 == 0))
echo $d
echo '##################################################################'
echo -e '\t\t\t' Length of a Variable
echo '##################################################################'

a='hello world'
echo $a
echo ${a}
echo ${#a}
b=12345678
echo ${#b}


