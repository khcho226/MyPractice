#include <algorithm>
#include <string>
#include <vector>

using namespace std;

string solution(string myString) {
    transform(myString.begin(), myString.end(), myString.begin(), ::toupper);
    
    return myString;
}