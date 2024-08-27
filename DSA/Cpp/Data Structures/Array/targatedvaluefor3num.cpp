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
            for(int k = j+1; k<arrsize;k++){
                if ((arr[i] + arr[j]+arr[k]) == tnum) {

                cout << "Pair found at indices: " << i << " " << j <<" " << k<< endl;
                foundPair = true;
            }
            }
            
        }
    }

    if (!foundPair) {
        cout << "No pair found with the given target number." << endl;
    }

    return 0;
}