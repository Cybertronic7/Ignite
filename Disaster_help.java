
/**
 * Write a description of class Disaster_help here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Disaster_help
{
    
    public static void main()
    {
        homepage();
    }
    public static void homepage()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("DISASTER MANAGEMENT SOFTWARE");
        System.out.println("enter your disaster");
        System.out.println("1.Natural Disasters");
        System.out.println("2.Man made disasters");
        System.out.println("3.Exit program");
        System.out.println("enter number");
        int a = sc.nextInt();
        switch(a)
        {
            case 1 : System.out.print('\u000C');
            Natural();
            break;
            case 2 : System.out.print('\u000C');
            Manmade();
            break;
            case 3 : System.out.print('\u000C');
            Exit();
            break;
            default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            homepage();
            
            
        }
    }
    public static void Natural()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Here is the list of disasters we can prepare you for. Select the number of the disaster you want to learn more about");
        System.out.println("1.Tornados");
        System.out.println("2.Floods");
        System.out.println("3.Earthquake");
        System.out.println("4.Forest Fire");
        System.out.println("5.Hurricane");
        System.out.println("6.Disease Outbreak");
        System.out.println("7.Back to homepage");
        int a = sc.nextInt();
        switch(a)
        {
            case 1 : System.out.print('\u000C');
            Tornados();
            break;
            case 2 : System.out.print('\u000C');
            Floods();
            break;
            case 3 : System.out.print('\u000C');
            Earthquake();
            break;
            case 4 : System.out.print('\u000C');
            ForestFire();
            break;
            case 5 : System.out.print('\u000C');
            Hurricane();
            break;
            case 6 : System.out.print('\u000C');
            Outbreak();
            break;
            case 7 : System.out.print('\u000C');
            homepage();
            break;
            default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Natural();
            
            
        }
    }
    public static void Manmade()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here is the list of disasters we can prepare you for. Select the number of the disaster you want to learn more about");
        System.out.println("1.Industrial accidents");
        System.out.println("2.Acts of terrorism");
        System.out.println("3.Nuclear accident");
        System.out.println("4.Homepage");
        int a = sc.nextInt();
        switch(a)
        {
            case 1 : System.out.print('\u000C');
            Industrial();
            break;
            case 2 : System.out.print('\u000C');
            Terrorism();
            break;
            case 3 : System.out.print('\u000C');
            Nuclear();
            break;
            case 4 : System.out.print('\u000C');
            homepage();
            break;
            default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Manmade();
            
            
        }
    }
    public static void Tornados()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("TORNADOS");
        System.out.println("If you are in a house, go to the lowest level, such as a basement or a storm cellar.");
        System.out.println("If there is no basement, go to an interior room such as a closet, hallway or bathroom.");
        System.out.println("Try to cover your head with a blanket or jacket to guard against flying debris or broken glass. If you are in a mobile home, you should leave immediately and seek shelter elsewhere.");
        System.out.println("If you are outside and cannot get to shelter, crouch beside a strong structure or lie flat in a ditch or low-lying area and try to cover your head and neck.");
        System.out.println("Get as far away from trees and cars as you can.");
        System.out.println("helpline number - 108");
        System.out.println();
         System.out.println();
          System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
          int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Natural();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Tornados();
        }
          
    }
    public static void Floods()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("FLOODS");
        System.out.println("Listen for alerts via radio, television or text for the latest storm information.");
        System.out.println("Be sure to keep your smartphone charged in the event you lose power so you can still receive alerts or call for help.");
        System.out.println("If advised to evacuate, shut of all utilities and evacuate immediately.");
        System.out.println("Move to high ground, avoid rising waters and do not walk or drive through any floodwaters.");
        System.out.println("Stay away from downed power lines and electrical wires.");
        System.out.println("helpline number - 108"); 
        System.out.println();
          System.out.println();
          System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
          int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Natural();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Floods();
        }
    }
    public static void ForestFire()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("FOREST FIRES");
        System.out.println("If advised to evacuate, do so immediately.");
        System.out.println("Wear clothing that can help protect you from flying embers, such as a long-sleeved cotton or wool shirt and pants, and take a wet cotton towel or handkerchief to protect your face.");
        System.out.println("Take your survival kit and choose a route away from fire and smoke. Follow your evacuation plan and be sure everyone knows where to go and what to do.");
        System.out.println("helpline number - 101");
        System.out.println();
          System.out.println();
          System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
          int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Natural();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            ForestFire();
        }
    }
    public static void Earthquake()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("EARTHQUAKE");
        System.out.println("Do not panic. Only move if you need to get away from the danger of falling objects.");
        System.out.println("If you are inside when an earthquake occurs, stay there.");
        System.out.println("Follow the “Drop, Cover, and Hold On” technique: drop to the ground, take cover by getting under a sturdy table or other piece of furniture, and hold on until the shaking stops.");
        System.out.println("Stay away from windows and glass.");
        System.out.println("Do not use the elevators.");
        System.out.println("If you are in bed, stay there and cover your head and neck with a pillow.");
        System.out.println("Once the shaking stops, evacuate the building and be aware of hazardous conditions.");
        System.out.println("If you are outside, get away from buildings, trees and power lines and drop to the ground.");
        System.out.println("If you are in a vehicle, pull over to the side of the road. Do not stop on an overpass, under a bridge, under streetlights or near trees or power lines.");
        System.out.println("If you become trapped under debris, do not move or kick up dust. Cover your mouth with a piece of clothing and shout only as a last resort, as it may cause you to inhale dangerous amounts of dust. Make noise, such as tapping on a pipe or hard object, so rescuers can locate you. Use a whistle if one is available.");
        System.out.println("helpline number - 108"); 
        System.out.println();
          System.out.println();
          System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
          int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Natural();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Earthquake();
        }
    }
    public static void Hurricane()
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("HURRICANE");
       System.out.println("Use a portable radio to listen to important storm updates, information and instructions.");
       System.out.println("Stay inside and keep away from all windows, skylights and glass doors. Go to a safe area, such as an interior room, closet or downstairs bathroom.");
       System.out.println("Never go outside the protection of your home or shelter before there is confirmation that the storm has passed the area. The eye of the storm could create a temporary and deceptive lull, with high winds still approaching.");
       System.out.println("If power is lost, keep the refrigerator closed to keep cold air trapped and delay spoilage of perishable food.");
       System.out.println("If you use a portable generator, follow all the manufacturer’s instructions. Generators should be properly grounded to prevent electrical shock and should never be operated indoors");
       System.out.println("Because generators produce carbon monoxide (CO), make sure you have a working CO detector in your home.");
       System.out.println("helpline number - 108"); 
       System.out.println();
         System.out.println();
         System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
         int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Natural();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Hurricane();
        }
    }
    public static void Outbreak()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take advantage of the vaccine as soon as it is offered, in order to protect yourself and those close to you, and not contribute to the spread of the disease among the general population.");
        System.out.println("Wash your hands often with soap and water or rub them with an alcohol-based antiseptic gel, foam or liquid. Keep such products out of the reach of children.");
        System.out.println("Cough and sneeze without contaminating your environment and avoid touching your nose, eyes and mouth, which are the gateways of virus in the body.");
        System.out.println("Avoid contact with sick people and their personal items.");
        System.out.println("If you have to take care of a sick person, protect yourself from the secretions, and do not drink water or eat food that has been in contact with this person.");
        System.out.println("Avoid contact with animals that appear sick, and avoid handling animals that are found dead.");
        System.out.println("helpline number - 108"); 
        System.out.println();
          System.out.println();
          System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
          int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Natural();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Outbreak();
        }



    }
    public static void Industrial()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("INDUSTRIAL ACCIDENTS");
        System.out.println("Secure the area to prevent further damage or accident");
        System.out.println("Companies, as well as communities should have a plan in place to respond to an industrial disaster. They should also have the proper equipment and training to deal with any scenario.");
        System.out.println("Follow all safety and emergency protocols");
        System.out.println("The best thing to do is to wait for the professionally trained emergency responders to arrive to the scene and then offer your assistance.");
        System.out.println("helpline number - 108"); 
        System.out.println();
          System.out.println();
          System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
          int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Manmade();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Industrial();
        }
    }
    public static void Terrorism()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("TERRORIST ATTACKS");
        System.out.println("Remain calm and be patient.");
        System.out.println("Follow the advice of local emergency officials.");
        System.out.println("Listen to your radio or television for news and instructions.");
        System.out.println("If the event occurs near you, check for injuries. Give first aid and get help for seriously injured people.");
        System.out.println("Call your family contact—do not use the telephone again unless it is a life-threatening emergency.");
        System.out.println("helpline number - 108"); 
        System.out.println();
          System.out.println();
          System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
          int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Manmade();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Terrorism();
        }
          
    }
    public static void Nuclear()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUCLEAR ACCIDENTS");
        System.out.println("If warned of an imminent attack, immediately get inside the nearest building and move away from windows. This will help provide protection from the blast, heat, and radiation of the detonation.");
        System.out.println("If you are outdoors when a detonation occurs take cover from the blast behind anything that might offer protection. Lie face down to protect exposed skin from the heat and flying debris. If you are in a vehicle, stop safely, and duck down within the vehicle.");
        System.out.println("After the shock wave passes, get inside the nearest, best shelter location for protection from potential fallout. You will have 10 minutes or more to find an adequate shelter.");
        System.out.println("Be inside before the fallout arrives. The highest outdoor radiation levels from fallout occur immediately after the fallout arrives and then decrease with time.");
        System.out.println("Stay tuned for updated instructions from emergency response officials. If advised to evacuate, listen for information about routes, shelters, and procedures.");
        System.out.println("If you have evacuated, do not return until you are told it is safe to do so by local officials.");
        System.out.println("helpline number - 108");
        System.out.println();
          System.out.println();
          System.out.println("enter 1 to go back to disaster page or 2 to go back to home page");
          int a = sc.nextInt();
          switch(a)
          {
              case 1 : System.out.print('\u000C');
              Manmade();
              break;
              case 2 : System.out.print('\u000C');
              homepage();
              break;
              default : System.out.print('\u000C');
            System.out.println("choice not found. Please try again");
            Nuclear();
        }
    }
    public static void Exit()
    {
        System.out.println("thank you!!!!");
    }
}
