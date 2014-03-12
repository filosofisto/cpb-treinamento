package br.org.cpb.laboratorio;

public class Lab {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Informe os valores");
			System.exit(-1);
		}

		float total = 0, totalPond = 0;
		int atual, totalPesos = 0;
		
		for (int i = 0; i < args.length; i++) {
			atual = Integer.parseInt(args[i]);
			total = total + atual;
			if (atual % 2 == 0) {
				totalPond = totalPond + atual*2;
				totalPesos = totalPesos + 2;
			} else {
				totalPond = totalPond + atual*3;
				totalPesos = totalPesos + 3;
			}
		}
		
		float media = total / args.length;
		float mediaPond = totalPond / totalPesos;
		
		System.out.printf("Soma: %.2f, Media: %.2f, Media Pond.: %.2f", 
				total, media, mediaPond);
	}

}
