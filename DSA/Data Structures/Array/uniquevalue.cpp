// // Find the unique number in a given array where all the elements are being repeted twice with one value being unique
// #include<iostream>
// using namespace std;
// int uniquefinder(int arr[],int asize){

// }

// int main(){
//     int arrsize, tnum;
//     cout << "Enter the Size of the Array: ";
//     cin >> arrsize;

//     int arr[arrsize];
//     cout << "Enter the Elements: ";
//     for (int i = 0; i < arrsize; i++) {
//         cin >> arr[i];
//     }

    
//     return 0;
// }







// Using XOR bit wise operator property

#include<iostream>
using namespace std;

int findUniqueElement(int arr[], int arrSize) {
    int uniqueElement = arr[0];

    for (int i = 1; i < arrSize; i++) {
        uniqueElement ^= arr[i];
        cout << uniqueElement << endl;
    }

    return uniqueElement;
}

int main() {
    int arrSize;
    cout << "Enter the Size of the Array: ";
    cin >> arrSize;

    int arr[arrSize];
    cout << "Enter the Elements: ";
    for (int i = 0; i < arrSize; i++) {
        cin >> arr[i];
    }

    int result = findUniqueElement(arr, arrSize);

    cout << "The unique element in the array is: " << result << endl;

    return 0;
}
