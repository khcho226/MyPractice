#include <string>
#include <vector>

using namespace std;

int solution(int slice, int n) {
    return (slice + n - 1) / slice;
}