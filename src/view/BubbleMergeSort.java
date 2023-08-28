package view;

import java.util.Arrays;
import br.edu.fateczl.ordenacao.bubblesort.*;

public class BubbleMergeSort {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		
		
		int[] array_vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		
		System.out.printf("Exercicio 1.BubbleSort \n\tSem misturar: %s\n", 
				Arrays.toString(array_vetor));
		
		bs.BubbleSort(array_vetor);
		
		
		System.out.printf("/tOrganizado: %s\n",
				Arrays.toString(array_vetor));
		
		int[] array_vetor1 = {44, 43, 42, 41, 40, 39, 38};
		
		System.out.printf("Exercicio 2.BubbleSort\n\t Sem misturar: %s\n", 
				Arrays.toString(array_vetor1));
		
		bs.BubbleSort(array_vetor1);
		System.out.printf("\tOrganizado: %s/n",
				Arrays.toString(array_vetor1));
		}
		
		
	}



