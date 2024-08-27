// #include<iostream>
// using namespace std;
// int main(){
//     int arrsize,tnum;
//     cout<<"Enter the Size of the Array: ";
//     cin>> arrsize;
//     int arr[arrsize];
//     cout<<"Enter the Elements: ";
//     for (int i = 0;i<arrsize;i++){
//         cin >> arr[i]; 
//     }
//     cout<< "Enter the Targeted Number: ";
//     cin>>tnum;
//     for (int i = 0;i<arrsize;i++){
//         for(int j = 0;j<arrsize;j++){
//             if(i!=j){
//                 if((arr[i]+arr[j]) == tnum){
//                     cout <<" "<< i << j;
//                 }
//             }
//         }
//     }

//     return 0;
// }




//  Improved code version
#include<iostream>
using namespace std;

int main() {
    int arrsize, tnum;
    cout << "Enter the Size of the Array: ";
    cin >> arrsize;

    int arr[arrsize];
    cout << "Enter the Elements: ";
    for (int i = 0; i < arrsize; i++) {
        cin >> arr[i];
    }

    cout << "Enter the Targeted Number: ";
    cin >> tnum;

    bool foundPair = false;

    for (int i = 0; i < arrsize; i++) {
        for (int j = i + 1; j < arrsize; j++) {
            if ((arr[i] + arr[j]) == tnum) {
                cout << "Pair found at indices: " << i << " " << j << endl;
                foundPair = true;
            }
        }
    }

    if (!foundPair) {
        cout << "No pair found with the given target number." << endl;
    }

    return 0;
}
