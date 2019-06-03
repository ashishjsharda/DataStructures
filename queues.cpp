/******************************************************************************

 Using Queues
 @author asharda

 *******************************************************************************/

#include <iostream>
#include<queue>
using namespace std;

        int
        main ()
        {
        queue < int >sampqueue;
        sampqueue.push (0);
        sampqueue.push (1);
        sampqueue.push (2);
        while (!sampqueue.empty ())
        {

        cout << "\n" << sampqueue.front ();
        sampqueue.pop ();
        }


        return 0;
        }
