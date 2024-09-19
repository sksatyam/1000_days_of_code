echo "Hello World!" # echo command is used to print anyhing to terminal

echo "Enter a number: "
read sam	# read command is used to read data from user through terminal and here 'sam' is the variable where data will be stored

echo $sam  # if we want to access the value of the variable we need to use '$' before variable 

# if we want to take input and print the prompt in the same line then we can use -p flag with read command
read -p "Enter a String: " str
echo "$str"

