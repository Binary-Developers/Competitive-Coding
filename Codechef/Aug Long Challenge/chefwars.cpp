#include<bits/stdc++.h>

using namespace std;
#define fio  ios_base::sync_with_stdio(0);cin.tie(NULL);
int main()
{   fio
    int t;
std::cin >> t;
while(t--){
    int n,h,sum=0;
    std::cin >>h>> n;
    while(n){
      sum+=n;
      n/=2;
    }
    if(h>sum)
    std::cout << 0 << std::endl;
    else
    std::cout << 1 << std::endl;
}
    return 0;
}
