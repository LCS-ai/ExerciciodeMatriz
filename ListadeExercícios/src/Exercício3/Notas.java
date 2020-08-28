public class Notas {

    public static void main( String[] args )
    {

        int [][] notas = {{0, 1, 2 , 3 , 4, 5, 6, 7, 8, 9},
                                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
                                {50, 51, 52, 53, 54, 55, 56, 57, 58, 59},
                                {60, 61, 62, 63, 64, 65, 66, 67, 68, 69},
                                {70, 71, 72, 73, 74, 75, 76, 77, 78, 79},
                                {80, 81, 82, 83, 84, 85, 86, 87, 88, 89},
                                {90, 91, 92, 93, 94, 95, 96, 97, 98, 99},
                                {100}};
                           
        
                String graph0 = "";
                String graph10 = "";
                String graph20 = "";
                String graph30 = "";
                String graph40 = "";
                String graph50 = "";
                String graph60 = "";
                String graph70 = "";
                String grap80 = "";
                String graph90 = "";
                String graph100 = "";
        
               
        
                int notadoaluno = 0;
                
                for (int i=0; i<10; i++)
                {
                    for (int j=0; j<9; j++)
                    {
                        if(notas[i][j] == notadoaluno)
                        {
                            graph0 = graph0 + "*";
                            break;
                        }                
                    }
                }

                System.out.println(
                    "00-09: "+ graph0 + 
                "\n10-19: " + graph10 + 
                "\n20-29: " + graph20 +
                "\n30-39: " + graph30 +
                "\n40-49: " + graph40 + 
                "\n50-59: " + graph50 +
                "\n60-69: " + graph60 + 
                "\n70-79: " + graph70 +
                "\n80-89: " + grap80 +
                "\n90-99: " + graph90 +
                "\n100: "+ graph100 +);
        
                
    }
}