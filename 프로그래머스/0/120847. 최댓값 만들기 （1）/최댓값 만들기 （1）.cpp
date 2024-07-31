#include <algorithm>
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    sort(numbers.begin(), numbers.end());
    
    return numbers[numbers.size() - 1] * numbers[numbers.size() - 2];
}