import java.util.*;

public class Grades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
       
        System.out.println("welcome to the grade card system");
        System.out.println("enter number of subjects");
        count = sc.nextInt();
         int marks[] = new int[count];
         int credits[] = new int[count];
         int gradepoint[] = new int[count];
         int sum = 0;
         int totalcredits = 0;
         float ans = 0;

        
        try{
        for (int i = 0; i < count; i++) {
            System.out.println("enter the marks of" + (i+1) + "subject");
            marks[i]= sc.nextInt();
        }

        for(int i =0; i<count; i++)
        {
                System.out.println("enter the credits of" + (i+1) + "subject");
                credits[i] = sc.nextInt();
        }

        for(int i =0; i<count; i++)
        {
            totalcredits += credits[i];
        }

     
            for(int i=0; i<count; i++)
        {
            if(marks[i]>=85)
            {
                gradepoint[i] = 10;
            }
            else if(marks[i]>=75 && marks[i]<=84)
            {
                 gradepoint[i] = 9;
            }
            else if(marks[i]>=65 && marks[i]<=74){
                gradepoint[i] = 8;
            }
            else if(marks[i]>=55 && marks[i]<=64)
            {
                gradepoint[i] = 7;

            }
            else if(marks[i] >= 45 && marks[i]<=54)
            {
                gradepoint[i] = 6;
            }
            else{
                gradepoint[i] = 5;
            }
            }

         for(int i =0; i<count; i++)
            {
              sum +=  gradepoint[i] * credits[i];
            }
            ans = (float)sum/totalcredits;
	    System.out.println("your cgpa is :")
            System.out.println(ans);

       

         }
    catch(Exception e){
        System.out.println(e+ "  gand ke ghodu sahi values to daal");
    }
    sc.close();

    }

}


/* Contributed fully by -  Purvansh Rathore and partially by Kartavya Bhansali Copyright @PK
idea by K, execution by P
 */
