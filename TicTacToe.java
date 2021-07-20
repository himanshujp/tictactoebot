

public class TicTacToe{

   public char a = ' ';
   public char b = ' ';
   public char c = ' ';
   public char d = ' ';
   public char e = ' ';
   public char f = ' ';
   public char g = ' ';
   public char h = ' ';
   public char i = ' ';   
   
      public TicTacToe(){
         a = ' ';
         b = ' ';
         c = ' ';
         d = ' ';
         e = ' ';
         f = ' ';
         g = ' ';
         h = ' ';
         i = ' '; 
        }
        
      public void getBoard(){
      System.out.println("  "+a+"  |  "+b+"  |  "+c+"  \n-----+-----+-----\n  "+d+"  |  "+e+"  |  "+f+"  \n-----+-----+-----\n  "+g+"  |  "+h+"  |  "+i+"  ");
      }
      
      //Noughting squares
      
      public void noughtA(){
         a = 'O';
         }
      public void noughtB(){
         b = 'O';
         }
      public void noughtC(){
         c = 'O';
         }
      public void noughtD(){
         d = 'O';
         }
      public void noughtE(){
         e = 'O';
         }
      public void noughtF(){
         f = 'O';
         }
      public void noughtG(){
         g = 'O';
         }
      public void noughtH(){
         h = 'O';
         }
      public void noughtI(){
         i = 'O';
         }
      
      
      //Crossing squares
      
      public void crossA(){
      a = 'X';
      }
      public void crossB(){
      b = 'X';
      }
      public void crossC(){
      c = 'X';
      }
      public void crossD(){
      d = 'X';
      }
      public void crossE(){
      e = 'X';
      }
      public void crossF(){
      f = 'X';
      }
      public void crossG(){
      g = 'X';
      }
      public void crossH(){
      h = 'X';
      }
      public void crossI(){
      i = 'X';
      }
         
      public void resetBoard(){
      a = ' ';
      b = ' ';
      c = ' ';
      d = ' ';
      e = ' ';
      f = ' ';
      g = ' ';
      h = ' ';
      i = ' ';
      }
   
      
      
      
   // Dummy board layout      
   //    a  |  b  |  c  \n
   //  -----+-----+-----\n
   //    d  |  e  |  f  \n
   //  -----+-----+-----\n
   //    g  |  h  |  i  \n
   
   }