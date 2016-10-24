#!/bin/bash
# demonstrate variable scope 2

# Let's verify their current value
echo $0 :: var1 : $var1, var2 : $var2

# Lets change their value

var1=flop
var2=bleh

echo $0 :: var1 : $var1, var2 : $var2
