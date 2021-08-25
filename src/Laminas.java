import java.util.*;


public class Laminas {
    public static ArrayList<Integer> stringToArray (String Arreglo){
        String [] Separado = Arreglo.replaceAll("\\[", "").replaceAll("]", "").split(",");

        ArrayList<Integer> Lista = new ArrayList<Integer> ();

        for (int i = 0; i < Separado.length; i++){
            Lista.add(Integer.valueOf(Separado[i]));
        }
        return Lista;
    }
    public static ArrayList<Integer> clases(ArrayList<Integer> Lista_laminas){
        ArrayList<Integer> Retorno1 = new ArrayList<Integer>();

        for (int i =0; i<Lista_laminas.size(); i++){          
            if (!Retorno1.contains(Lista_laminas.get(i))) {
                Retorno1.add(Lista_laminas.get(i));
            }
        }
        return Retorno1;
    }
    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> Faltan,ArrayList<Integer>  Lista_laminas, int Lamina){
        ArrayList<Integer> Retorno2 = new ArrayList<Integer>();

        for (int i =0; i<Faltan.size(); i++){          
            if (Lista_laminas.get(Faltan.get(i)) == Lamina){
                Retorno2.add(Faltan.get(i));
            }
        }
        return Retorno2;
    }
    public static ArrayList<Integer> noTengo(ArrayList<Integer> Lamina1,ArrayList<Integer>  Lamina2){
        ArrayList<Integer> Retorno3 = new ArrayList<Integer>();

        for (int i =0; i<Lamina1.size(); i++){          
            if (!Lamina2.contains(Lamina1.get(i))){
                Retorno3.add(Lamina1.get(i));
            }
        }
        return Retorno3;
    }
    public static Integer puedoCambiar(ArrayList<Integer> Lamina1,ArrayList<Integer>  Lamina2){
        Integer Retorno4, cont1, cont2;
        cont1=0;
        cont2=0;
        
        for (int i =0; i<Lamina2.size(); i++){          
            if (!Lamina1.contains(Lamina2.get(i))){
                cont1 = cont1 +1;
            }
        }
        for (int i =0; i<Lamina1.size(); i++){          
            if (!Lamina2.contains(Lamina1.get(i))){
                cont2 = cont2 +1;
            }
        }
        if (cont1<cont2){
            Retorno4 = cont1;
        }else{
            Retorno4 = cont2;
        }
        return Retorno4;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String SFaltan = sc.nextLine();
        String SLista_laminas = sc.nextLine();
        
        ArrayList<Integer> Faltan = stringToArray(SFaltan);
        ArrayList<Integer> Lista_laminas = stringToArray(SLista_laminas);
      

        Integer resutlado = puedoCambiar(Faltan, Lista_laminas);

        System.out.println(resutlado);
        
    }
    
}
