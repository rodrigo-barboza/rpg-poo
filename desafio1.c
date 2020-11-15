#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int i, contador,contsimb;
char frase[100];

// DICION�RIO:
/*
	Os conectivos l�gicos s�o representados por: v,^,~,> e <>. Elas significam, respectivamente: OU, E, N�O, SE, SE E SOMENTE SE.
	Os elementos l�gicos s�o representados UNICAMENTE por letras MAI�SCULAS.
	Os elementos \"True e False\" s�o representados, respectivamente, pelas letras min�sculas \'t\' e \'f\';
	O Conectivo de NEGA��O deve antes do que se deseja ser negado: ~P ou ~(P^Q).
	A frase dever� ser escrita de maneira cont�nua, ou seja, sem utiliza��o do espa�o na demarca��o da mesma.
	
*/

int classificarchar(char q)
{
	if((q>=65 && q<=90) || q =='t' || q =='f')
		{contsimb+=1;return 1;}
	else
		if(q == 'v'|| q == '^'|| q == '>')
			return 2;
		else
			if(q == '<')
				return 3;
			else
				if(q == '(' || q == ')')
					return 4;
				else
					if(q == '~')
						return 5;
					else
						return 6;
}

void errolog()
{
	printf("\nHouve um erro de logica na posicao %d da frase, voltando pro ponto de inicio:", i+1);
	main();
}

void verificarlog1()
{
	if(frase[i+1] != ')' && frase[i+1] != 'v' && frase[i+1] != '^' && frase[i+1] != '>' && frase[i+1] != '<' && frase[i+1]!='\0')
		errolog();		
}

void verificarlog2()
{
	if((frase[i+1]<65 || frase[i+1]>90) && frase[i+1] != '(' && frase[i+1] != '~' && frase[i+1] != 't' && frase[i+1] != 'f')
		errolog();
}

void verificarlog3()
{
	if(frase[i+1] != '>')
		errolog();
}

void verificarlog4(char q)
{
	if(q == '('){
		contador++;
		if(frase[i+1] != '~' && (frase[i+1] <65 && frase[i+1] >90) && frase[i+1] != 't' && frase[i+1] != 'f' && frase[i+1] != '(')
			errolog();
	}
	else{
		contador--;
		if(frase[i+1] != ')' && frase[i+1] != '>' && frase[i+1] != '<' && frase[i+1] != 'v' && frase[i+1] != '^' && frase[i+1] != '\0')
			errolog();
	}
	if(contador<0)
		errolog();
}

void verificarlog5()
{
	if(frase[i+1] != '(' && (frase[i+1] <65 || frase[i+1] >90 ) && frase[i+1]!= '~' && frase[i+1] != 't' && frase[i+1] != 'f')
		errolog();
}


int main()
{
	int verificar;
	char x;
	contador=0; contsimb=0;
	//setlocale(LC_ALL, "Portuguese");
	printf("\n\nCaso queira encerrar o programa, insira apenas 0 (zero)");
	printf("\nEscreva uma frase proposicional a ser analisada: ");
	scanf("%s",&frase);
	x=frase[0];
	while(frase[0]!='0'){
	if(frase[0]!='~' && (frase[0] < 65 || frase[0] > 90) && frase[0]!='(' && frase[0]!='t' && frase[0]!='f'){
		printf("Nao houve frase inserida ou o inicio esta adulterado, reiniciando o programa.\n");
		main();}
	else
	{
		for(i=0; x!='\0';i++,x=frase[i])
		{
			verificar = classificarchar(x);
			switch(verificar)
			{
				case 1:
					verificarlog1();
					break;
				case 2:
					verificarlog2();
					break;
				case 3:
					verificarlog3();
					break;
				case 4:
					verificarlog4(x);
					break;
				case 5:
					verificarlog5();
					break;
				default:
					printf("\nAlgum caracter nao especificado no Dicionario foi encontrado.");
					printf("\nComo tal nao deveria ocorrer, insira outra frase pra recomecar: ");
					main();
			}
		}
		if(contsimb==0)
		{
			printf("\nNao foi inserido nenhum simbolo proposicional, logo, nao eh uma frase valida");
			printf("\nReiniciando programa: \n");
			main();
		}
		else{
			if(contador!=0){
				printf("\nFaltou o parenteses em alguma posicao da frase, logo, ela eh invalida.");
				printf("\nReiniciando o programa: \n");
				main();
			}
			else
				{printf("\nA frase proposicional eh logica e valida.\n");
				main();}
		}
	}
	}
	return 0;
}
