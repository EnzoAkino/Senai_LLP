import java.util.Scanner;
import java.util.Random;
public class Dados
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    Random random = new Random();
		int Dados,qtd;
		System.out.println("Digite o número de dados:");
		Dados = leia.nextInt();
		for (int i = 1; i <=Dados; i++){
		    qtd = random.nextInt(5) + 1;
		    /*
    		+---------+     +---------+     +---------+     +---------+     +---------+     +---------+
            |         |     |    ●    |     |  ●      |     |  ●   ●  |     |  ●   ●  |     |  ●   ●  |
            |    ●    |     |         |     |    ●    |     |         |     |    ●    |     |  ●   ●  |
            |         |     |    ●    |     |      ●  |     |  ●   ●  |     |  ●   ●  |     |  ●   ●  |
            +---------+     +---------+     +---------+     +---------+     +---------+     +---------+
            */

		 
		    switch (qtd) {
		        case 1:
		            System.out.println(
		                "+---------+" + "\n" +
                        "|         |" + "\n" +
                        "|    ●    |" + "\n" +
                        "|         |" + "\n" +
                        "+---------+"
		            );
		            break;
		        case 2: 
		            System.out.println(
		                "+---------+"+ "\n" +
		                "|    ●    |"+ "\n" +
		                "|         |"+ "\n" +
		                "|    ●    |"+ "\n" + 
		                "+---------+"
		            );
		            break;
		        case 3: 
		            System.out.println(
		                "+---------+" + "\n" +
		                "|  ●      |" + "\n" + 
		                "|    ●    |" + "\n" +
		                "|      ●  |" + "\n" +
		                "+---------+"  
		            );
		            break;
		        case 4: 
		            System.out.println(
		                  "+---------+" + "\n" + 
		                  "|  ●   ●  |" + "\n" +
		                  "|         |" + "\n" +
		                  "|  ●   ●  |" + "\n" +
		                  "+---------+" 
		            );
		            break;
		        case 5: 
		            System.out.println(
		                 "+---------+" + " \n" +
		                 "|  ●   ●  |" + " \n" +
		                 "|    ●    |" + " \n" +
		                 "|  ●   ●  |" + " \n" +
		                 "+---------+" 
		            );
		            break;
		        case 6: 
		            System.out.println(
		                 "+---------+" + "\n" +
		                 "|  ●   ●  |" + "\n" +
		                 "|  ●   ●  |" + "\n" +
		                 "|  ●   ●  |" + "\n" +
		                 "+---------+"  
		                 
		            );
		            break;      
		    }
		}
	}
}


