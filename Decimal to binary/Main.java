#include<stdio.h>
#include<math.h>

long long convertDecimalToBinary(int n);
int main()
{
int n;
scanf("%d",&n);
printf("%lld",convertDecimalToBinary(n));
return 0;
}
long long convertDecimalToBinary(int n)
{
long long binaryNumber=0;
int remainder, i=1, step=1;
while(n!=0)
{
  remainder=n%2;
step++;
n/=2;

binaryNumber+=remainder*i;
i*=10;
}
return binaryNumber;
}