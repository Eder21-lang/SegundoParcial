package quicksort2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class QUICKSORT2 
{
    public static void  Llenar (int nArreglo[])
    {
        System.out.println("Ingrese los datos");
        for (int nPos=0; nPos<nArreglo.length; nPos++)
        {
            nArreglo[nPos]=Teclado.nextInt();
        }
    }
    public static void Quick (int nArreglo[])
    {
        Quick(nArreglo,0,nArreglo.length-1);
    }
    private static void Quick(int nArreglo[], int prim, int ult)
    {
        int i, j, central, pivote;
        central = (prim+ult)/2;
        pivote= nArreglo[central];
        i=prim;
        j=ult;
        do {
            while (nArreglo [i]<pivote)
            {
                i++;
            }
            while (nArreglo[j]>pivote)
            {
                j--;
            }
            if (i<=j)
            {
                Intercambio (nArreglo,i,j);
                i++;
                j--;
            }
        } while (i<=j);
        if (prim<j)
        {
            Quick(nArreglo,prim,j);
        }
        if (i<ult)
        {
            Quick(nArreglo,i,ult);
        }
    }
    public static void Intercambio(int nArreglo[],int i, int j)
    {
        int nTemp;
        nTemp=nArreglo[i];
        nArreglo [i]=nArreglo[j];
        nArreglo[j]=nTemp;
    }
    public static void Ver (int nArreglo[])
    {
        System.out.println("Arreglo:");
        for (int nPos=0; nPos<nArreglo.length;nPos++)
        {
            System.out.println(nArreglo[nPos]);
        }
    }

   static int []  leerArchivo()
    {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      int x=1;
      int numeros []= new int [0];

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:/Users/ederj/Documents/prueba2.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea=br.readLine();
         numeros= new int [Integer.parseInt(linea)];
         int y=0;
         while((linea=br.readLine())!=null)
         {
            numeros[y]=Integer.parseInt(linea);
            y++;
         }
             
         
            
            
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return numeros;
    }
    

            

    static Scanner Teclado= new Scanner(System.in);
    public static void main(String[] args) 
    {
       int nArreglo[] = leerArchivo();
       Quick(nArreglo);
       Ver(nArreglo);
    }
    
}