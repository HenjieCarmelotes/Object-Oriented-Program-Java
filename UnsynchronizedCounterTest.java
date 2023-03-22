package threadsandmultiprocessing;

import java.util.Scanner;

/**
 * A demo program to see how hard it is to get an
 * error while using an unsynchronized counter with
 * several threads.  The program runs one or more
 * threads.  Each thread increments the counter a
 * specified number of times.  After all the threads
 * have completed, the value of the counter is 
 * printed out so it can be compared to the correct
 * value.  The user specifies the number of threads
 * and the number of times each thread increments the
 * counter.  (To see an error, the number of increments
 * probably has to be pretty large.  Try 1000000.)
 */
public class UnsynchronizedCounterTest {
    
    /**
     * A class representing a counter with a method for
     * incrementing the counter.  No synchronization is
     * used, so this counter is not "thread-safe".
     */
    static class Counter {
        int count;
        
        void inc() {
            count = count+1;
            //This is actually a sequence of three operations:
            //Step 1. Get the value of count
            //Step 2. Add 1 to the value.
            //Step 3. Store the new value in count
            
            /*
             * In this race condition:
             * it’s possible for that processor to switch from one thread to another at any point.
             * If one thread is between Step 2 and Step 3, another thread starts 
             * executing the same sequence of steps. 
             * Since the first thread has not yet stored the new value in count, 
             * the second thread reads the old value of count and adds one to that old value.
             * Both threads have computed the same new value for count, 
             * and both threads then go on to store that value back into count by executing Step 3.
             * */
            
        }
        int getCount() {
            return count;
        }
    }
    

    static Counter counter;          // The counter that will be incremented.
    static int numberOfIncrements;   // Number of times each thread will increment it.
    
    
    /**
     * The class that defines one of the threads.  The thread
     * simply increments counter numberOfIncrements times, in
     * a for loop.
     */
    static class IncrementerThread extends Thread {
        
    	public void run() {
            for (int i = 0; i < numberOfIncrements; i++) {
                counter.inc();
            }
        }
    }
    
    
    /**
     * The main program runs in a loop until the user wants to exit.
     * Each time through the loop, it runs one experiment.  It gets
     * the number of threads and the number of increments per thread
     * from the user.  It creates and starts the threads, and then
     * waits for them all to finish.  It prints the final value of
     * the counter, as well as the expected value.  The program ends
     * when the user enters a number less than or equal to zero as
     * the number of threads.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  // For reading the user's inputs.
        
        while (true) {
            
            /* Get number of threads and number of increments per thread
             * from the user.  Exit if number of threads is <= 0. */
            
            System.out.println();
            System.out.print("How many threads do you want to run (Enter 0 to end)? ");
            int numberOfThreads = in.nextInt();
            if (numberOfThreads <= 0) 
                break;
            
            do {
                System.out.println();
                System.out.println("How many times should each thread increment the counter? ");
                numberOfIncrements = in.nextInt();
                if (numberOfIncrements < 1) {
                    System.out.println("Number of increments must be positive.");
                    numberOfIncrements = 1;
                }
            } while (numberOfIncrements <= 0);
            
            System.out.println();
            System.out.println("Using " + numberOfThreads + " threads.");
            System.out.println("Each thread increments the counter " 
                                             + numberOfIncrements + " times.");
            
            /* Create the threads and start them. */
            
            System.out.println();
            System.out.println("Working...");
            System.out.println();
            IncrementerThread[] workers = new IncrementerThread[numberOfThreads];
            counter = new Counter();
            for (int i = 0; i < numberOfThreads; i++)
                workers[i] = new IncrementerThread();
            for (int i = 0; i < numberOfThreads; i++)
                workers[i].start();
            
            System.out.println("The threads are still working.");
            /* Wait for all threads to terminate. */
            
            for (int i = 0; i < numberOfThreads; i++) {
                try {
                    workers[i].join();
                }
                catch (InterruptedException e) {
                }
            }
            
            /* Display the results. */
            
            System.out.println("The final value of the counter should be "
                                                     + (numberOfIncrements*numberOfThreads));
            System.out.println("Actual final value of counter is: " + counter.getCount());
            System.out.println();
            System.out.println();
            
        } // end while
        
    } // end main()
    

} // end class UnsynchronizedCounterTest
