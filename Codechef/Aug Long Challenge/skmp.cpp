#include<bits/stdc++.h> 
using namespace std; 
#define fio  ios_base::sync_with_stdio(0);cin.tie(NULL);
const int MAX_CHAR = 26; 

void solver(string &str,string &pp) 
{   char pb=pp[0];
    int aib=0;
     int x=0;
    while(pp[x]==pp[x+1]){
        x++;
    }
    
    if(pp[x]<pp[x+1])
    aib=1;
    
	int charCount[MAX_CHAR] = {0}; 
	

	for (int i=0; i<str.length(); i++) 

	
		charCount[str[i]-'a']++;
		
	for(int i=0;i<pp.length();i++)
	   charCount[pp[i]-'a']--;
	

	int flag=1;
	char ans;
	
	if(aib){
	for (int i=0;i<MAX_CHAR;i++) 
		for (int j=0;j<charCount[i];j++) 
			{ans= (char)('a'+i); 
			if(flag&&int(pb)<int(ans)){
			    flag=0;
			    cout<<pp;
			}
			cout<<ans;
			}
	}
	else{
	    for (int i=0;i<MAX_CHAR;i++) 
		for (int j=0;j<charCount[i];j++) 
			{ans= (char)('a'+i); 
			if(flag&&int(pb)<=int(ans)){
			    flag=0;
			    cout<<pp;
			}
			cout<<ans;
			}
	}
	if(flag)
	cout<<pp;
} 

int main() 
{  fio
    int t;
    cin>>t;
    while(t--){
	string s,p;	 
	cin>>s>>p;
	solver(s,p);
	cout<<"\n";
    }
	return 0; 
} 
