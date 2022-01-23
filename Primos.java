public static void main(String[] args) {

  Scanner cin = new Scanner(System.in);
  long GetPrimo = cin.nextLong();
    int contador = 0;
    long sumatorio = 0;
     for(int i = 1; i <= GetPrimo;i++){
     for(int x = 1; x <= GetPrimo;x++){
      
      if(i % x == 0){
       contador = contador + 1;
      }
      if(contador == 2 && x == GetPrimo){
       
       sumatorio = i + sumatorio;
       System.out.println(i);
       
       
      }
      if(x == GetPrimo){
       contador = 0;
      }
     
      
     }
     
      
      }
     System.out.println("La suma total es: "+sumatorio);
     
     }
    } 
