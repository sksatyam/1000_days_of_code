// Write a prograsm to check a string palendrome or not
#include<stdio.h>
#include<string.h>
int main(){
    char str[50],strv[50];
    printf("Enter the String that you want to check: ");
    gets(str);
    strv[50] = strrev(str);
    int com = strcmp(str, strv);
    printf("%d",com);
    // if (){
    //         printf("Your string is Palendrome!");
    //     }
    // else{
    //     printf("Your Stering is Not Pallendrome! %s ", strv);
    //     }
    return 0;
}