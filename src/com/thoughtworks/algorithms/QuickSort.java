/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thoughtworks.algorithms;

/**
 *
 * @author rajesh
 */
public class QuickSort implements Sort{
    
    
    private Integer[] input = new Integer[10];
    
   
    
    /**
     * @deprecated 
     * method sorts numbers which are present in private input variable
     * @return Integer[] an array of sorted Integer array
     */
    public Integer[] sort(){
        
        // sortedNumbers which be returned are beging initilaized here
        // Integer[] sortedNumbers  = new Integer[10];
        
        
        // index for iterating input integer array
        int index = 0;

        // Bubble sort logic begins here
        
        for(index = 0 ; index < getInput().length; index++){
          
            int innerIndex = 0;
            
            for(innerIndex = 0 ; innerIndex < (getInput().length-1); innerIndex++){
                Integer temp = 0;
                
                if(getInput()[innerIndex+1]<getInput()[innerIndex]){
                    temp = getInput()[innerIndex];
                    getInput()[innerIndex] = getInput()[innerIndex+1];
                    getInput()[innerIndex+1] = temp;
                }
                
                
            }
        }
        // Bubble sort logic ends here
        
        return getInput();
    }

    /**
     * @return the input
     */
    public Integer[] getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(Integer[] input) {
        this.input = input;
    }

    @Override
    public Integer[] sort(Integer[] input) {
         int index = 0;

        // Bubble sort logic begins here
        
        for(index = 0 ; index < input.length; index++){
          
            int innerIndex = 0;
            
            for(innerIndex = 0 ; innerIndex < (input.length-1); innerIndex++){
                Integer temp = 0;
                
                if(getInput()[innerIndex+1]<getInput()[innerIndex]){
                    temp = input[innerIndex];
                    input[innerIndex] = input[innerIndex+1];
                    input[innerIndex+1] = temp;
                }
                
                
            }
        }
        return input;
    }
    
    
   
    
}
