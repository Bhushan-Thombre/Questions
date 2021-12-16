// https://www.hackerrank.com/challenges/c-tutorial-stringstream/problem?isFullScreen=true

#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
    vector<int> nums;
    stringstream ss(str);
    char ch;
    int temp;
    while (ss >> temp) {
        nums.push_back(temp);
        ss >> ch;
    }
    return nums;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
