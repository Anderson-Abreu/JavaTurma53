package VetoresEMatrizes;

public class ExemploMatriz {

	public static void main(String[] args) {
	
		int m[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};//matriz preenchida
		int m1[][] = new int[4][3];//matriz vazia
		
		m[1][1]=20;
		
		for(int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
				System.out.print(m[linha][coluna]+"\t");
			System.out.println();
		}
	}

}
