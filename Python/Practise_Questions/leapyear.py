# Write a program to take a year as an input from the user and then display whether the following year is a leap year or not.
userInput = int(input("Enter a year: "))
if userInput % 4 == 0:
    if userInput % 100 == 0:
        if userInput % 400 == 0:
            print("This year is a leap year")
        else:
            print("This is not a leap year")
    else:
        print("This year is a leap year.u")
else:
    print("The year is not a leap year.")