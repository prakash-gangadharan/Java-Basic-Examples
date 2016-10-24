#!/bin/bash
echo hello world

# A simple copy script

echo arg1 : $1
echo arg2 : $2
cp $1 $2

# lets verify whether copy command worked

echo details for $2
ls -lh $2

# use below line to test 
# ./_1_mycopy.sh ./LinuxScripts.sh ./copiedLinuxScripts.sh
