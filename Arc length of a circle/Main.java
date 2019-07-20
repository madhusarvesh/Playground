#include<stdio.h>
int main()
{
float r,angle,l;
scanf("%f%f",&r,&angle);
l=2*3.14*r*(angle/360);
printf("%0.2f",l);
return 0;
}