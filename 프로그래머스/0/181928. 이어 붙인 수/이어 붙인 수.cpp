#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    string num1 = "";
    string num2 = "";
    
    for (int n : num_list) {
        if (n % 2) {
            num1 += to_string(n);
        } else {
            num2 += to_string(n);   
        }
    }
    
    return stoi(num1) + stoi(num2);
}