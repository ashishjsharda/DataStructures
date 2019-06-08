/******************************************************************************

 Using Maps in  C++ 
 @author asharda

 *******************************************************************************/

#include <iostream>
#include<iterator>
#include<map>
using namespace std;

        int main()
        {
        cout<<"Using Maps"<<"\n";
        map<int,int> nummarks;
        nummarks.insert(pair<int,int>(1,45));
        nummarks.insert(pair<int,int>(2,85));
        nummarks.insert(pair<int,int>(3,65));
        nummarks.insert(pair<int,int>(4,55));
        map<int,int>::iterator itr;
        for(itr=nummarks.begin();itr!=nummarks.end();++itr)
        {
        cout<<"\t"<<itr->first <<"\t"<<itr->second<<"\n";
        }
        return 0;
        }
