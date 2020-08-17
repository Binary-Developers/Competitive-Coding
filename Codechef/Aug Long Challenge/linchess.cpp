#include<bits/stdc++.h>

using namespace std;
typedef long long ll;
#define fio  ios_base::sync_with_stdio(0);cin.tie(NULL);
int main()
{ fio
int t;
std::cin >> t;
while(t--){
    ll n,k,nos,nosmin=1000000000,ans;
    std::cin >> n>>k;
    ll p[n];
    for(int i=1;i<=n;i++){
        std::cin >> p[i];
    }
    int flag=1;
    for(int i=1;i<=n;i++){
        if(p[i]<=k&&k%p[i]==0){
            flag=0;
            nos=k/p[i];
            if(nos<nosmin){
            nosmin=nos;
            ans=p[i];
            }
            
        }
    }
    
    if(!flag)
    std::cout << ans << std::endl;
    else
    std::cout << -1 << std::endl;
    
    
}
    return 0;
}
