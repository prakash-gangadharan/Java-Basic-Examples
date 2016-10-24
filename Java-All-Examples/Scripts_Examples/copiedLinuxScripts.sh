#!/bin/bash

echo '$0 -' The name of the Bash script: $0
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
