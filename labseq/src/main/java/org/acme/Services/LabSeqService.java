/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.Services;

import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author kalebe
 */

public class LabSeqService {
    
    private final ConcurrentHashMap<Integer, BigInteger> labseq = new ConcurrentHashMap<>();
    
    
    public LabSeqService() {
        labseq.put(0, BigInteger.ZERO);
        labseq.put(1, BigInteger.ONE);
        labseq.put(2, BigInteger.ZERO);
        labseq.put(3, BigInteger.ONE);
    }

    
    public BigInteger labSeqCalc (int n)
    {
        if(labseq.containsKey(n))
        {
            return labseq.get(n);
        } else {
      
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
