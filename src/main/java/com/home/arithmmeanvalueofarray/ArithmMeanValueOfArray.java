/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.home.arithmmeanvalueofarray;
import java.io.*;
import java.util.*;
/**
 *
 * @author PC
 */
public class ArithmMeanValueOfArray 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Input a count of elements in array");
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
        var nElems = Integer.parseInt(bufStdIn.readLine());
        var iArray = new int[nElems];
        var nSum = 0;
        var oRnd = new Random();
        for(int i = 0; i < nElems; i++)
        {
            var nItem = oRnd.nextInt(1, 50);
            iArray[i] = nItem;
        }
        System.out.println("Inputed array:");
        for(int i=0; i < nElems; i++)
        {
            nSum += iArray[i];
            System.out.print(iArray[i] + " ");
        }
        float fltMeanVal = (float)nSum / nElems;
        System.out.printf
        (
           "\r\nThe Sum of %d elements of the array is:%d\r\n", 
           nElems, nSum
        );
        System.out.printf
        (
           "\r\nThe Mean Value of %d elements of the array is:%f\r\n", 
           nElems,fltMeanVal 
        );
    }
}
