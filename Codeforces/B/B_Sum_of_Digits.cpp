#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

#define FASTIO                 \
  ios::sync_with_stdio(false); \
  cin.tie(NULL);               \
  cout.tie(NULL);

int main() {
  FASTIO

  string n;
  cin >> n;
  int num = 0;
  while (n.size() != 1) {
    long long sum = 0;
    for (char c : n) sum += c - '0';
    n = to_string(sum);
    num++;
  }
  cout << num;

  return 0;
}