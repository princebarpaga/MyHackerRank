#! /bin/bash

#Write a bash script which does just one thing: saying "HELLO".
echo HELLO

#Write a Bash script which accepts  as input and displays a greeting: "Welcome (name)"
read name
echo "Welcome $name"

#Your task is to use for loops to display only odd natural numbers from  to.
for i in {1..99}
do
    if [ $(( i % 2 )) -ne 0 ];
        then
        echo $i
    fi
done

#Given two integers, X  and Y, find their sum, difference, product, and quotient.
read X
read Y
echo $(( X + Y ))
echo $(( X - Y ))
echo $(( X * Y ))
echo $(( X / Y ))

# Given two integers, X and Y, identify whether  X<Y or X>Y  or X=Y
read X
read Y
if [[ $X -gt $Y ]]
then
    echo "X is greater than Y "
elif [[ $X -eq $Y ]]
then
    echo "X is equal to Y"
else
    echo "X is less than Y"
fi

#Read in one character from the user (this may be 'Y', 'y', 'N', 'n'). If the character is 'Y' or 'y' display "YES". If the character is 'N' or 'n' display "NO". 
#No other character will be provided as input.
read char
if [[ $char == y || $char == Y ]] 
then
    echo YES
elif [[ $char == n || $char == N ]]
then 
    echo NO
fi

#Given three integers (X,Y , and Z) representing the three sides of a triangle, 
#identify whether the triangle is Scalene, Isosceles, or Equilateral.
read X
read Y
read Z

if [[ $X == $Y  && $Y == $Z ]]
then
    echo "EQUILATERAL"
elif [[ $X == $Y || $X == $Z || $Y == $Z ]]
then
    echo "ISOSCELES"
else
    echo "SCALENE"
fi

#We provide you with expressions containing +,-,*,^, / and parenthesis. None of the numbers in the expression involved will exceed 999.
read num
printf "%.3f" $(echo $num | bc -l)

#Given  integers, compute their average correct to three decimal places.
read count

for ((x=0; x<=count-1; x++))
do
    read val
    sum=$((sum + val))
done

printf "%.3f" $(echo $sum/$count | bc -l )

