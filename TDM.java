//Time Division Multiplexing

import java.util.*;
class TDM{

  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
    int i,fs,sq=0,n;
    int bt[],wt[],rem_bt[],tat[];
    float atat=0,awt=0;
    System.out.println("Enter the number of stations:- ");
    n=sc.nextInt();
    bt=new int[n];
    wt=new int[n];
    rem_bt=new int[n];
    tat=new int[n];
    System.out.println("Enter the processing time for each stations:- ");
    for(i=0;i<n;i++){

      System.out.printf("Enter for station%d:-\n",i);
      bt[i]=sc.nextInt();
      rem_bt[i]=bt[i];
    }

    System.out.println("Enter the frame size:-");
    fs=sc.nextInt();

    while(true){

      boolean done=true;
      for(i=0;i<n;i++){

        if(rem_bt[i]>0){

          done =false;
          if(rem_bt[i]>fs){

            sq+=fs;
            rem_bt[i]-=fs;
          }
          else{

            sq+=rem_bt[i];
            wt[i]=sq-bt[i];
            rem_bt[i]=0;
          }
        }
        tat[i]=sq;
      }
if(done){

break;
}
    }

System.out.println("-----------------------------------------------------");
System.out.println("Station\t Processing Time\t Completion Time\t Waiting Time");
System.out.println("-----------------------------------------------------");
for(i=0;i<n;i++){
awt+=wt[i];
atat+=tat[i];
System.out.println("\n\t"+(i+1)+"\t\t"+bt[i]+"\t\t"+tat[i]+"\t\t"+wt[i]+"\n");
}

System.out.println("Average Waiting time is:- "+(awt/n));
System.out.println("Average TurnArountime is:- "+(atat/n));

  }

}
