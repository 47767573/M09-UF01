#include <stdio.h>
#include <stdlib.h>

int main()
{
    int seed = time(NULL);
    srand(seed);
    int value = 0;
    value =rand()%10+1;
    printf("value is %d\n", value);
    fprintf(stdout, "%d",value);
    return EXIT_SUCCESS;
}
