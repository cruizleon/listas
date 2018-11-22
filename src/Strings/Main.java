/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author BOG-A405-E-024
 */
public class Main {
    
    public static void main (String[]args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ProblemsExamples run=new ProblemsExamples();
        
        int op;
        try{
            do
            {
                bw.write("\nescoja que problema de string List decea probar...\n\n"
                        + "1. itsConfidencial\n2. dna_pride\n3. bin2dec\n4. gcd_string\n"
                        + "5. anagrams\n6. palindromic_string\n7.print_first_occurence\n"
                        + "8. salir\n\n");
                bw.flush();
                op = Integer.parseInt(br.readLine());
                switch(op)
                {
                    case 1: bw.write("\n1. itsConfidencial\n");
                            bw.flush();
                            int cases = Integer.parseInt(br.readLine());
                            for(int i = 0; i < cases; i++)
				bw.write( (run.itsConfidencial( br.readLine() )));
                                bw.flush();
                    break;
                    case 2: bw.write("\n2. dna_pride\n");
                            bw.flush();
                            int ca = Integer.parseInt(br.readLine());
                            int leng;
                            for(int i = 0; i < ca; i++)
                                bw.write( (run.dna_pride( leng = Integer.parseInt(br.readLine()),br.readLine())));
                                bw.flush();
                    break;
                    case 3: int c = Integer.parseInt(br.readLine());
                            for(int i = 0; i < c; i++)
                                bw.write( (run.bin2dec(br.readLine())));
                                bw.flush();
                    break;
                    case 4: bw.write("\n4. gcd_string\n");
                            bw.flush();
                            int n = Integer.parseInt(br.readLine());
                            int a,b;
                            for(int i = 0; i < n; i++)
                                bw.write( (run.gcd_string( a = Integer.parseInt(br.readLine()),b = Integer.parseInt(br.readLine()))));
                                bw.flush();
                    break;
                    case 5: int nu = Integer.parseInt(br.readLine());
                            for(int i = 0; i < nu; i++)
                                bw.write( (run.anagrams( br.readLine(),br.readLine())));
                                bw.flush();
                    break;
                    case 6: bw.write("\n6. palindromic_string\n");
                            bw.flush();
                            bw.write( (run.palindromic_string( br.readLine() )));				
                            bw.flush();
                    break;
                    case 7: bw.write("\n7. print_first_occurence\n");
                            bw.flush();
                            int nume = Integer.parseInt(br.readLine());
                            for(int i = 0; i < nume; i++)
                                bw.write( (run.print_first_occurence( br.readLine())));
                                bw.flush();
                    break;
                    case 8: bw.write("\n...Gracias... \n");
                            bw.flush();
                    break;
                    default: bw.write("opcion incorrecta\n");
                             bw.flush();

                    break;
                }
            }while(op!=8);
        }catch(Exception ex) {}
    }
    
}
