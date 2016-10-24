#!/bin/bash

echo '#########################################################################'
echo -e ' \t\t\t '  Special Variables
echo '#########################################################################'

echo 'trate variable scope 1.0 -' The name of the Bash script: $0
echo '$1 -' The first 9 arguments to the Bash script: $1
echo '$# -' How many arguments were passed to the Bash script: $#
echo '$@ -' All the arguments supplied to the Bash script: $@
echo '$? -' The exit status of the most recently run process: $?
echo '$$ -' The process ID of the current script: $$
echo '$USER-' The username of the user running the script: $USER
echo '$HOSTNAME -' The hostname of the machine the script is running on: $HOSTNAME
echo '$SECONDS -'  The number of seconds since the script was started: $SECONDS
echo '$RANDOM -' Returns a different random number each time is it referred to: $RANDOM
echo '$LINENO -' Returns the current line number in the Bash script: $LINENO

echo '#########################################################################'
echo -e ' \t\t\t '  simplevariables
echo '#########################################################################'

myvariables=hello
anothervar='bash script' #using quotes
echo $myvariables $anothervar
sampledir=/home/prakash/Java_Topics_And_Examples/Java_All_Examples/Scripts_Examples
echo exit status $?
ls -lh $sampledir

echo '#########################################################################'
echo -e ' \t\t\t '  using quotes
echo '#########################################################################'

myvar='hello world'
echo $myvar
newvar="More $myvar"
echo $newvar
newvar='More $myvar'
echo $newvar
home=~
echo home path is: $home


echo '#########################################################################'
echo -e ' \t\t\t '  Command Substitution
echo '#########################################################################'

myvar=$(ls | wc -l)
echo There are $myvar entries in the directories ~/

myvar=$(ls -lh)
echo $myvar

echo '#########################################################################'
echo -e ' \t\t\t '  Exporting Variables
echo '#########################################################################'

# demonstrate variable scope 1.

var1=blah
var2=foo

# Let's verify their current value

echo $0 :: var1 : $var1 , var2 : $var2

export var1
export var2
./_2_script.sh


# Let's see what they are now

echo $0 :: var1 : $var1 , var2 : $var2


