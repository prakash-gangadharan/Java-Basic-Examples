#!/bin/bash
echo '#########################################################'
echo -e '\t\t\t' If Elif Else
echo -e '#########################################################\n'

# or example

echo $USER
if [ $USER == 'prakash1' ] || [ $USER == 'LT0040' ]
then
   ls -lsh   
else
   if [ $USER == 'prakash' ]
   then
       echo It is a user prakash.
   fi
       echo It is not a user
fi
