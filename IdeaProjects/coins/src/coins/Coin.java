/**
 * Copyright (C), 2019-2022, Leslie.
 * FileName: Coin.java
 * Practice for HashMap learning.
 *
 * @author Leslie
 * @Date 03/08/2019
 * @version 1.00
 */
package coins;

import java.util.HashMap;

public class Coin {
    private HashMap<Integer, String> coinNames = new HashMap<Integer, String>();

    /**
     * Add new map.
     *
     * @param amount   Key
     * @param coinname Object
     * @return none
     */
    public void setMap(int amount, String coinname) {
        coinNames.put(amount, coinname);
    }

    /**
     * @param amount Key
     * @return Coin name respongding to the key
     */
    public String getName(int amount) {
        return coinNames.get(amount);
    }

    /**
     * @param args none
     * @return none
     */
    public static void main(String[] args) {

    }
}
