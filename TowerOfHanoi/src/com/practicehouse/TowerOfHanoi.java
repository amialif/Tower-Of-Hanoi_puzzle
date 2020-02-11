package com.practicehouse;

/**
 *
 * @author arifur.rahman
 */
public class TowerOfHanoi {

   
    public static void main(String[] args) {
        
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int topN, char from,char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from poll "+ from + " to poll " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from poll " + from + " to poll " + to);
            doTowers(topN - 1, inter, from, to);
        }

    }
    
}
