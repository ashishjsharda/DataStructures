/******************************************************************************

 Priority Queue in C++
 @author asharda

 *******************************************************************************/

#include <iostream>
#include<queue> ;

using namespace std;

        int main()
        {
        cout<<"Hello World";
        priority_queue<int> pq;
        pq.push(10);
        pq.push(20);
        pq.push(30);
        cout<<"Queue seen is";
        while(!pq.empty())
        {
        cout<<"\n"<<pq.top();
        pq.pop();
        }

        return 0;
        }
