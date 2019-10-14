package buscaminas;

import java.util.Scanner;


public class Buscaminas {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
	int nivel;
        int filaAleatorio, colAleatorio;
        int fila, columna, encontradas;
        Boolean vida=true;
        char buscaMinas [][];
        
        System.out.println("1.- Fácil");
        System.out.println("2.- Medio");
        System.out.println("3.- Avanzado");
        System.out.println("elige el nivel: ");
        nivel=teclado.nextInt();
        
        switch(nivel)
        {
            case 1:
            {
                buscaMinas= new char [10][10];
                for (int x=0; x<10; x++)
                {
                    
                    filaAleatorio= (int) (Math.random() * 9);
                    colAleatorio= (int) (Math.random() * 9);
                   // System.out.println(filaAleatorio +" "+ colAleatorio);
                    buscaMinas[filaAleatorio][colAleatorio]='x';  
                    
                }
                System.out.println("Ingrese las coordenadas (1-10)");
                while (vida)
                {
                    
                    System.out.println("Fila: " );
                    fila=teclado.nextInt()-1;
                    System.out.println("Columna: " );
                    columna=teclado.nextInt()-1;
                    
                    if ((fila <10 && columna <10) && (fila >=0 && columna >=0) )
                    {
                        if (buscaMinas [fila] [columna]== 'x')
                        {
                            System.out.println("Mina encontrada");
                            System.out.println("Fin del Juego");
                            vida=false;
                            
                            for (int x=0; x < 10; x++)
                            {
                                  System.out.print("|");
                                  for (int y=0; y < 10; y++) 
                                  {
                                      if (buscaMinas[x][y]=='x' || buscaMinas[x][y]=='e')
                                        System.out.print (buscaMinas[x][y]);
                                      else
                                          System.out.print(" ");
                                  }
                                   System.out.println("|");
                            }
                        }
                        else 
                        {
                            buscaMinas [fila] [columna]='e';
                           
                           for (int x=0; x < 10; x++)
                            {
                                System.out.print("|");
                                for (int y=0; y < 10; y++) 
                                  {
                                      if (buscaMinas[x][y]=='e')
                                        System.out.print (buscaMinas[x][y]);
                                      else
                                          System.out.print(" ");
                                  }
                                   System.out.println("|");
                            } 
                                
                        }
                    }
                    else
                    {
                        System.out.println("Coordenada fuera del rango");
                    }
                    encontradas=0;
                    for (int x=0; x<buscaMinas.length; x++)
                    {
                        for (int y=0; x<buscaMinas.length; x++)
                        {
                            if (buscaMinas [x][y]=='e')
                            {
                                encontradas++;
                            }
                            
                        }
                    }
                   if (encontradas==90)
                   {
                       System.out.println("Ha ganado");
                       vida=false;
                   }
                    
                    
                }
                
         
               
               break;
            }
            case 2:
            {
                vida=true;
               buscaMinas= new char [20][20];
                for (int x=0; x<35; x++)
                {
                    
                    filaAleatorio= (int) (Math.random() * 19);
                    colAleatorio= (int) (Math.random() * 19);
                    //System.out.println(filaAleatorio +" "+ colAleatorio);
                    buscaMinas[filaAleatorio][colAleatorio]='x';  
                    
                }
                System.out.println("Ingrese las coordenadas (1-20)");
                while (vida)
                {
                    
                    System.out.println("Fila: " );
                    fila=teclado.nextInt()-1;
                    System.out.println("Columna: " );
                    columna=teclado.nextInt()-1;
                    
                    if ((fila <20 && columna <20) && (fila >=0 && columna >=0) )
                    {
                        if (buscaMinas [fila] [columna]== 'x')
                        {
                            System.out.println("Mina encontrada");
                            System.out.println("Fin del Juego");
                            vida=false;
                            
                            for (int x=0; x < 20; x++)
                            {
                                  System.out.print("|");
                                  for (int y=0; y < 20; y++) 
                                  {
                                      if (buscaMinas[x][y]=='x' || buscaMinas[x][y]=='e')
                                        System.out.print (buscaMinas[x][y]);
                                      else
                                          System.out.print(" ");
                                  }
                                   System.out.println("|");
                            }
                        }
                        else 
                        {
                            buscaMinas [fila] [columna]='e';
                        
                             for (int x=0; x < 20; x++)
                            {
                                  System.out.print("|");
                                  for (int y=0; y < 20; y++) 
                                  {
                                      if (buscaMinas[x][y]=='e')
                                        System.out.print (buscaMinas[x][y]);
                                      else
                                          System.out.print(" ");
                                  }
                                   System.out.println("|");
                            }   
                        }
                    }
                    else
                    {
                        System.out.println("Coordenada fuera del rango");
                    }
                    encontradas=0;
                    for (int x=0; x<buscaMinas.length; x++)
                    {
                        for (int y=0; x<buscaMinas.length; x++)
                        {
                            if (buscaMinas [x][y]=='e')
                            {
                                encontradas++;
                            }
                            
                        }
                    }
                   if (encontradas==365)
                   {
                       System.out.println("Ha ganado");
                       vida=false;
                   }
                    
                    
                }
                break;
            }
            case 3:
            {
               vida=true;
               buscaMinas= new char [30][30];
                for (int x=0; x<50; x++)
                {
                    
                    filaAleatorio= (int) (Math.random() * 29);
                    colAleatorio= (int) (Math.random() * 29);
                    //System.out.println(filaAleatorio +" "+ colAleatorio);
                    buscaMinas[filaAleatorio][colAleatorio]='x';  
                    
                }
                System.out.println("Ingrese las coordenadas (1-30)");
                while (vida)
                {
                    
                    System.out.println("Fila: " );
                    fila=teclado.nextInt()-1;
                    System.out.println("Columna: " );
                    columna=teclado.nextInt()-1;
                    
                    if ((fila <30 && columna <30) && (fila >=0 && columna >=0) )
                    {
                        if (buscaMinas [fila] [columna]== 'x')
                        {
                            System.out.println("Mina encontrada");
                            System.out.println("Fin del Juego");
                            vida=false;
                            
                            for (int x=0; x < 30; x++)
                            {
                                  System.out.print("|");
                                  for (int y=0; y < 30; y++) 
                                  {
                                      if (buscaMinas[x][y]=='x' || buscaMinas[x][y]=='e')
                                        System.out.print (buscaMinas[x][y]);
                                      else
                                          System.out.print(" ");
                                  }
                                   System.out.println("|");
                            }
                        }
                        else 
                        {
                            buscaMinas [fila] [columna]='e';
                          for (int x=0; x < 30; x++)
                            {
                                  System.out.print("|");
                                  for (int y=0; y < 30; y++) 
                                  {
                                      if (buscaMinas[x][y]=='e')
                                        System.out.print (buscaMinas[x][y]);
                                      else
                                          System.out.print(" ");
                                  }
                                   System.out.println("|");
                            } 
                                
                        }
                    }
                    else
                    {
                        System.out.println("Coordenada fuera del rango");
                    }
                    encontradas=0;
                    for (int x=0; x<buscaMinas.length; x++)
                    {
                        for (int y=0; x<buscaMinas.length; x++)
                        {
                            if (buscaMinas [x][y]=='e')
                            {
                                encontradas++;
                            }
                            
                        }
                    }
                   if (encontradas==850)
                   {
                       System.out.println("Ha ganado");
                       vida=false;
                   }
            }
                break;
        }
	
        
    }
}
}