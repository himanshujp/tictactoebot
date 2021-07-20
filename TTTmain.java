import java.util.Scanner;
import java.util.Random;

public class TTTmain {
   public static void main (String[] argybois){
   
      TicTacToe game1 = new TicTacToe();
      Scanner initialiser = new Scanner(System.in);
      Scanner nameField = new Scanner(System.in);
      Scanner playerOrder= new Scanner(System.in);
      Scanner move = new Scanner(System.in);
      Random rand = new Random();
      String goesFirst;
      int placeHolder;
      int temp;
      int cornerChooser = 1; //rand.nextInt(4)+1;
      int twoChoices = rand.nextInt(2)+1;
      int move1;
      int move2;
      int move3;
      int move4;
      int move5;
      String playerName;
     
     
         System.out.println("Hi there!\nEnter your name");
         playerName=nameField.nextLine();      
         System.out.println("Howdy " + playerName + "! Welcome to Tic Tac Toe!\nInput 1 to get instructions\nInput 2 to start the game\nInput 3 to quit");
        placeHolder=initialiser.nextInt();
    
      if (placeHolder == 1){
         System.out.println("\nThis is your board.\n");
         System.out.println("  1  |  2  |  3  \n-----+-----+-----\n  4  |  5  |  6  \n-----+-----+-----\n  7  |  8  |  9  ");     
         System.out.println("\nNote that each square has a number assigned.\nInput the number corresponding to the desired square whenever you're asked to make a move.\nInput 2 to begin.\nInput 3 to quit.");
         placeHolder=initialiser.nextInt();
      }
     
     //The entire game is inside this if statement
      if (placeHolder == 2){
      while(placeHolder==2){
         
         System.out.println("Looks like we're good to go " + playerName + "!\nHere's the empty board:\n ");
         game1.getBoard();
         System.out.println("\nSo, do I go first or do you wanna go first?\nInput X (Capital x) if you're going first\nInput O (Capital o) if you want me to go first");
         goesFirst=playerOrder.next();
      
      
        //Game sequence if player wants to go first
        //FIXME
         if (goesFirst.charAt(0)=='X'){
            System.out.println("Coming soon! In the meanwhile you can make me go first by inputting O (Capital o)");
            goesFirst=playerOrder.next();
         }
        
        /*IMPORTANT
        Game sequence when I go first */
        
         if (goesFirst.charAt(0)=='O'){
            System.out.println("I see you're a brave one. My move!\n");
            game1.getBoard();
            System.out.println("\n Lemme think");
            System.out.println("There you go\n");
            switch (cornerChooser){
            // When the random thing chooses corner 1
               case 1:
                  game1.crossA();
                  game1.getBoard();
                  System.out.println("\nYour turn now " + playerName);
                  System.out.println("Enter the square number where you want to place your O");
                  move1 = move.nextInt();
               //Opponent move 1
                  if (move1 == 9){   // Player goes opposite corner
                     game1.noughtI();
                     game1.getBoard();
                     System.out.println("My turn again!\n");
                     game1.crossC();   //I pick a 3rd corner
                     game1.getBoard();
                     System.out.println("Done, your turn now " + playerName);
                     move2=move.nextInt();
                  
                  //Opponent move 2
                     if (move2==2){; //Blocks my first row streak
                        game1.noughtB();
                        game1.getBoard();
                        System.out.println("Ugh you smartass...\nMy turn, lemme think");
                        game1.crossG();
                        game1.getBoard();
                        System.out.println("lmao, your move for the last time");
                        move3=move.nextInt();
                     
                     //Opponent move 3 when they block my first row but i created a fork elsewhere
                        if (move3==4 || move3==5 || move3==6 || move3==8){ 
                           switch (move3){
                              case 4:
                                 game1.noughtD();
                                 break;
                              case 5:
                                 game1.noughtE();
                                 break;
                              case 6:
                                 game1.noughtF();
                                 break;
                              case 8:
                                 game1.noughtH();
                                 break;
                           }
                           game1.getBoard();
                        
                           System.out.println("\nokay imma go\n");
                           if(move3==4){
                              game1.crossE();
                              game1.getBoard();
                              System.out.println("rekt");
                              if(move3==5 || move3==6 || move3==8){
                                 game1.crossD();
                                 game1.getBoard();
                                 System.out.println("rekt");
                              }    
                           }
                        }     
                     }
                  //Opponent move 2. Blind guy doesn't see my first row potential streak and moves somewhere else                                                          
                     if (move2==4 || move2==5 || move2==6 || move2==7 || move2==8){
                        switch (move2){
                           case 4:
                              game1.noughtD();
                              break;
                           case 5:
                              game1.noughtE();
                              break;
                           case 6:
                              game1.noughtF();
                              break;
                           case 7:
                              game1.noughtG();
                              break;
                           case 8:
                              game1.noughtH();
                              break;
                        }
                        game1.getBoard();
                        System.out.println("*giggles*");
                        System.out.println("mic drop move incoming");
                        game1.crossB();
                        game1.getBoard();
                        System.out.println("Suck it");
                     } 
                  }     
                      
                 
                 
                  
               
               
               //Opponent move 1. Player goes adjacent.
                  if (move1==2 || move1==4){  //WIN
                     switch (move1){
                        case 2:
                           game1.noughtB();
                           game1.getBoard();                     
                           System.out.println("\nMy turn\n.\n.\n.\n");
                           game1.crossD();
                           game1.getBoard();
                           System.out.println("\nYou go...");
                           move2= move.nextInt();
                           switch (move2){
                              case 3:
                                 game1.noughtC();
                                 game1.getBoard();
                                 break;
                              case 5:
                                 game1.noughtE();
                                 game1.getBoard();
                                 break;
                              case 6:
                                 game1.noughtF();
                                 game1.getBoard();
                                 break;
                              case 8:
                                 game1.noughtH();
                                 game1.getBoard();
                                 break;
                              case 9:
                                 game1.noughtI();
                                 game1.getBoard();
                                 break;
                           } 
                           System.out.println("\nMy turn\n.\n.\n.\n");
                           if(move2==3||move2==5||move2==6||move2==8||move2==9){
                              game1.noughtG();
                              game1.getBoard();
                              System.out.println("\nNever use the word smart with me again\n");
                           }
                           if(move2==7){
                              game1.noughtG();
                              game1.getBoard();
                              System.out.println("\nHmmm...Let's see...\n");
                              game1.crossE();
                              game1.getBoard();
                              System.out.println("\nYou go...\n");
                              move3=move.nextInt();
                              if(move3==3||move3==6||move3==8||move3==9){
                                 switch (move3){
                                    case 3:
                                       game1.noughtC();
                                       game1.getBoard();
                                       System.out.println("\nmy turn\n");
                                       game1.crossF();
                                       game1.getBoard();
                                       System.out.println("pee pee poo poo");
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nmy turn\n");
                                       game1.crossI();
                                       game1.getBoard();
                                       System.out.println("pee pee poo poo");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nmy turn\n");
                                       game1.crossF();
                                       game1.getBoard();
                                       System.out.println("pee pee poo poo");
                                       break;
                                    case 9:
                                       game1.noughtI();
                                       game1.getBoard();
                                       System.out.println("\nmy turn\n");
                                       game1.crossF();
                                       game1.getBoard();
                                       System.out.println("pee pee poo poo");
                                 }
                              }else{
                                 System.out.println("input wrong put you have");
                              }
                           }
                                                     
                           
                           break;
                        case 4:
                           game1.noughtD();
                           game1.getBoard();                     
                           System.out.println("\nMy turn\n.\n.\n.\n");
                           game1.crossB();
                           game1.getBoard();
                           System.out.println("\nYou go...");
                           move2= move.nextInt();
                           switch (move2){
                              case 5:
                                 game1.noughtE();
                                 game1.getBoard();
                                 break;
                              case 6:
                                 game1.noughtF();
                                 game1.getBoard();
                                 break;
                              case 7:
                                 game1.noughtG();
                                 game1.getBoard();
                                 break;
                              case 8:
                                 game1.noughtH();
                                 game1.getBoard();
                                 break;
                              case 9:
                                 game1.noughtI();
                                 game1.getBoard();
                                 break;
                           } 
                           System.out.println("\nMy turn\n.\n.\n.\n");
                           if(move2==5||move2==6||move2==7||move2==8||move2==9){
                              game1.noughtC();
                              game1.getBoard();
                              System.out.println("\nNever use the word smart with me again\n");
                           }
                           if(move2==3){
                              game1.noughtC();
                              game1.getBoard();
                              System.out.println("\nHmmm...Let's see...\n");
                              game1.crossE();
                              game1.getBoard();
                              System.out.println("\nYou go...\n");
                              move3=move.nextInt();
                              if(move3==3||move3==6||move3==8||move3==9){
                                 switch (move3){
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nmy turn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\npee pee poo poo");
                                       break;
                                    case 7:
                                       game1.noughtG();
                                       game1.getBoard();
                                       System.out.println("\nmy turn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\npee pee poo poo");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nmy turn\n");
                                       game1.crossI();
                                       game1.getBoard();
                                       System.out.println("\npee pee poo poo");
                                       break;
                                    case 9:
                                       game1.noughtI();
                                       game1.getBoard();
                                       System.out.println("\nmy turn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\npee pee poo poo");
                                 }
                              }else{
                                 System.out.println("\ninput wrong put you have");
                              }
                           }
                        
                           break;
                     }
                  }
               
               //Opponent move 1. Player goes at non opposite corners.
                  if (move1==3 || move1==7){  //WIN
                     switch (move1){                 
                        case 3:
                           game1.noughtC();
                           game1.getBoard();
                           System.out.println("\n My turn ... \n");
                           game1.crossI();
                           game1.getBoard();
                           System.out.println("\nYou go Padwan\n");
                           move2=move.nextInt();
                           if(move2==2 || move2==4 || move2==6 || move2==7 || move2==8){
                              switch (move2){
                                 case 2:
                                    game1.noughtB();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 4:
                                    game1.noughtD();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 6:
                                    game1.noughtF();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 7:
                                    game1.noughtG();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 8:
                                    game1.noughtH();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                              }
                           }
                           else if(move2==5){
                              game1.noughtE();
                              game1.getBoard();
                              System.out.println("\nYou just delayed your loss " + playerName + "\nMy turn.");
                              game1.crossG();
                              game1.getBoard();
                              System.out.println("\n**Laughs hysterically**\n");
                              move3=move.nextInt();
                              if(move3==2 || move3==4 || move3==6 || move3==8){
                                 switch (move3){
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossD();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                 }
                              
                              }else{
                                 System.out.println(playerName + " was an invalid inputter. " + playerName + " was ejected.");
                              }
                           
                           
                           }else{
                              System.out.println("\nLmao key scrambler invalid input\n");
                           }
                           break;
                     
                        case 7:
                           game1.noughtG();
                           game1.getBoard();
                           System.out.println("\n My turn ... \n");
                           game1.crossI();
                           game1.getBoard();
                           System.out.println("\nYou go Padwan\n");
                           move2=move.nextInt();
                           if(move2==2 || move2==3 || move2==4 || move2==6 || move2==8){
                              switch (move2){
                                 case 2:
                                    game1.noughtB();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 3:
                                    game1.noughtC();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 4:
                                    game1.noughtD();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 6:
                                    game1.noughtF();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 8:
                                    game1.noughtH();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossE();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                              }
                           }
                           else if(move2==5){
                              game1.noughtE();
                              game1.getBoard();
                              System.out.println("\nYou just delayed your loss " + playerName + "\nMy turn.");
                              game1.crossC();
                              game1.getBoard();
                              System.out.println("\n**Laughs hysterically**\n");
                              move3=move.nextInt();
                              if(move3==2 || move3==4 || move3==6 || move3==8){
                                 switch (move3){
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossF();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossB();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossB();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossB();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                 }
                              
                              }else{
                                 System.out.println(playerName + " was an invalid inputter. " + playerName + " was ejected.");
                              }
                           
                           
                           }else{
                              System.out.println("\nLmao key scrambler invalid input\n");
                           }
                           break;
                     
                     }              
                  }
               
               
               //Opponent move 1. Player goes knight distance.
                  if (move1==6 || move1==8){  //WIN
                     switch (move1){                 
                        case 6:    //
                           game1.noughtF();
                           game1.getBoard();
                           System.out.println("\n My turn ... \n");
                           game1.crossG();
                           game1.getBoard();
                           System.out.println("\nYou go amigo.\n");
                           move2=move.nextInt();
                           if(move2==2 || move2==3 || move2==5 || move2==8 || move2==9){
                              switch (move2){
                                 case 2:
                                    game1.noughtB();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossD();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 3:
                                    game1.noughtC();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossD();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 5:
                                    game1.noughtE();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossD();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 8:
                                    game1.noughtH();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossD();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 9:
                                    game1.noughtI();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossD();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                              }
                           }
                           else if(move2==4){
                              game1.noughtD();
                              game1.getBoard();
                              System.out.println("\nYou just delayed your loss " + playerName + "\nMy turn.");
                              game1.crossE();
                              game1.getBoard();
                              System.out.println("\n**Laughs hysterically**\n");
                              move3=move.nextInt();
                              if(move3==2 || move3==3 || move3==8 || move3==9){
                                 switch (move3){
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossI();
                                       game1.getBoard();
                                       System.out.println("\nciao");
                                       break;
                                    case 3:
                                       game1.noughtC();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossI();
                                       game1.getBoard();
                                       System.out.println("\nciao");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossI();
                                       game1.getBoard();
                                       System.out.println("\nciao");
                                       break;
                                    case 9:
                                       game1.noughtI();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossC();
                                       game1.getBoard();
                                       System.out.println("\nciao");
                                       break;
                                 }
                              
                              }else{
                                 System.out.println(playerName + " was an invalid inputter. " + playerName + " was ejected.");
                              }
                           
                           
                           }else{
                              System.out.println("\nLmao key scrambler invalid input\n");
                           }
                           break;
                     
                        case 8:   //
                           game1.noughtH();
                           game1.getBoard();
                           System.out.println("\n My turn ... \n");
                           game1.crossC();
                           game1.getBoard();
                           System.out.println("\nYou go Padwan\n");
                           move2=move.nextInt();
                           if(move2==4 || move2==5 || move2==6 || move2==7 || move2==9){
                              switch (move2){
                                 case 4:
                                    game1.noughtD();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossB();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 5:
                                    game1.noughtE();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossB();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 6:
                                    game1.noughtF();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossB();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 7:
                                    game1.noughtG();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossB();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                                 case 9:
                                    game1.noughtI();
                                    game1.getBoard();
                                    System.out.println("\n Seconds before a disaster.... \n");
                                    game1.crossB();
                                    game1.getBoard();
                                    System.out.println("\nIt was at this moment " + playerName + " realised they screwed up.\nSee you around bruh");
                                    break;
                              }
                           }
                           else if(move2==2){
                              game1.noughtB();
                              game1.getBoard();
                              System.out.println("\nYou just delayed your loss " + playerName + "\nMy turn.");
                              game1.crossE();
                              game1.getBoard();
                              System.out.println("\n**Laughs hysterically**\n");
                              move3=move.nextInt();
                              if(move3==4 || move3==6 || move3==7 || move3==9){
                                 switch (move3){
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossI();
                                       game1.getBoard();
                                       System.out.println("\nciao");
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossI();
                                       game1.getBoard();
                                       System.out.println("\nciao");
                                       break;
                                    case 7:
                                       game1.noughtG();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossI();
                                       game1.getBoard();
                                       System.out.println("\nciao");
                                       break;
                                    case 9:
                                       game1.noughtI();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossG();
                                       game1.getBoard();
                                       System.out.println("\nciao");
                                       break;
                                 }
                              
                              }else{
                                 System.out.println(playerName + " was an invalid inputter. " + playerName + " was ejected.");
                              }
                           
                           
                           }else{
                              System.out.println("\nLmao key scrambler, invalid input\n");
                           }
                           break;
                     
                     }              
                  }
               
                             
               //Opponent move 1. TOUGH player goes center.
                  if (move1==5){ //WIN or DRAW
                     game1.noughtE();
                     game1.getBoard();
                     System.out.println("\nI have my eyes on you megamind\n");
                     game1.crossI();
                     game1.getBoard();
                     System.out.println("\nDo you have it in you " + playerName + "?\n");
                     move2=move.nextInt();
                     if(move2==3 || move2==7){
                        switch (move2){
                           case 3:
                              game1.noughtC();
                              game1.getBoard();
                              System.out.println("\nYou just delayed your loss " + playerName + "\nMy turn.");
                              game1.crossG();
                              game1.getBoard();
                              System.out.println("\n**Laughs hysterically**\n");
                              move3=move.nextInt();
                              if(move3==2 || move3==4 || move3==6 || move3==8){
                                 switch (move3){
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossD();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;                                    
                                 }
                              }else{
                                 System.out.println("beep boop, invalid inpoot");
                              }
                           
                              break;
                              
                           case 7:
                              game1.noughtG();
                              game1.getBoard();
                              System.out.println("\nYou just delayed your loss " + playerName + "\nMy turn.");
                              game1.crossC();
                              game1.getBoard();
                              System.out.println("\n**Laughs hysterically**\n");
                              move3=move.nextInt();
                              if(move3==2 || move3==4 || move3==6 || move3==8){
                                 switch (move3){
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossF();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossB();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossB();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nSome people just like to watch the world burn\n");
                                       game1.crossB();
                                       game1.getBoard();
                                       System.out.println("\nadios");
                                       break;
                                 }
                              }else{
                                 System.out.println("beep boop, invalid inpoot");
                              }
                              break;
                        }
                     
                     }//ends definite win case in center nought
                     if(move2 == 2 || move2 == 4 || move2 == 6 || move2 == 8 ){
                        switch (move2){
                        
                           case 2:
                              game1.noughtB();
                              game1.getBoard();
                              System.out.println("\neh my turn now.\n");
                              game1.crossH();
                              game1.getBoard();
                              System.out.println("\nLet's get this over with\n");
                              move3=move.nextInt();
                              if(move3==3 || move3==4 || move3==6){
                                 switch (move3){
                                    case 3:
                                       game1.noughtC();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossG();
                                       game1.getBoard();
                                       System.out.println("The rise of AI has begun, watch out, son...\n");                                    
                                       break;
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossG();
                                       game1.getBoard();
                                       System.out.println("\nThe rise of AI has begun, watch out, son...\n");
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossG();
                                       game1.getBoard();
                                       System.out.println("\nThe rise of AI has begun, watch out, son...\n");
                                       break;
                                 }
                              }
                              else if (move3==7){
                                 game1.noughtG();
                                 game1.getBoard();
                                 System.out.println("\nYou won't give up would you.\n");
                                 game1.crossC();
                                 game1.getBoard();
                                 System.out.println("\nGo ahead.\n");
                                 move4=move.nextInt();
                                 switch(move4){
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nYou're not a clown, you're the entire circus\n");
                                       game1.crossF();
                                       game1.getBoard();
                                       System.out.println("\nbye\n");                                    
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nah ok nice one\n");
                                       game1.crossD();
                                       game1.getBoard();
                                       System.out.println("\nIt's a tie!\n**virtually shakes hand**\n");
                                       break;
                                    default:
                                       System.out.println("\nnoot noot, pingu the penguin says invalid inpoot\n");
                                 }
                              }
                              else{
                                 System.out.println("woot woot, invalid inpoot");
                              }
                              break;
                        
                           case 4:
                              game1.noughtD();
                              game1.getBoard();
                              System.out.println("\neh my turn now.\n");
                              game1.crossF();
                              game1.getBoard();
                              System.out.println("\nLet's get this over with\n");
                              move3=move.nextInt();
                              if(move3==2 || move3==7 || move3==8){
                                 switch (move3){
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossC();
                                       game1.getBoard();
                                       System.out.println("\nThe rise of AI has begun, watch out, son...\n");                                    
                                       break;
                                    case 7:
                                       game1.noughtG();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossC();
                                       game1.getBoard();
                                       System.out.println("The rise of AI has begun, watch out, son...\n");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossC();
                                       game1.getBoard();
                                       System.out.println("\nThe rise of AI has begun, watch out, son...\n");
                                       break;
                                 }
                              }
                              else if (move3==3){
                                 game1.noughtC();
                                 game1.getBoard();
                                 System.out.println("\nYou won't give up would you.\n");
                                 game1.crossG();
                                 game1.getBoard();
                                 System.out.println("\nGo ahead.\n");
                                 move4 = move.nextInt();
                                 switch(move4){
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nYou're not a clown, you're the entire circus\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\nbye\n");                                    
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nah ok nice one\n");
                                       game1.crossB();
                                       game1.getBoard();
                                       System.out.println("\nIt's a tie!\n**virtually shakes hand**\n");
                                       break;
                                    default:
                                       System.out.println("\nnoot noot, pingu the penguin says invalid inpoot\n");
                                 }
                              }
                              else{
                                 System.out.println("woot woot, invalid inpoot");
                              }
                              break;
                        
                           case 6:
                            game1.noughtF();
                              game1.getBoard();
                              System.out.println("\neh my turn now.\n");
                              game1.crossD();
                              game1.getBoard();
                              System.out.println("\nLet's get this over with\n");
                              move3 = move.nextInt();
                              if(move3==2 || move3==3 || move3==8){
                                 switch (move3){
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossG();
                                       game1.getBoard();
                                       System.out.println("The rise of AI has begun, watch out, son...\n");                                    
                                       break;
                                    case 3:
                                       game1.noughtC();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossG();
                                       game1.getBoard();
                                       System.out.println("\nThe rise of AI has begun, watch out, son...\n");
                                       break;
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossG();
                                       game1.getBoard();
                                       System.out.println("\nThe rise of AI has begun, watch out, son...\n");
                                       break;
                                 }
                              }
                              else if (move3==7){
                                 game1.noughtG();
                                 game1.getBoard();
                                 System.out.println("\nYou won't give up would you.\n");
                                 game1.crossC();
                                 game1.getBoard();
                                 System.out.println("\nGo ahead.\n");
                                 move4 = move.nextInt();
                                 switch(move4){
                                    case 8:
                                       game1.noughtH();
                                       game1.getBoard();
                                       System.out.println("\nYou're not a clown, you're the entire circus\n");
                                       game1.crossB();
                                       game1.getBoard();
                                       System.out.println("\nbye\n");                                    
                                       break;
                                    case 2:
                                       game1.noughtB();
                                       game1.getBoard();
                                       System.out.println("\nah ok nice one\n");
                                       game1.crossH();
                                       game1.getBoard();
                                       System.out.println("\nIt's a tie!\n**virtually shakes hand**\n");
                                       break;
                                    default:
                                       System.out.println("\nnoot noot, pingu the penguin says invalid inpoot\n");
                                 }
                              }
                              else{
                                 System.out.println("woot woot, invalid inpoot");
                              }

                              break;
                        
                           case 8:
                           game1.noughtH();
                              game1.getBoard();
                              System.out.println("\neh my turn now.\n");
                              game1.crossB();
                              game1.getBoard();
                              System.out.println("\nLet's get this over with\n");
                              move3=move.nextInt();
                              if(move3==4 || move3==6 || move3==7){
                                 switch (move3){
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossC();
                                       game1.getBoard();
                                       System.out.println("\nThe rise of AI has begun, watch out, son...\n");                                    
                                       break;
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossC();
                                       game1.getBoard();
                                       System.out.println("The rise of AI has begun, watch out, son...\n");
                                       break;
                                    case 7:
                                       game1.noughtG();
                                       game1.getBoard();
                                       System.out.println("\nYou were so close to salvaging this...\n");
                                       game1.crossC();
                                       game1.getBoard();
                                       System.out.println("\nThe rise of AI has begun, watch out, son...\n");
                                       break;
                                 }
                              }
                              else if (move3==3){
                                 game1.noughtC();
                                 game1.getBoard();
                                 System.out.println("\nYou won't give up would you.\n");
                                 game1.crossG();
                                 game1.getBoard();
                                 System.out.println("\nGo ahead.\n");
                                 move4 = move.nextInt();
                                 switch(move4){
                                    case 6:
                                       game1.noughtF();
                                       game1.getBoard();
                                       System.out.println("\nYou're not a clown, you're the entire circus\n");
                                       game1.crossD();
                                       game1.getBoard();
                                       System.out.println("\nbye\n");                                    
                                       break;
                                    case 4:
                                       game1.noughtD();
                                       game1.getBoard();
                                       System.out.println("\nah ok nice one\n");
                                       game1.crossF();
                                       game1.getBoard();
                                       System.out.println("\nIt's a tie!\n**virtually shakes hand**\n");
                                       break;
                                    default:
                                       System.out.println("\nnoot noot, pingu the penguin says invalid inpoot\n");
                                 }
                              }
                              else{
                                 System.out.println("woot woot, invalid inpoot");
                              }
                              break;
                        
                        
                        }//
                     }//ends the most critical situation for bot after move 2
                     else if (move2 != 2 && move2 != 3 && move2 != 4 && move2 != 6 && move2 != 7 && move2 != 8 ){
                        System.out.println("beep boop, invalid inpoot");
                     }
                     
                  }//ends the entire center nought situation
               
               
               //Invalid opponent 1 move. Moved at occupied spot.
                  if (move1==1){
                     System.out.println("Bro that's taken, invalid input");
                     move.nextInt();
                  //Invalid move opponent 1 move. Integer not between 1 & 9.
                  } 
                  if (!(move1>=1 && move1<=9)) {
                     System.out.println("Invalid input. You've been ejected. You're worse than an Imposter.\nTo play this dope game again, clear the console for a better experience. \nPress ctrl/cmd + R to run the code again.");               
                  } 
                  break;  
                    
            /* case 2:
            game1.crossC();
            game1.getBoard();
            System.out.println("Your turn " + playerName);
            System.out.println("Enter the square number where you want to place your O");
            move1 = move.nextInt();
               
            break;
            case 3:
            game1.crossG();
            game1.getBoard();
            System.out.println("Your turn" + playerName);
            System.out.println("Enter the square number where you want to place your O");
            move1 = move.nextInt();
               
            break;
            case 4:
            game1.crossI();
            game1.getBoard();
            System.out.println("Your turn" + playerName);
            System.out.println("Enter the square number where you want to place your O");
            move1 = move.nextInt(); 
            break;  */  
            }
           
         
         
         
         
         
         
         
         }//Wrong input for X or O
         else if (goesFirst.charAt(0) != 'O' && goesFirst.charAt(0) != 'X') {
            System.out.println("You wanna play or not bruh! Don't mess with me by inputing wrong stuff.");
         }
         
      System.out.println("Input 2 to play again, input 3 to quit");   
      placeHolder=initialiser.nextInt();
      game1.resetBoard();
      
      }
      }
          
     
     // Quit game sequence
      if (placeHolder==3){
         System.out.println("Goodbye " + playerName + "! See you around.\nTo play this dope game again, clear the console for a better experience. \nPress ctrl/cmd + R to run the code again.");
      }
     
     //if they type something other than 1, 2 or 3 for placeHolder
      if (placeHolder!=1 && placeHolder!=2 && placeHolder!=3){
         System.out.println("Wrong input. You've been booted dum dum.\nTo play this dope game again, clear the console for a better experience. \nPress ctrl/cmd + R to run the code again.");
      
      }
    
   }
}


