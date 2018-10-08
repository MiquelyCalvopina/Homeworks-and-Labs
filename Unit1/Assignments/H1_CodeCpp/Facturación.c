#include<stdio.h>
#include<windows.h>

void menu();
void menuH();
void menuHamS();
void menuHD();
void menuHC();
void menuPapas();
void menuSal();
void menuPP();
void menuPC();
void menuRef();
void menuAg();
void menuGas();
void menuVar();

int main(){
int op,h1=0,h2=0,h3=0,P1=0,P2=0,P3=0,r1=0,r2=0,a1=0,a2=0,g1=0,g2=0,g3=0,v1=0,v2=0;
int oph,opp,opr,opr1,opv;
float VHD,VPP,VABBQ;
float VHS,VHC,VSP,VPC,VACG,VASG,VG1,VG2,VG3,VNCQ,VTF;

    do {
        menu();
        scanf("%d",&op);
        system("cls");

        switch (op){
            case 1:
            //HAMBURGUESAS
                do{
                    menuH();
                    scanf("%d",&oph);
                    system("cls");

                    switch (oph){
                    case 1:
                    //HAMBURGUESAS SIMPLES
                            menuHamS();
                            scanf("%d",&h1);
                            system("cls");
                    break;
                    case 2:
                    //HAMBURGUESAS DOBLES
                            menuHD();
                            scanf("%d",&h2);
                            system("cls");
                    break;
                    case 3:
                    //HAMBURGUESAS COMPLETAS
                            menuHC();
                            scanf("%d",&h3);
                            system("cls");
                    break;
                    default: printf("");}
                }while(oph!=4);
            break;

            case 2:
            //PAPAS
                do{
                    menuPapas();
                    scanf("%d",&opp);
                    system("cls");
                    switch (opp){
                    case 1:
                            menuSal();
                            scanf("%d",&P1);
                            system("cls");
                    break;
                    case 2:
                            menuPP();
                            scanf("%d",&P2);
                            system("cls");
                    break;
                    case 3:
                            menuPC();
                            scanf("%d",&P3);
                            system("cls");
                    break;
                    default: printf("");}
                }while (opp!=4);
            break;

            case 3:
            //REFRESCOS
                do{
                    menuRef();
                    scanf("%d",&opr);
                    system("cls");

                    switch (opr){

                    case 1:
                        //AGUAS
                        do {
                            menuAg();
                            scanf("%d",&opr1);
                            system("cls");
                        switch (opr1){
                        case 1:
                                    printf("\n_____________AGUA CON GAS_____________\n");
                                    printf("\nPRECIO       $0.60");
                                    printf("\nINGRESE CUANTAS AGUAS CON GAS DESEA:\n");
                                    scanf("%d",&a1);
                                    system("cls");
                            break;
                            case 2:
                                    printf("\n____________AGUA SIN GAS______________\n");
                                    printf("\nPRECIO          $0.50");
                                    printf("\nINGRESE CUANTAS AGUAS SIN GAS DESEA:\n");
                                    scanf("%d",&a2);
                                    system("cls");

                            break;

                        default: printf("");}

                        }while(opr1!=3);
                    break;

                    case 2:
                        //GASEOSAS
                        do {
                        menuGas();
                        scanf("%d",&opr1);
                        system("cls");

                        switch (opr1){

                            case 1:

                                printf("\n_____________SPRITE_____________\n");
                                printf("\nPRECIO                   $0.60");
                                printf("\nINGRESE CUANTAS SPRITES DESEA:\n");
                                scanf("%d",&g1);
                                system("cls");

                            break;
                            case 2:

                                    printf("\n____________COCA-COLA______________\n");
                                    printf("\nPRECIO                      $0.60");
                                    printf("\nINGRESE CUANTAS COCA-COLAS DESEA:\n");
                                    scanf("%d",&g2);
                                    system("cls");

                            break;
                            case 3:

                                    printf("\n____________GALLITO______________\n");
                                    printf("\nPRECIO                    $0.60");
                                    printf("\nINGRESE CUANTAS GALLITO DESEA:\n");
                                    scanf("%d",&g3);
                                    system("cls");

                            break;
                        default: printf("");}

                        }while(opr1!=4);
                    break;
                default:  printf("");}
            }while(opr!=3);
            break;

            case 4:
            //VARIOS
                do{
                    menuVar();
                    scanf("%d",&opv);
                    system("cls");

                    switch (opv){

                    case 1:

                            printf("\n__________NACHOS CON QUESO___________\n");
                            printf("\nPRECIO              $2.50\n");
                            printf("\nINGRESE LA CANTIDAD DE NACHOS DESEADA\n");
                            scanf("%d",&v1);
                            system("cls");

                    break;
                    case 2:

                            printf("\n______________ALITAS BBQ______________");
                            printf("\nPRECIO              $5.00");
                            printf("\nINGRESE LA CANTIDAD DE NACHOS DESEADA");
                            scanf("%d",&v2);
                            system ("cls");

                    break;
                    default: printf("");}
                    }while(opv!=3);
                break;

    default: printf("");}
    }while(op!=5);
    printf("\n\t\t\tF  A  C  T  U  R  A");
    printf("\n________________________________________________________________\n");
    printf("\n    DESCRIPCIÓN           CANT.        P.UNIT         TOTAL\n");
	VHS=h1*1.50;
	printf("\n  Hamburguesa Simple       %d          1.50           %f",h1,VHS);
    VHD=h2*2;
    printf("\n  Hamburguesa Doble        %d          2.00           %f",h2,VHD);
    VHC=h3*2.50;
    printf("\n  Hamburguesa Completa     %d          2.50           %f",h3,VHC);
    VSP=P1*1.50;
    printf("\n  Salchipapas              %d          1.50           %f",P1,VSP);
    VPP=P2*2;
    printf("\n  PapiPollo                %d          2.00           %f",P2,VPP);
    VPC=P3*2.50;
    printf("\n  Papi Carne               %d          2.50           %f",P3,VPC);
    VACG=a1*0.60;
    printf("\n  Agua con gas             %d          0.60           %f",a1,VACG);
    VASG=a2*0.50;
    printf("\n  Agua sin gas             %d          0.50           %f",a2,VASG);
    VG1=g1*0.60;
    printf("\n  Sprite                   %d          0.60           %f",g1,VG1);
    VG2=g2*0.60;
    printf("\n  Coca-Cola                %d          0.60           %f",g2,VG2);
    VG3=g3*0.60;
	printf("\n  Gallito                  %d          0.60           %f",g3,VG3);
	VNCQ=v1*2.50;
	printf("\n  Nachos con queso         %d          2.50           %f",v1,VNCQ);
	VABBQ=v2*5;
	printf("\n  Alitas a la BBQ          %d          5.00           %f",v2,VABBQ);
	VTF=VHS+VHD+VHC+VSP+VPP+VPC+VACG+VASG+VG1+VG2+VG3+VNCQ;
	printf("\n_______________________________________________________________");
	printf("\n\n VALOR TOTAL DE SU FACTURA ES                        %f",VTF);
    printf("\n_______________________________________________________________\n\n");

    return 0;
}

void menu(){
    system("color 17");
    Sleep(700);
    printf("\n \t\t M  E  N  U   E L E C T R O N I C O\n");
    Sleep(700);
    printf("\n\t1. HAMBURGUESAS");
    printf("\n\t2. PAPAS");
    printf("\n\t3. REFRESCOS");
    printf("\n\t4. VARIOS");
    printf("\n\t5. FACTURAR\n");
    Sleep(700);
    printf("\n\n\t   ESCOJA UNA OPCION: ");
}
void menuH(){
    Sleep(700);
    printf("\n \t\t H A M B U R G U E S A S\n");
    Sleep(700);
    printf("\n\t1. SIMPLE        $1.50");
    printf("\n\t2. DOBLE         $2.00");
    printf("\n\t3. COMPLETA      $2.50");
    printf("\n\t4. SALIR\n");
    Sleep(700);
    printf("\n\n\t  ESCOJA UNA OPCION: ");
}
void menuHamS(){
    Sleep(700);
    printf("\n \t\tH A M B U R G U E S A    S I M P L E \n");
    Sleep(700);
    printf("\n\tPRECIO:     $1.50");
    printf("\n \n\t  INGRESE CUANTAS HAMBURGUESAS SIMPLES DESEA: ");
}
void menuHD(){
    Sleep(700);
    printf("\n\t\t H A M B U R G U E S A    D O B L E\n");
    Sleep(700);
    printf("\n\tPRECIO:     $2.00");
    printf("\n \n\t  INGRESE CUANTAS HAMBURGUESAS DOBLES DESEA: ");
}
void menuHC(){
    Sleep(700);
    printf("\n\t\t H A M B U R G U E S A   C O M P L E T A \n");
    Sleep(700);
    printf("\n\tPRECIO:     $2.50");
    printf("\n\n\t   INGRESE CUANTAS HAMBURGUESAS COMPLETAS DESEA: ");
}
void menuPapas(){
    Sleep(700);
    printf("\n\t\t P  A  P  A  S\n");
    Sleep(700);
    printf("\n\t1. SALCHIPAPAS   $1.50");
    printf("\n\t2. PAPIPOLLO     $2.00");
    printf("\n\t3. PAPICARNE     $2.50");
    printf("\n\t4. SALIR\n");
    printf("\n\n\t   ESCOJA UNA OPCION: ");
}
void menuSal(){
    Sleep(700);
    printf("\n\t\t S A L C H I P A P A S\n");
    Sleep(700);
    printf("\n\tPRECIO:           $1.50\n");
    printf("\n\n\t   INGRESE CUANTAS SALCHIPAPAS DESEA: ");
}
void menuPP(){
    Sleep(700);
    printf("\n\t\t P A P I P O L L O\n");
    Sleep(700);
    printf("\n\tPRECIO:           $2.00\n");
    printf("\n\n\t   INGRESE CUANTAS PAPIPOLLOS DESEA: ");
}
void menuPC(){
    Sleep(700);
    printf("\n\t\t P A P I C A R N E \n");
    Sleep(700);
    printf("\n\tPRECIO:           $2.50\n");
    printf("\n\n\t   INGRESE CUANTAS PAPICARNES DESEA: ");
}
void menuRef(){
    Sleep(700);
    printf("\n\t\tR E F R E S C O S \n");
    Sleep(700);
    printf("\n\t1. AGUAS      ");
    printf("\n\t2. GASEOSAS   ");
    printf("\n\t3. SALIR\n");
    printf("\n\n\t   ESCOJA UNA OPCION: ");
}
void menuAg(){
    Sleep(700);
    printf("\n\t\t A  G  U  A  S");
    Sleep(700);
    printf("\n\t1. AGUA CON GAS     $0.60");
    printf("\n\t2. AGUA SIN GAS     $0.50");
    printf("\n\t3. SALIR");
    printf("\n\n\t   ESCOJA UNA OPCION: ");
}
void menuGas(){
    Sleep(700);
    printf("\n\t\t G A S E O S A S ");
    Sleep(700);
    printf("\n\t1. SPRITE            $0.60");
    printf("\n\t2. COCA-COLA         $0.60");
    printf("\n\t3. GALLITO           $0.50");
    printf("\n\t4. SALIR");
    printf("\n\n\t   ESCOJA UNA OPCION: ");
}
void menuVar(){
    Sleep(700);
    printf("\n\t\t V  A  R  I  O  S\n");
    Sleep(700);
    printf("\n\t1. NACHOS CON QUESO   $2.50");
    printf("\n\t2. ALITAS BBQ         $5.00");
    printf("\n\t3. SALIR");
    printf("\n\n\t   ESCOJA UNA OPCION: h");
}
