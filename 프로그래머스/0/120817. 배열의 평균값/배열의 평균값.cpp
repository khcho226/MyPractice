#include <numeric>
#include <string>
#include <vector>

using namespace std;

double solution(vector<int> numbers) {
    return accumulate(numbers.begin(), numbers.end(), 0.0) / numbers.size();
}