package jvacal.mavenproject1;

public class classifyTriangle {

    public static void main(String[] args) {
        
        
        
        PrintClassifyTriangle(5,5,5);
    
    
    }
    
    
    static int PrintClassifyTriangle(int moew1, int moew2, int moew3) {

        if (moew1 <= 0 || moew2 <= 0 || moew3 <= 0) {
            return 0;
        }

        if (moew1 + moew2 <= moew3 || moew1 + moew3 <= moew2 || moew2 + moew3 <= moew1) {
            return 0;
        }

        if (moew1 == moew2 && moew2 == moew3) {
            return 1;
        }

        if (moew1 == moew2 || moew1 == moew3 || moew2 == moew3) {
            return 2;
        }

        return 3;
    }

}
