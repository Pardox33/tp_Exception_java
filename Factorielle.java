package tpException;

public class Factorielle{
	public static void main (String[] args){
		int i, nbEntiers=0, factorielle=1, ancien;
		
		try {
            nbEntiers=Integer.parseInt("25");
       
            if(nbEntiers<0) {
    			throw new Cas1(nbEntiers+" est négatif : la factorielle d'un nombre négatif n'est pas définie");
    		}
            if(nbEntiers>=20) {
    			throw new Cas2("Entier doit etre inferieure à 20");
    		}
        } 
		catch(ArrayIndexOutOfBoundsException s) {
			System.out.println("ERREUR : Donnez en paramètre la base de la factorielle");
			return;
		}
		catch(NumberFormatException s) {
			System.out.println("ERREUR : La base de la factorielle doit être ENTIERE");
			return;
		}
		catch (Cas1 s) {
           System.out.println("ERREUR "+s.getMessage());
           return;
        }
		catch (Cas2 msg) {
            System.out.println("ERREUR : "+msg.getMessage());
            return;
        }
		
		for (i=2;i<= nbEntiers;i++){
			ancien=factorielle;
			factorielle *= i;
		}
		System.out.println(" Voila la factorielle des "
		+ nbEntiers +" premiers entiers : "+ factorielle );
	}
}
