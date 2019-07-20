#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
    for(int num=1;num<=n;num+=2)
    {
      if(num%2!=0)
      {
      printf("%d\n",num);
    }
    }
	return 0;
}