
public class Main
{
    public static void print(int ile)
    {
        for (int line = 1; line <= ile; line++)
        {
            for (int j = 0; j <= ile - line; j++)
            {
                System.out.print("   ");
            }
            int x = 1;
            for (int i = 1; i <= line; i++) {


                if(x>0 && x<10)
                {
                    if(i<line) System.out.print("_"+ x + "____");
                    else System.out.print("_"+x+"_");
                }
                if(x>9 && x<100)
                {
                    if(i<line) System.out.print("_"+ x + "___");
                    else System.out.print("_"+x+"_");
                }
                if(x>99 && x<1000)
                {
                    if(i<line) System.out.print("_"+ x + "__");
                    else System.out.print("_"+x+"_");
                }
                if(x>999 && x<10000)
                {
                    if(i<line) System.out.print("_"+ x + "_");
                    else System.out.print("_"+x+"_");
                }
                if(x>9999 && x<100000)
                {
                    if(i<line) System.out.print("_"+ x);
                    else System.out.print("_"+x+"_");
                }
                x = x * (line - i) / i;
            }
            System.out.println();

        }
    }

    public static void main(String[] args)
    {
        print(10);
    }
}