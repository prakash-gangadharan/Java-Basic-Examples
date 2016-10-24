#!/bin/bash
echo '#########################################################'
echo -e '\t\t\t' If Elif Else
echo -e '#########################################################\n'

if [ $1 -ge 10 ]
then
   echo 'message 1 : entered value is greater'
elif [ $2 == 'yes' ] 
then
   echo 'message 2 : entered value is yes'
else 
   echo 'message 3 : nothing matched'
fi

echo -e '\n#########################################################'
echo -e '\t\t\t' Boolean Operations
echo '#########################################################'

# and example
if [ -r $3 ] && [ -s $3 ]
then
   echo this file usefull
else
   echo this file not usefull
fi

# or example

echo $USER
if [ $USER == 'prakash' ] || [ $USER == 'LT0040' ]
then
   ls -lsh   
else
   echo It is not a user
fi
