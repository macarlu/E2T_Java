public class Fibonacci {
    
    public static void main(String[] args) {
        
        int a = 0, b = 1, c = 0;
        
        System.out.println("******************");
        System.out.println("Serie con for: ");

        for(int i = 0; i < 10; i++){
            if(i < 9){
                System.out.print(a + ", ");
            
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.println(a);
            }
        }
        System.out.println("");
        System.out.println("******************");
        System.out.println("Serie con While: "); 
        int i = 0;
        a = 0;
        b = 1;
        c = a + b;

        while(i < 10){
            if(i < 9){
                System.out.print(a + ", ");
            
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.println(a);
            }
            i++;
        }
        System.out.println("");
        System.out.println("******************");
        System.out.println("Serie con Do-while: "); 
        i = 0;
        a = 0;
        b = 1;
        c = a + b;
        do{
            if(i < 9){
                System.out.print(a + ", ");
            
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.println(a);
            }
            i++;

        }while(i < 10);

    }   
}

