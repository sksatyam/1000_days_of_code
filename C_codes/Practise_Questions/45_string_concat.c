// Write a program to concatinate two strings
#include<stdio.h>
#include<string.h>

int main(){
    void conc(char*,char*);
    char st1[25]= "Kutta ",st2[25] = "Harami";
    conc(st1,st2);
    for (int i=0;i<25;i++){
        printf(" %c", st1[i]);
    }
    return 0;

}
void conc(char st1[], char st2[]){
    int j,i;
    j = strlen(st1);
    for (i=0;st2[i] != '\0';i++){
        st1[(j+i)] = st2[i];
    }
    st1[j] = '\0';
}
