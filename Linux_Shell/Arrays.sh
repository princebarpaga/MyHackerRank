#! /bin/bash

#ARRAYS IN BASH

#Given a list of countries, each on a new line, your task is to read them into an array 
#and then display the entire array, with a space between each of the countries' names.
while read line
do
    array=("${array[@]}" $line)
done

echo ${array[@]}

#Given a list of countries, each on a new line, your task is to read them into an array. Then slice the array and display only the elements lying between positions 3 and 7 
while read line
do
    array=("${array[@]}" $line)
done

#select 5 elements from index 3
echo ${array[@]:3:5} 

#You are given a list of countries, each on a new line. Your task is to read them into an array and then filter out (remove) all the names containing the letter 'a' or 'A'.
#this while loop reads the input array for the user
while read word; do
    array=(${array[@]} $word)
done

#this for loop goes through the list and find the matches using grep 
for i in ${array[@]}; do
    if (echo $i | grep 'A' > /dev/null); then
        continue
    elif (echo $i | grep 'a'> /dev/null); then
        continue
    else
        echo $i
    fi
done 

#Given a list of countries, each on a new line, your task is to read them into an array. Then, concatenate the array with itself (twice) 
#to read the array one entry per line
readarray -t countries
#to concatenate two times
countries+=( "${countries[@]}" "${countries[@]}" )
echo ${countries[@]}

#Given a list of countries, each on a new line, your task is to read them into an array and then display the element indexed at 3. Note that indexing starts from 0.
readarray -t countries

echo ${countries[3]}

#The first capital letter (if present) in each element of the array should be replaced with a dot ('.'). Then, display the entire array with a space between each country's names.
readarray -t countries

echo ${countries[@]/?/.}