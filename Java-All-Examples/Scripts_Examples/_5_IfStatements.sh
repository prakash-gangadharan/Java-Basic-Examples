#!/bin/bash
echo '#############################################################'
echo -e '\t\t\t'Basic If Statements
echo -e '#############################################################\n'

if [ $1 -gt 100 ]
then
    echo hey that\'s a larger number.
    pwd
fi

date

echo '#############################################################'
echo -e '\t\t\t' Nested If statements
echo -e '############################################################\n'
if [ $1 -gt 100 ]
then 
    echo hey that\'s a larger number.
    if (($1%2==0))
    then
       echo and it is also an even number 
    fi
fi


if ((0))
then 
   echo true
fi

if ((0))
then
   echo 'message 1'
else
   echo 'message 2'
fi

echo '#############################################################'
echo -e '\t\t\t' If Else
echo -e '############################################################\n'

a="${_4_arithmetic##*.}"

if ((1))
then
   nl $a
else
   nl /dev/stdin
fi


