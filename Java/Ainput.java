//Abstract to Encapsulation

import java.util.*;

abstract class tsk {
    public abstract void nya();
}

class kit extends tsk {
    Timer timer = new Timer();
    Scanner scans = new Scanner(System.in);
    
    public void nya(){

        System.out.print("Please enter your details\nFull Name: ");
        String n = scans.nextLine();
        System.out.print("Age: ");
        int p = scans.nextInt();
        System.out.println("Please wait for a seconds. .\n");

        
        TimerTask task = new TimerTask() {
            input x = new input(n, p);
            @Override
            public void run() {
                System.out.println("Your data input successfully.\nFull Name: "+x.getName()+"\nAge: "+x.getAge());
                System.exit(0);
               
            }
            
        };
        long delay = 5000;
        timer.schedule(task, delay);
        scans.close();
    }
}