package view;
import java.util.Arrays;
import br.edu.fateczl.ordenacao.mergesort.*;

public class MergeBubbleSort {

	public static void main(String[] args) {
		MergeSort mergesort = new MergeSort();
				
		int[] array_vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		System.out.printf("Exercicio 1 MergeSort\n\t Sem ordem: %s\n" , Arrays.toString(array_vetor));
		
		if (array_vetor.length > 1) {
			mergesort.Msort(array_vetor);
		}
		
		System.out.printf("Vetor organizado: %s\n", Arrays.toString(array_vetor));
		
		int [] array_vetor1 = {44, 43, 42, 41, 40, 39, 38, 37};
		
		System.out.printf("Exercicio 1 MergeSort\n\t Sem ordem: %s\n", Arrays.toString(array_vetor1));
		if (array_vetor1.length > 1) {
			mergesort.Msort(array_vetor1);
		}
		System.out.printf("Vetor organizado: %s\n", Arrays.toString(array_vetor1));
	}
	
	
		
}
