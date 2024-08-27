#include<iostream>
#include<vector>
using namespace std;
void printvec(vector<int> vec){
    for(int x:vec){
        cout<<x<<" ";
    }
    cout<<endl;
}
int main(){


    // this is the way to declear a vector if we wnat to provide the length of the vbector then we can write the size of the vector in parenthesis here for now i only created a integer type vector but the vector can be any primitive data type
    vector<int> firstvec;
    vector<int> sizevec(10);


    // This is the way to initalize a vector
    firstvec = {1,2,3,4};


    // The below code will declear and initalize a vector at the same time but here the length of the vrctor will be 4 and the all the elements will be initalized with integer value 5 
    vector <int> secvec(4,5);
    // for (int x:secvec){
    //     cout<<x<<endl;
    // }
    printvec(secvec); // function not working
    cout<<endl;
  
  
    // This is the another way to declear and initalize a vector at the same time
    vector<char> thirdvec{'a','e','i','o','u'};
    for (char x:thirdvec){
        cout<<x<<endl;
    }
    cout<<endl;



    // Here I used a for each loop for iterating the vector
    for (int ele:firstvec){
        cout<< ele<<endl;
    }




    // Now Some Basic operations on vectors

    // Push element at the end of the vector
    vector <int> fourvec{1,2,3,4};
    fourvec.push_back(5); // this method is used to push element at the end of the vector
    fourvec.insert(fourvec.begin()+2,6); // This function is used to insert any element in the vector at any position this thkes two arguments first is the position where we want to insert element with respect to first element and here begin method gives us the position and then we used the +2 which means we are inserting element at the second position with respect to the first elements position and the secon argument is the value that we want to insert
    printvec(fourvec);
    cout<<"after pop and erase"<<endl;
    fourvec.pop_back();
    printvec(fourvec);
    fourvec.erase(fourvec.begin()+2); // In case of insert and erase we can also use position related to the end element
    printvec(fourvec);
    cout<<"After v.clear!";
    fourvec.clear();
    printvec(fourvec);
    vector<int>fivevec{1};
    fivevec.push_back(2);
    fivevec.push_back(3);
    fivevec.push_back(4);
    fivevec.push_back(5);
    fivevec.resize(10); // this method is used to resize a vector
    cout<<"size of the vector: "<< fivevec.size()<<endl;
    cout<<"Capacity of the vector: "<< fivevec.capacity()<<endl; // capacity of the vector increases to the power of 2



// Looping in Vector

    vector <int> sixvec;
    int ele;
    for(int i = 0; i<5;i++){
        cin>>ele;
        sixvec.push_back(ele);

    }
    printvec(sixvec);
    cout<<endl;

    // Taking input in an vector in the same way of array;

    vector <int> vecsev(10);
    for(int i =0;i<vecsev.size();i++){
        cin>>vecsev[i]; // we can only use this method of taking input when we explicetly mentioned the size of the vector because if we doesnt mentions the size then the vector which is create is size of 0 so there is no index in that case to we have to use push_back() method 

    }
    printvec(vecsev);

    return 0;
}