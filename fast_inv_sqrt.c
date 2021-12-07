#include <math.h>

//Faster version of
//float y = 1 / sqrt(x)

float q_rsqrt(float number) 
{
    long i;
    float x2, y;
    const float threehalfs = 1.5F;
      
    x2 = number * 0.5F;
    y = number;
    i = * ( long * ) &y;          //evil floating bit hack
    i = 0x5f3759df - ( i >> 1 );  //lol
    y = * ( float * ) &i; 
    y = y * ( threehalfs - (x2 * y * y) );
    //
    return y; 
}
