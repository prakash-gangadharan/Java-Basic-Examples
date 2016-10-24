#!/bin/bash

echo '#########################################################################'
echo  -e '\t\t\t' Ask the User for Input
echo '#########################################################################'

echo Hello, who I am talking to?
read varname
echo It\'s nice to meet you $varname

echo '#########################################################################'
echo -e '\t\t\t' More with Read
echo '#########################################################################'


# Ask the user for login details
read -p 'Username: ' uservar
read -sp 'Password: ' passvar
echo " "
echo Thankyou $uservar , we now have your credentials


echo '#########################################################################'
echo -e '\t\t\t' More variables
echo '#########################################################################'

# Demonstrate how read actually works

echo what server do you like?

read svr1 svr2 svr3

echo your first server : $svr1
echo your second server : $svr2
echo your third server : $svr3

echo '#########################################################################'
echo -e '\t\t\t' Reading from STDIN
echo '#########################################################################'



