#include<stdio.h>
#include<conio.h>

main()
{
    int i,l=2,n,op=1,par_max=1,j=-3;
    int cont_non=1,cont_par = 1;
    printf("Introduce la cantidad de numeros de la serie a mostrar\n");
    scanf("%d",&n);
    printf("La serie quedo asi: ");
    for(i=0;i<n;i++)
    {
        if(cont_non>3)
        {
            op=1;
            cont_non =1;
        }
        if(cont_par>par_max)
        {
            op=2;
            cont_par=1;
            par_max++;
        }
        if(op==1)
        {

            printf("%d, ",l);
            l=l+2;
            cont_par++;
        }
        else
        {
            printf("%d, ",j);
            j=j-2;
            cont_non++;
        }

    }
    getch();
}
