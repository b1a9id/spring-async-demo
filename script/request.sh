#!/bin/bash

number=1

while true;
do
  curl -X POST -H "Content-Type: application/json" -d '{"number" : "'$number'"}'  http://localhost:8080/async
  echo ''
  number=$(expr $number + 1)
done
