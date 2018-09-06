#!/bin/sh

echo 'Running tests'
echo 'adding 5 and 6 should output 11'
if [ $(./sum.sh 5 7) -ne 12 ]
  then
	exit 1
fi