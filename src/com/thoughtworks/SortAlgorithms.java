/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thoughtworks;

import com.thoughtworks.algorithms.BubbleSort;
import com.thoughtworks.algorithms.QuickSort;
import com.thoughtworks.algorithms.Sort;

import java.util.Arrays;
/**
 *
 * @author rajesh
 */
public class SortAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sort algorigthm = new BubbleSort();
        
        // Declared input for sorting
        Integer[] input = {0,2,3,1};
        
        //bubbleSort.setInput(input);
        
        Integer[] sortedNumbers = algorigthm.sort(input);
        
        System.out.println(Arrays.toString(sortedNumbers));
        
        
        
    }
    
}
