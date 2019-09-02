//GCD.c
//Aaron Hom
//awhom
//lab8
//Finds the GCD of 2 positive integers

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main(void){
  int a, b, a2, b2, c;
  int n = 1;
  int m = 2;
  char str[200];

  printf("Enter a positive number: ");

  while(n==1){
    scanf("%s", str); 
    if(isInteger(str)){
      sscanf(str, "%d", &a);        
      a2 = a;
      n = 3;
      break;
    }
    printf("Please enter a positive number: ");
    continue;
  }

printf("Enter another positive number: ");

  while(m==2){
    scanf("%s", str);
    if(isInteger(str)){
      sscanf(str, "%d", &b);     
      b2 = b;
      m = 4;
      break;
    }
    printf("Please enter a positive number: ");
    continue;
    }

  c = gcd(a2, b2);

  printf("The GCD of %d and %d is %d\n", a2, b2, c );
  
  return 0;
}

int gcd(int x, int y){
  int r;
    while(r > 0){
      r = x%y;
      x = y;
      y = r;
      if(r == 0){
	return x;
      }else{
      return 0;
    }
  }
}
int isInteger(char s[]){

  int i, h;
   
  if( s==NULL ) 
    return 0;
  h = strlen(s);

  if( h==0 ) 
    return 0;

  if( s[0]!='-' && s[0]!='+' && !isdigit(s[0]) )
    return 0;

  for(i=1; i<h; i++){
    if( !isdigit(s[i]) ) 
      return 0;
  }
  return 1;
}
