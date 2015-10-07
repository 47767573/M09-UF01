#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
 
int main()
{
/*
 * Fitxer que teoricament rep una cadena del stdin
 * la transforma en mayúscules i finalment 
 * o envia pel stdout.
 * */

   char cadena[] = "Ejemplo";
   int i = 0;
	
	wait(&i);
	wait(&i);
	
	fgets(cadena,20,stdin);
 
   for(i = 0; cadena[i]; i++){
      if(cadena[i] >= 'a' && cadena[i]<='z'){
			cadena[i] -= 32;
		}
	}

    printf("\n");
    fprintf(stdout, "%d",8);
    fflush(stdout);
    printf("%s",cadena);
    return EXIT_SUCCESS;
    
}
