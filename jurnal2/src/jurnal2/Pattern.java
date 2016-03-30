
package jurnal2;


public class Pattern {
    
    public void drawPattern(int i ){
        for (int o = 0; o < 1; o++) {
            
        for (int j = 0; j < i; j++) {

                                for (int k = 0; k < i; k++) {
                                    if ( k >= ( i - j )){
                                        System.out.print("*");
                                    }else{
                                        System.out.print("0");    
                                    }

                                }

                                for (int k = 0; k < i; k++) {
                                    if ( k <= j){
                                        System.out.print("*");
                                    }else{
                                        System.out.print("0");
                                    }
                                }
                                System.out.println("");

                            }

            for (int j = i; j >= 0; j--) {

                for (int k = 0; k < i; k++) {
                    if ( k >= ( i - j )){
                        System.out.print("*");
                    }else{
                        System.out.print("0");    
                    }

                }

                for (int k = 0; k < i; k++) {
                    if ( k <= j){
                        System.out.print("*");
                    }else{
                        System.out.print("0");
                    }
                }
                System.out.println("");

            }            
        }
        
        
    }
    
}
