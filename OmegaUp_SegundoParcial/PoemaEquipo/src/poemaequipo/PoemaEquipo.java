/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poemaequipo;

/**
 *
 * @author ederj
 */
public class PoemaEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        int dr[DIRECCION]={2,2,1,-1,-2,-2,1,-1};
        int dc[DIRECCION]={1,-1,2,2,1,-1,-2,-2};

        char vis[MAX][FILAS][COLS][FILAS][COLS];
        char poema[MAX];

        char *teclado[2][4]={
                {"qwertyuiop","asdfghjkl;","zxcvbnm,./","**      **"},
        {"QWERTYUIOP","ASDFGHJKL:","ZXCVBNM<>?","**      **"}
        };

        int dfs(int i,int ar,int ac,int br,int bc){
                int d;
                char nc;

                if(poema[i]=='\0')return 1;
                else if(vis[i][ar][ac][br][bc]) return 0;
                vis[i][ar][ac][br][bc]=1;

                for(d=0;d<DIRECCION;d++){
                        int ar_=ar+dr[d];
                        int ac_=ac+dc[d];

                        if(ar_>=0&&ar_<FILAS &&
                                ac_>=0 && ac_ < COLS &&
                                (ar_ != br || ac_ != bc) &&
                                (
                                 (nc = teclado[teclado[0][br][bc] == '*'][ar_][ac_]) == poema[i] ||
                                 nc == '*'
                                 ) &&
                                dfs(i + (nc != '*'), ar_, ac_, br, bc))
                                return 1;
                }

                return dfs(i, br, bc, ar, ac);
        }

        int main(){
                gets(poema);
                printf("%c\n", dfs(0,3,0,3,9) + '0');
                return 0;
        }
    }
    
}
