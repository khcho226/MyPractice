#include <string>
#include <vector>

using namespace std;

string solution(string rsp) {
    string answer = "";
    
    for (char c : rsp) {
        if (c == '2') {
            answer += '0';
        } else if (c == '5') {
            answer += '2';
        } else {
            answer += '5';
        }
    }
    
    return answer;
}