package tablashash;

public class pruevas {
    public static void main(String[] args) {
        TablasHash numeros =new TablasHash(9);
        numeros.Add("HOLA MUNDO ");
        numeros.Add("HOLA MUNDO ");
        numeros.Add("JOse ");
        numeros.Add("Maria ");
        numeros.Add("Morelos ");
        numeros.Add("Pavo ");
        numeros.Add("Ana ");
        numeros.Add("Betillo");
        numeros.Add("Carlengues");
        numeros.Add("cacahuetes ");
        numeros.Add("Francisco");
        numeros.Add("jjj");
        numeros.Add("peso");
        numeros.Add("QESO ");
       // System.out.println(numeros);

       //numeros.Remove(72);
        numeros.Remove(97);
        System.out.println("/////");
        System.out.println(numeros);
        
      /*  for(int k=0;k<100;k++){
       //   System.out.println("/*"+k);
           if(numeros.primos(k)){
               System.out.println(k);
           } 
    }
       
    
}
