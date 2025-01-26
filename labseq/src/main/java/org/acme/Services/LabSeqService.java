/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.Services;

import java.math.BigInteger;
import java.util.HashMap;

/**
 *
 * @author kalebe
 */

public class LabSeqService {
    
    HashMap<Integer, BigInteger> labseq = new HashMap<Integer, BigInteger>();
    
    public BigInteger labSeqCalc (int n)
    {
        if(labseq.containsKey(n))
        {
            return labseq.get(n);
        } else {
            
            if(n == 0) return BigInteger.ZERO;
            if(n == 1) return BigInteger.ONE;
            if(n == 2) return BigInteger.ZERO;
            if(n == 3) return BigInteger.ONE;

            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            BigInteger c = BigInteger.ZERO;
            BigInteger d = BigInteger.ONE;

            for (int i = 4; i <= n; i++) {
                BigInteger next = a.add(b);
                a = b;
                b = c;
                c = d;
                d = next;
                labseq.put(i, next);
            }

            return d;
        }
    }
}
