/* Sphere.c */
/* Aaron Hom */
/* awhom */
/* lab7 */
/* Finds the volume and surface area from a given radius */

#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(){
    const double pi = 3.141592654; /* Defines pi*/
    double v, s, r; /* Initiates doubles*/
 
    printf("Enter the radius of the sphere: "); /* Prompts user input */
    scanf("%lf", &r); /* Scans value */
    v =4.0/3.0*pi*pow(r, 3); /* Calculates volume */
    s =4.0*pi*pow(r, 2); /* Calculates surface area */
    printf("The volume is %f ", v); /* Prints statement */
    printf("and the surface area is %f.\n", s); 
    return 0;
} 
     
