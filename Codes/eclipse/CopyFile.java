import java.io.*;
class CopyFile
{
     public static void main(String[] args) throws IOException
     {
          int i;
          FileInputStream fin;
          FileOutputStream fout;
          try
          {
               fin = new FileInputStream(args[0]);
          }
          catch (FileNotFoundException fnfe)
          {
               fnfe.printStackTrace();
               return;
          }
          try
          {
               fout = new FileOutputStream (args[1]);
          }
          catch (FileNotFoundException fofe)
          {
               fofe.printStackTrace();
               return;
          }
          catch (ArrayIndexOutOfBoundsException ai)
          {
               ai.printStackTrace();
               return;
          }
          try
          {
               do
               {
                    i = fin.read ();
                    if (i != -1)
                    {
                         fout.write(i);
                    }
               }
               while (i != -1);
          }
          catch (IOException ioe)
          {
               ioe.printStackTrace();
          }
          fin.close();
          fout.close();
     }
}