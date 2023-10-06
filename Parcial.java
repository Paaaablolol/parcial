
public class Parcial { 

    public static void main(String[] args) {

        
        int numHoteles = (int) (Math.random()* 7+1);
        
        int[] numeroPisos = new int[numHoteles];
        for (int i = 0; i < numeroPisos.length; i++) {
            numeroPisos[i] = (int) (Math.random()*12+3);
            
        }

        int[] tipoLuces = new int[numHoteles];
        for (int i = 0; i < tipoLuces.length; i++) {
            tipoLuces[i] = (int) (Math.random()*3+1);
            
        }

        int[] horasLuces = new int[numHoteles];
        for (int i = 0; i < horasLuces.length; i++) {
            horasLuces[i] = (int) (Math.random()*23+1);
            
        }
        
        for (int i = 0; i < horasLuces.length; i++) {
            System.out.println("Hotel " + (i+1) + ". Cantidad de horas encendidas " + horasLuces[i]);
        }


        for (int i = 0; i < numHoteles; i++) {

            if (tipoLuces[i]==1) {

                double precioHora = numeroPisos[i]*(3)*(0.25);

                double precioTotal = precioHora*horasLuces[i];
                System.out.println("Hotel " + (i+1) + ". gasto total es de " + precioTotal);
                
            } else if(tipoLuces[i]==2) {

                double precioHora =  numeroPisos[i]*(3)*(0.5);

                double precioTotal = precioHora*horasLuces[i];
                System.out.println("Hotel " + (i+1) + ". gasto total es de " + precioTotal);
                
            }

            else if(tipoLuces[i]==3) {

                double precioHora = numeroPisos[i]*(3)*(1);

                double precioTotal = precioHora*horasLuces[i];
                System.out.println("Hotel " + (i+1) + ". gasto total es de " + precioTotal);
                
            }

        } 
    }
}

