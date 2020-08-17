#include<stdio.h>

using namespace std;
int main()
{ 
int t;
scanf("%d",&t);
while(t--){
    long long pa,pb; 
    int ba,bb;
    scanf("%lld %lld",&pa,&pb);

   
    ba=(pa+8)/9;
    bb=(pb+8)/9;
    // ba=ceil(pa/9);
    // bb=ceil(pb/9);
    
    if(ba<bb)
        printf("0 %d\n",ba);
    else
        printf("1 %d\n",bb);    
    
}
    return 0;
}
